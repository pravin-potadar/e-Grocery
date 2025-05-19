package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nt.entity.Product;
import com.nt.service.ProductsService;

@Controller
public class Order {

	@Autowired
	private ProductsService productService;

//	@GetMapping("order{id}")
//	public String orderPage(RequestParam int id, Model model) {
//
//		 Product product = productService.productFindById(id);
//
//		model.addAttribute("Products", product);
//
//		return "UserModel/order";
//	}
	
	
	
	@GetMapping("order{id}")
	public String orderPage(@PathVariable int id, Model model) {
	    Product product = productService.productFindById(id);
	    model.addAttribute("product", product); // use lowercase for convention
	    return "UserModel/order"; // JSP or Thymeleaf page
	}


//	@PostMapping("orderNow")
//	public String demo() {
//		return "redirect:orderConfirmation";
//	}

}
