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

        // Public paths that don’t need login
        boolean isPublicPath = uri.equals("/") || 
                               uri.contains("/userLogin") || 
                               uri.contains("/UserRegister") || 
                               uri.contains("/userRegisterForm") ||
                               uri.startsWith("/resources");

        if (isPublicPath) {
            chain.doFilter(request, response);
            return;
        }

        // Check if session is active
        if (session == null || session.getAttribute("role") == null) {
            res.sendRedirect("/"); // Redirect to login
            return;
        }

        // Role-based route filtering
        String role = session.getAttribute("role").toString();

        if (uri.contains("dashboard")) {
            // Only seller can access dashboard
            if (!"seller".equalsIgnoreCase(role)) {
                res.sendRedirect("/"); // Redirect to login
                return;
            }
        } else if (uri.contains("index")) {
            // Only user can access index
            if (!"user".equalsIgnoreCase(role)) {
                res.sendRedirect("/"); // Redirect to login
                return;
            }
        }

        // Pass the request along the filter chain
        chain.doFilter(request, response);
    }
}
