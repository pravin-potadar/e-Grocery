package com.nt.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/*")
public class SessionFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String uri = req.getRequestURI();
        HttpSession session = req.getSession(false);

        // Define all publicly accessible paths (allowed without login)
        boolean isPublicPath =
                uri.equals("/") ||
                uri.contains("/userLogin") ||
                uri.contains("/UserRegister") ||
                uri.contains("/userRegisterForm") ||
                uri.contains("/sellerRegister") ||
                uri.contains("/role") ||
                uri.startsWith("/resources") ||
                uri.contains(".css") || uri.contains(".js") ||
                uri.contains(".png") || uri.contains(".jpg");

        if (isPublicPath) {
            chain.doFilter(request, response);
            return;
        }

        // If not a public path, check if session and role exist
        if (session == null || session.getAttribute("role") == null) {
            res.sendRedirect("/"); // Redirect to login page
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

        chain.doFilter(request, response);
    }
}
