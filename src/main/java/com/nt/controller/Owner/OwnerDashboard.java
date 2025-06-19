package com.nt.controller.Owner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class OwnerDashboard {
	
	@GetMapping("owner-dashboard")
	public String ownerDashbord() {
		return"Owner/dashboard";
	}
	

}
