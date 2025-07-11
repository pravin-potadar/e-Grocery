package com.nt.controller.userShow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.entity.Product;
import com.nt.service.ProductsService;

@Controller
public class OrderController {

    @Autowired
    private ProductsService productService;

    @GetMapping("order")
    public String orderPage(@RequestParam("productId") int id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "UserModel/order";
    }
}
