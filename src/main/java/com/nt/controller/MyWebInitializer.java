//package com.nt.controller;
//
//import javax.servlet.FilterRegistration;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//
//import org.springframework.web.WebApplicationInitializer;
//
//public class MyWebInitializer implements WebApplicationInitializer {
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        FilterRegistration.Dynamic loginFilter = servletContext.addFilter("loginFilter", new MyCustomLoginFilter());
//        loginFilter.addMappingForUrlPatterns(null, false, "/*");
//    }
//}
//
