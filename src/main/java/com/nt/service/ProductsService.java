package com.nt.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.nt.entity.Category;
import com.nt.entity.Product;
import com.nt.repository.ProductsRepository;

@Service
public class ProductsService {
	
	@Autowired
	private ProductsRepository productsRepository;
	

	private static final String UPLOAD_DIR = "Q:\\SPRING\\Spring WebApplication\\e-Grocery\\src\\main\\webapp\\resources\\AdminModel\\img\\Products"; // Change
																																						// path
																																						// as
	
	public boolean productAdd(Product products, MultipartFile imgFile) {
	    try {
	        File uploadDir = new File(UPLOAD_DIR);
	        if (!uploadDir.exists()) {
	            uploadDir.mkdirs();
	        }

	        String fileName = UUID.randomUUID() + "_" + imgFile.getOriginalFilename();
	        String filePath = UPLOAD_DIR + File.separator + fileName;

	        Path path = Paths.get(filePath);
	        Files.write(path, imgFile.getBytes());

	        // Save the relative path or filename to the DB
	        products.setImageUrl(fileName); // Assuming your Product entity has a field `image`
	        products.setCreatedDate(LocalDate.now());
	        products.setCreatedTime(LocalTime.now());
	        products.setImageUrl(fileName);
	        
	        productsRepository.save(products);
	        return true;
	    } catch (IOException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
// needed

	

}
