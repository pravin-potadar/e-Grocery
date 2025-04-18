package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.service.CategoryService;

@Controller
public class ShopShowCase {
	

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("shop")
	public String shop() {
		
		return "UserModel/shop";
		
	}
	
	
//	@GetMapping("CategoryShow")
//	public String listCategoriesForShowCase(Model model) {
//		List<com.nt.entity.Category> categories = categoryService.getAllCategories();
//
//		System.out.println(categories);
//
//		model.addAttribute("categories", categories);
//		return "UserModel/shop";
//	}

}
