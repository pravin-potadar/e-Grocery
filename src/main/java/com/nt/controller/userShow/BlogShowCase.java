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
import com.nt.entity.Users;
import com.nt.service.BlogService;
import com.nt.service.UserService;

@Controller
public class BlogShowCase {

    @Autowired
    private BlogService blogService;

    @Autowired
    private UserService userService;

    // ✅ User-facing blog listing
    @GetMapping("blog")
    public String blogPage(Model model) {
        List<Blog> blogs = blogService.getAllBlogs(); 
        model.addAttribute("blogsData", blogs);
        return "UserModel/blog";
    }

    // ✅ Admin-facing: show add form
    @GetMapping("blog-add")
    public String addBlogForm() {
        return "AdminModel/Blogs/add";
    }
    
    
    @GetMapping("blog-page")
    public String updateBlogForm() {
        return "AdminModel/Blogs/update";
    }

    // ✅ Admin-facing: show update form with data
    @GetMapping("blog-update")
    public String updateBlogForm(@RequestParam int id, Model model) {
        Blog blog = blogService.getBlogById(id);
        if (blog != null) {
            model.addAttribute("blog", blog);
            return "AdminModel/Blogs/update";
        }
        return "redirect:blogs-list";
    }

    // ✅ Save new blog (admin)
    @PostMapping("add-blog")
    public String addBlog(
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam String conclusion,
            @RequestParam MultipartFile imageUrl,
            HttpSession session) {

        String userEmail = (String) session.getAttribute("email");
        if (userEmail == null) return "redirect:/";

        Users user = userService.findByEmail(userEmail);

        Blog blog = new Blog();
        blog.setTitle(title);
        blog.setDescription(description);
        blog.setConclusion(conclusion);
        blog.setUser(user); // associate blog with user

        blogService.addBlogs(blog, imageUrl);
        return "redirect:blogs-list";
    }

    // ✅ Update blog
    @PostMapping("update-blog")
    public String updateBlog(
            @RequestParam int id,
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam String conclusion,
            @RequestParam(required = false) MultipartFile imageUrl) {

        Blog blog = blogService.getBlogById(id);
        if (blog != null) {
            blog.setTitle(title);
            blog.setDescription(description);
            blog.setConclusion(conclusion);
            blogService.updateBlog(blog, imageUrl);
        }
        return "redirect:blogs-list";
    }

    // ✅ Admin-facing: list all blogs
    @GetMapping("blogs-list")
    public String showAllBlogs(Model model) {
        List<Blog> blogs = blogService.getAllBlogs(); 
        model.addAttribute("blogsData", blogs);
        return "AdminModel/Blogs/list";
    }

    // ✅ Delete blog
    @GetMapping("blog-delete")
    public String deleteBlog(@RequestParam int id) {
        blogService.deleteBlog(id);
        return "redirect:blogs-list";
    }
}
