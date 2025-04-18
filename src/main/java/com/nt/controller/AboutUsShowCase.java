package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.service.CategoryService;

@Controller
public class AboutUsShowCase {
	
	@Autowired
	private CategoryService categoryService;
	
	
	@GetMapping("aboutUs")
	public String aboutUs() {
		
		return "UserModel/aboutUs";
		
	}

}
