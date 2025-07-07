package com.nt.controller.Farmars;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdminProfile {
	
	@GetMapping("adminProfile")
	public String profilePage(){
		return "AdminModel/Profile/AdminProfile";
	}

}
