package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.entity.Product;
import com.nt.service.ProductsService;

@Controller
public class OrderConfirmation {

	@Autowired
	private ProductsService productService;

	@GetMapping("orderConfirmation{id}")
	public String OrderConfirmationPage(@PathVariable int id, Model model) {

		Product product = productService.productFindById(id);
		model.addAttribute("product", product);

		return "UserModel/orderConfirmation";

	}

	@PostMapping("orderConfirm")
	public String postMethodName() {
		return "redirect:payment";
	}

}
