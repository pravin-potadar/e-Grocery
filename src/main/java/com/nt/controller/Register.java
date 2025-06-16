package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Register {
	
	@GetMapping("role")
	public String roleSelect() {
		
	
		return "LoginAndRegister/roleSelect";
	}

}
