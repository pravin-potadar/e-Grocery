package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoPurpose {
	
	@GetMapping("allOrders")
	public String allOrders() {
		return "AdminModel/Orders/allOrders";
	}
	
	@GetMapping("canceled")
	public String canceled() {
		return "AdminModel/Orders/canceled";
	}
	@GetMapping("completed")
	public String completed() {
		return "AdminModel/Orders/completed";
	}
	@GetMapping("pending")
	public String pending() {
		return "AdminModel/Orders/pending";
	}
	@GetMapping("allPayments")
	public String allPayments() {
		return "AdminModel/Payment/allPayments";
	}
	@GetMapping("payouts")
	public String payouts() {
		return "AdminModel/Payment/payouts";
	}
	@GetMapping("refunds")
	public String refunds() {
		return "AdminModel/Payment/refunds";
	}
	

}
