package com.nt.controller.userShow;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.entity.Product;
import com.nt.service.CategoryService;
import com.nt.service.ProductsService;

@Controller
public class IndexShowCase {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ProductsService productService;

//	@GetMapping("index")
//	public String index(Model model) {
//
//		List<com.nt.entity.Category> categories = categoryService.getAllCategories();
//
//		System.out.println(categories);
//
//		model.addAttribute("categories", categories);
//
//		List<Product> listOfProducts = productService.productsList();
//
//		model.addAttribute("listOfProducts", listOfProducts);
//		
//		return "UserModel/home";
//
////		return "redirect:CategoryShowCase";
//	}
	
	
	
	@GetMapping("index")
	public String index(Model model) {
	    // Get all categories
	    List<com.nt.entity.Category> categories = categoryService.getAllCategories();
	    model.addAttribute("categories", categories);

	    // Get all products
	    List<Product> listOfProducts = productService.productsList();

	    // Shuffle products to show in random order
	    Collections.shuffle(listOfProducts);

	    model.addAttribute("listOfProducts", listOfProducts);

	    return "UserModel/home";
	}

	
	
	

//	This Data will present in user show case  

//	@GetMapping("CategoryShowCase")
//	public String listCategoriesForShowCase(Model model) {
//		List<com.nt.entity.Category> categories = categoryService.getAllCategories();
//
//		System.out.println(categories);
//
//		model.addAttribute("categories", categories);
//		
//		return"redirect:listProductsForShowCase";
//	}

//	@GetMapping("listProductsForShowCase")
//	public String listProductsForShowCase(Model model) {
//		
//		List<Product> listOfProducts= productService.productsList();
//		
//		model.addAttribute("listOfProducts", listOfProducts);
//		return "UserModel/index";
//		
//	}

}
