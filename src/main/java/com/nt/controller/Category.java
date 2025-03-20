package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Category {
	
	@GetMapping("category-add")
    public String addCategory() {
    	return"AdminModel/Category/add";
    }
	
	
	
	@GetMapping("category-update")
    public String updateCategory() {
    	return"AdminModel/Category/update";
    }
	
	
	@GetMapping("category-list")
    public String listCategory() {
    	return"AdminModel/Category/list";
    }


}
