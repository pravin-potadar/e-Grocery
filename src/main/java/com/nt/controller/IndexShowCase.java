package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.service.CategoryService;

@Controller
public class IndexShowCase {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("index")
	public String index() {
		
		return"redirect:CategoryShowCase";
	}
	
	
//	This Data will present in user show case  
	
	@GetMapping("CategoryShowCase")
	public String listCategoriesForShowCase(Model model) {
		List<com.nt.entity.Category> categories = categoryService.getAllCategories();

		System.out.println(categories);

		model.addAttribute("categories", categories);
		return "UserModel/index";
	}

}
