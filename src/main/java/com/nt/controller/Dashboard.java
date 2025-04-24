package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Dashboard {
	
//	@GetMapping("/")
	public String dashboard() {
		return"AdminModel/dashboard";
	}

}
