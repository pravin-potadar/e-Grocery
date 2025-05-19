package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.entity.Users;
import com.nt.service.UserLoginService;


@Controller
public class Login {
	
	@Autowired
	private UserLoginService userLoginService;
	
	
	@GetMapping("/")
	public String login() {
		return"LoginAndRegister/Login";
	}
	
	
	@PostMapping("userLogin")
	public String userLogin(@RequestParam String email , @RequestParam String password, Model model) {
		
		Users currentUser =  userLoginService.userLoginService(email);
		
		System.out.println(currentUser);
		
		// (Small fix below, comparing strings using equals, not '==')
        if (currentUser != null && email.equals(currentUser.getEmail()) && 
            password.equals(currentUser.getPassword())) {
        	
        	if(currentUser.getRole().equals("user")) {
        		
        		
        		return "redirect:index";
        	}else if(currentUser.getRole().equals("seller")) {
        		return "redirect:dashboard";
        	}    		
            	
            	
        	
            
        }
        model.addAttribute("userEmail",email);
		model.addAttribute("userPass",password);
    	model.addAttribute("errorMsg","Invalid username or password");
        return"LoginAndRegister/Login";
	}
	

}
