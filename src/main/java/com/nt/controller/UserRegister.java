package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.nt.entity.Users;
import com.nt.service.UserRegisterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class UserRegister {
	
	@Autowired
	private UserRegisterService userRegisterService;
	
	
	@GetMapping("UserRegister")
	public String userRegister() {
		return"LoginAndRegister/userRegistr";
	}
	
	
	
	@GetMapping("userRegisterForm")
	public String addUser( @ModelAttribute Users UserData) {
		
		
		
		 boolean userValidation = userRegisterService.addNewUserRegister(UserData);
		 
		 if(userValidation)
			 return "redirect:index";
		 else
			 return "redirect:UserRegister";
		
	}
	
	
//	@PostMapping("registerForm")
//	public String registerForm(@ModelAttribute Users userData , @RequestParam ("userImageFile") MultipartFile userImageFile) {
//		
//		System.out.println(userData.getFirstName());
//		
//		boolean data = userRegisterService.newUserRegister(userData,userImageFile);
//		
//		if(data == true) {
//			return "redirect:dashboard";
//		}else 
//			return "redirect:/";
//		
//	}

}
