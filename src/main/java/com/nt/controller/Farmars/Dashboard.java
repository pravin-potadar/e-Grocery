package com.nt.controller.Farmars;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Dashboard {
	
	@GetMapping("dashboard")
	public String dashboard() {
		return"AdminModel/dashboard";
	}

}
