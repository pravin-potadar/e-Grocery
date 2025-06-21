package com.nt.controller.userShow;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.nt.entity.Blog;
import com.nt.service.BlogService;

@Controller
public class BlogShowCase {
	
	@Autowired
	private BlogService blogService;
	
	
	
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
	
//	@GetMapping("blog-list")
//	public String listBlogs() {
//		
//		return "AdminModel/Blogs/list"; 
//		
//	}
	
	
	@PostMapping("add-blog")
	public String Blogsadd(@RequestParam String title,
	                       @RequestParam String description,
	                       @RequestParam String conclusion,
	                       @RequestParam MultipartFile imageUrl,
	                       HttpSession session) {

	    int userId = (int) session.getAttribute("userId");

	    Blog blog = new Blog();
//	    blog.setUserId(userId);
	    blog.setTitle(title);
	    blog.setDescription(description);
	    blog.setConclusion(conclusion);

	    blogService.addBlogs(blog, imageUrl);

	    return "redirect:blogs-list";
	}
	
	
	
	
	
	
	
	
	
	@GetMapping("blogs-list")
	public String showBlogs(Model model) {
	    List<Blog> blogs = blogService.getAllBlogs(); 
	    
	    // you’ll create this in service
	    
//	    System.out.println(blogs);
	    model.addAttribute("blogsData", blogs);
	    return "AdminModel/Blogs/list"; // this is your JSP page
	}



}