package com.nt.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class SessionFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String uri = req.getRequestURI();
        HttpSession session = req.getSession(false);

        // Public paths that don’t require authentication
        boolean isPublicPath = uri.equals("/") ||
                               uri.contains("/userLogin") ||
                               uri.contains("/UserRegister") ||
                               uri.contains("/userRegisterForm") ||
                               uri.startsWith("/resources") ||
                               uri.contains(".css") || uri.contains(".js") || uri.contains(".png") || uri.contains(".jpg");

        if (isPublicPath) {
            chain.doFilter(request, response);
            return;
        }

        // Session and role check
        if (session == null || session.getAttribute("role") == null) {
            res.sendRedirect("/"); // Redirect to login
            return;
        }

        String role = session.getAttribute("role").toString();

        // Role-based access control
        if (uri.contains("/dashboard")) {
            if (!"seller".equalsIgnoreCase(role)) {
                res.sendRedirect("/");
                return;
            }
        } else if (uri.contains("/index")) {
            if (!"user".equalsIgnoreCase(role)) {
                res.sendRedirect("/");
                return;
            }
        } else if (uri.contains("/owner-dashboard")) {
            if (!"owner".equalsIgnoreCase(role)) {
                res.sendRedirect("/");
                return;
            }
        }

        // All checks passed; continue request
        chain.doFilter(request, response);
    }
}
