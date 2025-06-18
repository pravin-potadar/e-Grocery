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

import com.nt.entity.Product;
import com.nt.service.CategoryService;
import com.nt.service.ProductsService;

@Controller
public class ProductCntrl {

	@Autowired
	private ProductsService productService;

	@Autowired
	private CategoryService categoryService;

	@GetMapping("product-add")
	public String addProduct(Model model) {

		List<com.nt.entity.Category> categories = categoryService.getAllCategories();

		System.out.println(categories);

		model.addAttribute("categories", categories);

		return "AdminModel/Product/add";
	}

	@GetMapping("product-update")
	public String updateProduct(Model model) {

		List<com.nt.entity.Category> categories = categoryService.getAllCategories();

		System.out.println(categories);

		model.addAttribute("categories", categories);

		return "AdminModel/Product/update";
	}

//	@PostMapping("product-list")
//	public String listProduct() {
//
//		return "AdminModel/Product/list";
//	}

//	add product 

	@PostMapping("addProduct")
	public String productAdd(@ModelAttribute Product products, @RequestParam MultipartFile imgFile) {

		System.out.println(products.getName() + " " + imgFile.getOriginalFilename());

		boolean productStatus = productService.productAdd(products, imgFile);

		System.out.println(productStatus);

		return "redirect:product-list";
	}

	@GetMapping("product-list")
	public String productsList(Model model) {
		java.util.List<Product> ListOfProducts = productService.productsList();

		System.out.println(ListOfProducts);

		model.addAttribute("products", ListOfProducts);

		return "AdminModel/Product/list";
	}

	@GetMapping("searchProduct{id}")
	public String getMethodName(@PathVariable int id , Model model) {
		
		
		
		Product presentProduct = productService.productFindById(id);
		
		List<com.nt.entity.Category> categories = categoryService.getAllCategories();

		System.out.println(categories);

		model.addAttribute("categories", categories);
		
		System.out.println(id  + " " + presentProduct);
		
		
		model.addAttribute("presentProduct", presentProduct);
		
		return "AdminModel/Product/update";
	}
	
	
	
//	Single PAge Show In Module
	
	
	@GetMapping("onClickProductAndShowDatails{id}")
	public String singleProductShow( @PathVariable int id , Model model ) {
		
		Product presentProduct = productService.productFindById(id);
		
		model.addAttribute("productShow", presentProduct);

		return "UserModel/singleProductShow";
		

	}
	
	
//	Product BUy 
	
	@PostMapping("buyProduct")
	public String dami() {
		return "redirect:order";
	}
	
	
	
	
	
}
