package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class OrderConfirmation {
	
	@GetMapping("orderConfirmation")
	public String OrderConfirmationPage() {
		
		return "UserModel/orderConfirmation";
		
	}
	
	@PostMapping("orderConfirm")
	public String postMethodName() {
		return"redirect:payment";
	}
	

}
