package com.nt.controller.userShow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddToCart {
	
	@GetMapping("addToCart")
	public String addToCartPage(){
		return "UserModel/addToCartList";
	}

}
