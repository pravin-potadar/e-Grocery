package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.entity.CategoryData;



@Controller
public class Category {
	
	@GetMapping("category-add")
    public String addCategoryForm() {
    	return"AdminModel/Category/add";
    }
	
	
	
	@GetMapping("category-update")
    public String updateCategoryForm() {
    	return"AdminModel/Category/update";
    }
	
	
	@GetMapping("category-list")
    public String listCategoryForm() {
    	return"AdminModel/Category/list";
    }
	
	
	
//	Add Category
	
	
	@GetMapping("addCategory")
	public String getMethodName(@ModelAttribute CategoryData category) {
		System.out.println(category.getId());
		System.out.println(category.getCategoryName());
		System.out.println(category.getCategoryImage());
		System.out.println(category.getCurrentDate());
		return "";
	}
	
	


}
