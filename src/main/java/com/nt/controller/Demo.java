package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo {
	
	@GetMapping("/")
	public String index() {
		return"UserModel/index";
	}

}
