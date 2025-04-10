package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.nt.entity.Product;
import com.nt.service.ProductsService;

@Controller
public class ProductCntrl {

	@Autowired
	private ProductsService productService;

	@GetMapping("product-add")
	public String addProduct() {
		return "AdminModel/Product/add";
	}

	@GetMapping("product-update")
	public String updateProduct() {
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

		return"redirect:product-list";
	}

	@GetMapping("product-list")
	public String productsList(Model model) {
		java.util.List<Product> ListOfProducts = productService.productsList();

		System.out.println(ListOfProducts);

		model.addAttribute("products", ListOfProducts);

		return"AdminModel/Product/list";
	}

}
