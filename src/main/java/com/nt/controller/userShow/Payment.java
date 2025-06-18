package com.nt.controller.userShow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Payment {
	
	@GetMapping("payment")
	public String paymentPage() {
		return "UserModel/payment";
	}

}
