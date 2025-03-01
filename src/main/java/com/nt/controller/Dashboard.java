package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Dashboard {
	
	@GetMapping("/")
	public String dashboard() {
		return"AdminModel/dashboard";
	}

}
