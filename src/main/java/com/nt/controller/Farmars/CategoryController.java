package com.nt.controller.Farmars;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.nt.entity.Category;
import com.nt.entity.Product;
import com.nt.service.CategoryService;
import com.nt.service.ProductsService;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductsService productService;

    // Show category add form
    @GetMapping("/category-add")
    public String addCategoryForm() {
        return "AdminModel/Category/add";
    }

    // Show category update form
    @GetMapping("/category-update")
    public String updateCategoryForm() {
        return "AdminModel/Category/update";
    }

    // Handle Add Category
    @PostMapping("/addCategory")
    public String addCategory(@RequestParam String categoryName,
                              @RequestParam MultipartFile categoryImage) {

        boolean data = categoryService.addCategory(categoryName, categoryImage);
        System.out.println("Category added: " + data);

        return "redirect:/listCategory";
    }

    // List all categories
    @GetMapping("/listCategory")
    public String listCategories(Model model) {
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);
        return "AdminModel/Category/list";
    }

    // Search category by ID (via form input)
    @GetMapping("/searchCategory")
    public String findCategory(@RequestParam String categorySearchData, Model model) {
        try {
            int categoryId = Integer.parseInt(categorySearchData);
            Category category = categoryService.getCategoryFindById(categoryId);
            model.addAttribute("presentCategory", category);
        } catch (NumberFormatException e) {
            model.addAttribute("error", "Invalid Category ID");
        }
        return "AdminModel/Category/update";
    }

    // Search category directly by ID (used in redirect or action buttons)
    @GetMapping("/listSearchCategory")
    public String listCategoryUpdate(@RequestParam int id, Model model) {
        Category category = categoryService.getCategoryFindById(id);
        model.addAttribute("presentCategory", category);
        return "AdminModel/Category/update";
    }

    // Handle update category
    @PostMapping("/updateCategory")
    public String updateCategory(@ModelAttribute Category category,
                                 @RequestParam("image") MultipartFile image) {
        categoryService.updateCategory(category, image);
        return "redirect:/listCategory";
    }

    // ✅ List Products filtered by Category for User View
    @GetMapping("/categoryProducts")
    public String searchCategoryProducts(@RequestParam("searchCategoryId") int categoryId, Model model) {

        Category category = categoryService.getCategoryFindById(categoryId);
        List<Product> allProducts = productService.productsList();

        List<Product> sortByCategory = new ArrayList<>();

        for (Product product : allProducts) {
            if (product.getCategory() != null && product.getCategory().getId() == categoryId) {
                sortByCategory.add(product);
            }
        }

        model.addAttribute("nameFoCategory", category.getName());
        model.addAttribute("productSortByCategory", sortByCategory);

        return "UserModel/categoryProductsShow";
    }
}
