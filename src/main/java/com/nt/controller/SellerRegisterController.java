package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.nt.entity.Users;
import com.nt.service.UserRegisterService;

@Controller
public class SellerRegisterController {

    @Autowired
    private UserRegisterService userRegisterService;

    @GetMapping("/sellerRegister")
    public String sellerRegister() {
        return "LoginAndRegister/sellerRegister";
    }

    @PostMapping("/sellerRegisterForm")
    public String sellerRegisterForm(@ModelAttribute Users userData,
                                     @RequestParam("userImageFile") MultipartFile userImageFile) {

        boolean success = userRegisterService.newUserRegister(userData, userImageFile);
        return success ? "redirect:/dashboard" : "redirect:/sellerRegister";
    }
}
