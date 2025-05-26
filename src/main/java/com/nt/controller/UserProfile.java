package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserProfile {
	
	@GetMapping("UserProfile")
	public String profilePage() {
		
		return "UserModel/userProfile";
		
		
	}

}
