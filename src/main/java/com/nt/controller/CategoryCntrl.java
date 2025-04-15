package com.nt.controller;

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
import com.nt.service.CategoryService;

@Controller
public class CategoryCntrl {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("category-add")
	public String addCategoryForm() {
		return "AdminModel/Category/add";
	}

	@GetMapping("category-update")
	public String updateCategoryForm() {

		return "AdminModel/Category/update";
	}

//	@GetMapping("category-list")
//    public String listCategoryForm() {
//		
//    	return"AdminModel/Category/list";
//    }

//	Add Category

	@PostMapping("addCategory")
	public String addCategory(@RequestParam String categoryName, @RequestParam MultipartFile categoryImage) {

		System.out.println(categoryName);

		System.out.println(categoryImage);

		boolean data = categoryService.addCategory(categoryName, categoryImage);

		System.out.println(data);

//		return "AdminModel/Category/list";

		return "redirect:listCategory";
	}

//	List of Category 

	@GetMapping("listCategory")
	public String listCategories(Model model) {
		List<com.nt.entity.Category> categories = categoryService.getAllCategories();

		System.out.println(categories);

		model.addAttribute("categories", categories);
		return "AdminModel/Category/list";
	}

//	search Category  data

	@GetMapping("searchCategory")
	public String findCategory(@RequestParam String categorySearchData, Model model) {

		int CategoryId = Integer.parseInt(categorySearchData);

		Category categoryPresentData = categoryService.getCategoryFindById(CategoryId);
		
		model.addAttribute("presentCategory",categoryPresentData);
		
		return "AdminModel/Category/update";
	}

	@PostMapping("updateCategory")
	public String updateCategory(@ModelAttribute Category updateCategory) {
		
		categoryService.updateCategory(updateCategory);
		
		return "redirect:listCategory";
		
	}

}
