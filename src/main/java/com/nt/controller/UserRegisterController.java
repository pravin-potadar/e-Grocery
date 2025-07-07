package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.entity.Users;
import com.nt.service.UserRegisterService;

@Controller
public class UserRegisterController {

    @Autowired
    private UserRegisterService userRegisterService;

    @GetMapping("/UserRegister")
    public String userRegister() {
        return "LoginAndRegister/userRegistr";
    }

    @PostMapping("/userRegisterForm")
    public String addUser(@ModelAttribute Users userData, HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("userFName", userData.getFirstName());
        session.setAttribute("userLName", userData.getLastName());
        session.setAttribute("userEmail", userData.getEmail());

        boolean isSuccess = userRegisterService.addNewUserRegister(userData);
        
        if (isSuccess)
        	return "redirect:index";
        else
        return  "redirect:/UserRegister";
    }
}
