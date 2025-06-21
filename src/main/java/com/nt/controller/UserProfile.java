package com.nt.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.entity.Users;
import com.nt.service.UserService;

@Controller
public class UserProfile {
	
	@Autowired
	private UserService userService;
	
	
	
//	@GetMapping("UserProfile")
//	public String profilePage() {
//		
//		return "UserModel/userProfile";
//		
//		
//	}
	
//	public void showProfile() {
//		
//		userService.showProfile();
//		
//	}
	
	
	 @GetMapping("/UserProfile")
	    public String showProfile(HttpSession session, Model model) {
	        String email = (String) session.getAttribute("emailsUser"); 
	        
	        // ✅ Get user from session
	        
	        Users user = userService.findByEmail(email);
	        
	        
	        if (user != null) {
	            model.addAttribute("user", user);
	            return "UserModel/userProfile";
	        } else {
	            return "redirect:/login";  // If no user in session, redirect to login
	        }
	    }

}
