package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserLogin {
	
//	@GetMapping("/")
	public String login() {
		return"LoginAndRegister/Login";
	}

}
