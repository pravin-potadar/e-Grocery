package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserRegister {
	
	
	@GetMapping("register")
	public String register() {
		return"LoginAndRegister/Register";
	}

}
