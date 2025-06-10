//package com.nt.filter;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//
//public class MyCustomFilter implements Filter {
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        // Initialization logic (optional)
//    }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//            throws IOException, ServletException {
//
//        HttpServletRequest req = (HttpServletRequest) request;
//        System.out.println("Request URI is: " + req.getRequestURI().contains("/"));
//
//        // Continue the filter chain
//        chain.doFilter(request, response);
//    }
//
//    @Override
//    public void destroy() {
//        // Cleanup logic (optional)
//    }
//}
