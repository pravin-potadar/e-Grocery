package com.nt.controller.userShow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.entity.Product;
import com.nt.service.ProductsService;

@Controller
public class OrderConfirmation {

	@Autowired
	private ProductsService productService;

//	@GetMapping("orderConfirmation{id}")
//	public String OrderConfirmationPage(@PathVariable int id, Model model) {
//
//		Product product = productService.productFindById(id);
//		model.addAttribute("product", product);
//
//		return "UserModel/orderConfirmation";
//
//	}
	
	
	
	
	
	
	 @PostMapping("orderConfirmation{id}")
	    public String confirmOrder(@PathVariable("id") int productId,
	                               @RequestParam("quantity") int quantity,
	                               @RequestParam("totalPrice") double totalPrice,
	                               Model model) {

	        // Get product from DB
	        Product product = productService.productFindById(productId);

	        // Send data to confirmation page
	        model.addAttribute("product", product);
	        model.addAttribute("quantity", quantity);
	        model.addAttribute("netAmount", totalPrice); // Optional: you can rename

	        return "UserModel/orderConfirmation";
	    }
	 
	 
	 

//	@PostMapping("orderConfirm")
//	public String postMethodName() {
//		return "redirect:payment";
//	}

	 
	  @PostMapping("/orderConfirm")
	    public String orderToPayment(
	            @RequestParam("productId") int productId,
	            @RequestParam("quantity") int quantity,
	            @RequestParam("netAmount") double netAmount,
	            @RequestParam("landmark") String landmark,
	            @RequestParam("fullAddress") String fullAddress,
	            @RequestParam("pinCode") String pinCode,
	            Model model) {

	        // Fetch product from DB
	        Product product = productService.productFindById(productId);

	        // Add all data to model for payment page
	        model.addAttribute("product", product);
	        model.addAttribute("quantity", quantity);
	        model.addAttribute("netAmount", netAmount);
	        model.addAttribute("landmark", landmark);
	        model.addAttribute("fullAddress", fullAddress);
	        model.addAttribute("pinCode", pinCode);

	        // ✅ Forward to payment.jsp
	        return "UserModel/payment";  // Create payment.jsp accordingly
	    }
	 
	 
	 
}
