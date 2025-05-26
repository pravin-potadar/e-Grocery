package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogShowCase {
	
	
	
	@GetMapping("blog")
	public String blog() {
		
		return "UserModel/blog";
		
	}
	
	
	@GetMapping("blog-add")
	public String addBlogs() {
		
		return "AdminModel/Blogs/add";
		
	}
	
	@GetMapping("blog-update")
	public String updateBlog() {
		
		return "AdminModel/Blogs/update";
		
	}
	
	@GetMapping("blog-list")
	public String listBlogs() {
		
		return "AdminModel/Blogs/list";
		
	}

}
