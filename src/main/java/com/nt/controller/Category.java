package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.nt.service.CategoryService;



@Controller
public class Category {
	
	
	@Autowired
	private CategoryService categoryService;
	
	
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
	
	
	
	@PostMapping("addCategory")
	public void getMethodName(@RequestParam String categoryName, @RequestParam MultipartFile categoryImage) {
		
		System.out.println(categoryName);
		
		System.out.println(categoryImage);
		
		boolean data = categoryService.addCategory(categoryName,categoryImage);
		
		System.out.println(data);
	}
	
	


}
