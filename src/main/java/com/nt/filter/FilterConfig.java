//package com.nt.filter;
//
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class FilterConfig {
//
//    @Bean
//    public FilterRegistrationBean<MyCustomFilter> loggingFilter(){
//        FilterRegistrationBean<MyCustomFilter> registrationBean = new FilterRegistrationBean<>();
//
//        registrationBean.setFilter(new MyCustomFilter());
//        registrationBean.addUrlPatterns("/*");  // Filter applies to all URLs
//        registrationBean.setOrder(1);           // Order if multiple filters
//
//        return registrationBean;
//    }
//}
//
