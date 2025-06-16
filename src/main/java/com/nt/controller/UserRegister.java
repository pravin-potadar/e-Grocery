package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.nt.entity.Users;
import com.nt.service.UserRegisterService;


@Controller
public class UserRegister {
	
	@Autowired
	private UserRegisterService userRegisterService;
	
	
	@GetMapping("UserRegister")
	public String userRegister() {
		return"LoginAndRegister/userRegistr";
	}
	
	
	
	@GetMapping("userRegisterForm")
	public String addUser( @ModelAttribute Users UserData , HttpServletRequest reqSession) {
		
	 HttpSession session = reqSession.getSession();
		
	 session.setAttribute("userFName", UserData.getFirstName());
	 session.setAttribute("userLName", UserData.getLastName());
	 session.setAttribute("userEmail", UserData.getEmail());
		
		 boolean userValidation = userRegisterService.addNewUserRegister(UserData);
		 
		 if(userValidation)
			 return "redirect:index";
		 else
			 return "redirect:UserRegister";
		
	}
	
	


}
