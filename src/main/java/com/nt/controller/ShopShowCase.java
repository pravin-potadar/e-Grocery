package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.entity.Product;
import com.nt.service.CategoryService;
import com.nt.service.ProductsService;

@Controller
public class ShopShowCase {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ProductsService productService;

	@GetMapping("shop")
	public String shop(Model model) {

		List<Product> listOfProducts = productService.productsList();
		
		model.addAttribute("listOfProducts", listOfProducts);

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
