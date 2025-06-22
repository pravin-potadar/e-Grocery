package com.nt.controller.userShow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nt.entity.Product;
import com.nt.service.ProductsService;

@Controller
public class OrderController {

    @Autowired
    private ProductsService productService;

    @GetMapping("order{id}")
    public String orderPage(@PathVariable int id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "UserModel/order";
    }
}
