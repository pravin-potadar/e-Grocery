package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.entity.Users;
import com.nt.service.UserLoginService;

@Controller
public class Login {

	@Autowired
	private UserLoginService userLoginService;

	@GetMapping("/")
	public String loginPage() {
		return "LoginAndRegister/Login";
	}

	@PostMapping("/userLogin")
	public String userLogin(@RequestParam String email,
	                        @RequestParam String password,
	                        Model model,
	                        HttpServletRequest request) {

	    HttpSession session = request.getSession(true);

	    Users currentUser = userLoginService.userLoginService(email);

	    if (currentUser != null && password.equals(currentUser.getPassword())) {
	        session.setAttribute("emailsUser", email);
	        session.setAttribute("UserPassword", password); // Avoid this in real apps
	        session.setAttribute("userId", currentUser.getId());
	        session.setAttribute("role", currentUser.getRole());

	        switch (currentUser.getRole().toLowerCase()) {
	            case "user":
	                return "redirect:/index";
	            case "seller":
	                return "redirect:/dashboard";
	            case "owner":
	                return "redirect:/owner-dashboard";
	        }
	    }

	    model.addAttribute("userEmail", email);
	    model.addAttribute("errorMsg", "Invalid email or password");
	    return "LoginAndRegister/Login";
	}

}
