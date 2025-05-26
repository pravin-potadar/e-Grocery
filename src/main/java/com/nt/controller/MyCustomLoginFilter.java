/*
 * package com.nt.controller;
 * 
 * import java.io.IOException; import java.io.PrintWriter; import
 * java.util.Arrays; import java.util.List;
 * 
 * import javax.servlet.*; import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse; import
 * javax.servlet.http.HttpSession;
 * 
 * public class MyCustomLoginFilter implements Filter {
 * 
 * // URIs that don’t require login private static final List<String>
 * ALLOWED_PATHS = Arrays.asList("/", "/userLogin", "/index", "/dashboard",
 * "/userRegisterForm", "/role");
 * 
 * @Override public void init(FilterConfig filterConfig) throws ServletException
 * { // No init logic needed }
 * 
 * @Override public void doFilter(ServletRequest request, ServletResponse
 * response, FilterChain chain) throws IOException, ServletException {
 * 
 * HttpServletRequest req = (HttpServletRequest) request; HttpServletResponse
 * res = (HttpServletResponse) response; String path =
 * req.getRequestURI().substring(req.getContextPath().length());
 * 
 * if (ALLOWED_PATHS.contains(path)) { chain.doFilter(request, response); //
 * allow access return; }
 * 
 * HttpSession session = req.getSession(false); // don't create if not exists if
 * (session != null && session.getAttribute("email") != null) {
 * chain.doFilter(request, response); // already logged in } else {
 * res.setContentType("text/html"); PrintWriter pw = res.getWriter(); pw.
 * write("<h3 style='color:red'>Access Denied. Please <a href='/'>login</a> first.</h3>"
 * ); pw.close(); } }
 * 
 * @Override public void destroy() { // No clean-up logic } }
 */