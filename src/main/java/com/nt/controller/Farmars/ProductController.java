package com.nt.controller.Farmars;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.nt.entity.Category;
import com.nt.entity.Product;
import com.nt.entity.Users;
import com.nt.service.CategoryService;
import com.nt.service.ProductsService;

@Controller
public class ProductController {

    @Autowired
    private ProductsService productService;

    @Autowired
    private CategoryService categoryService;

    // ✅ Load Add Product Form
    @GetMapping("/product-add")
    public String addProductForm(Model model, HttpSession session) {
        Users user = (Users) session.getAttribute("user");
        if (user == null) return "redirect:/";

        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);
        return "AdminModel/Product/add";
    }

    // ✅ Add Product Logic
    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute Product product,
                             @RequestParam("imgFile") MultipartFile imgFile,
                             HttpSession session) {
        Users user = (Users) session.getAttribute("user");
        if (user == null) return "redirect:/";

        productService.productAdd(product, imgFile, user);
        return "redirect:/product-list";
    }

    // ✅ List Products (Current User Only)
    @GetMapping("/product-list")
    public String productsList(HttpSession session, Model model) {
        Users user = (Users) session.getAttribute("user");
        if (user == null) return "redirect:/";

        List<Product> products = productService.getProductsByUser(user);
        model.addAttribute("products", products);
        return "AdminModel/Product/list";
    }

    // ✅ Load Update Form for a Specific Product
    @GetMapping("/product-update/{id}")
    public String updateProductForm(@PathVariable int id, HttpSession session, Model model) {
        Users currentUser = (Users) session.getAttribute("user");
        if (currentUser == null) return "redirect:/";

        Product product = productService.getProductById(id);

        if (product == null || product.getUser() == null || product.getUser().getId() != currentUser.getId()) {
            model.addAttribute("error", "Unauthorized access or product not found.");
            return "redirect:/product-list";
        }

        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("presentProduct", product);
        model.addAttribute("categories", categories);

        return "AdminModel/Product/update";
    }

    // ✅ View Product (User Frontend)
    @GetMapping("/product/view/{id}")
    public String viewSingleProduct(@PathVariable int id, Model model) {
        Product product = productService.getProductById(id);
        if (product == null) {
            model.addAttribute("error", "Product not found.");
            return "redirect:/";
        }
        model.addAttribute("productShow", product);
        return "UserModel/singleProductShow";
    }
}
