package com.nt.controller;

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
	public String userLogin(@RequestParam String email, @RequestParam String password, Model model,
			HttpSession session) {

		Users currentUser = userLoginService.userLoginService(email);

		if (currentUser != null && password.equals(currentUser.getPassword())) {
			// Save only necessary data
			
//			Cookie ck = new Cookie();
			
			
			
			session.setAttribute("email", email);
			session.setAttribute("role", currentUser.getRole());

			// Redirect to appropriate page
			if ("user".equalsIgnoreCase(currentUser.getRole())) {
				return "redirect:/index";
			} else if ("seller".equalsIgnoreCase(currentUser.getRole())) {
				return "redirect:/dashboard";
			}
		}

		// Handle login failure
		model.addAttribute("userEmail", email);
		model.addAttribute("errorMsg", "Invalid email or password");
		return "LoginAndRegister/Login";
	}
}
