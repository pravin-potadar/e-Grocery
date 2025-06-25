package com.nt.controller.Farmars;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.nt.entity.Category;
import com.nt.entity.Product;
import com.nt.service.CategoryService;
import com.nt.service.ProductsService;

@Controller
public class ProductController {

    @Autowired
    private ProductsService productService;

    @Autowired
    private CategoryService categoryService;

    // Load add product form
    @GetMapping("/product-add")
    public String addProductForm(Model model) {
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);
        return "AdminModel/Product/add";
    }

    // Load update form
    @GetMapping("/product-update")
    public String updateProductForm(Model model) {
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);
        return "AdminModel/Product/update";
    }

    // Add product with image
    @PostMapping("addProduct")
    public String addProduct(@ModelAttribute Product product,
                             @RequestParam MultipartFile imgFile) {
        boolean status = productService.productAdd(product, imgFile);
        return "redirect:product-list";
    }

    // List products
    @GetMapping("product-list")
    public String productsList(Model model) {
        List<Product> products = productService.productsList();
        model.addAttribute("products", products);
        return "AdminModel/Product/list";
    }

    // Load product into update form
    @GetMapping("/searchProduct/{id}")
    public String searchProductById(@PathVariable int id, Model model) {
        Product product = productService.getProductById(id);
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);
        model.addAttribute("presentProduct", product);
        return "AdminModel/Product/update";
    }

    // User view: single product page
    @GetMapping("/product/view/{id}")
    public String viewSingleProduct(@PathVariable int id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("productShow", product);
        return "UserModel/singleProductShow";
    }

    // Product buy redirection (future logic can go here)
//    @PostMapping("/buyProduct")
//    public String buyProduct() {
//        return "redirect:/order";
//    }
}
