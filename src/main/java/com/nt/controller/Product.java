package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Product {
	
	@GetMapping("product-add")
	public String addProduct() {
		return"AdminModel/Product/add";
	}
	
	
	
	@GetMapping("product-update")
	public String updateProduct() {
		return"AdminModel/Product/update";
	}

	
	
	@GetMapping("product-list")
	public String listProduct() {
		return"AdminModel/Product/list";
	}


}
