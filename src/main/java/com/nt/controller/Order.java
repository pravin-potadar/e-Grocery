package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Order {
	
	@GetMapping("order")
	public String orderPage() {
		return "UserModel/order";
	}
	
	@PostMapping("orderNow")
	public String demo() {
		return"redirect:orderConfirmation";
	}
	

}
