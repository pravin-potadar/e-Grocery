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
import com.nt.repository.CategoryRepository;

import antlr.collections.List;

@Service
public class CategoryService {
	
    @Autowired
    private CategoryRepository categoryRepository;

    private static final String UPLOAD_DIR = "Q:\\SPRING\\Spring WebApplication\\e-Grocery\\src\\main\\webapp\\resources\\AdminModel\\img\\Category"; // Change path as needed

    public boolean addCategory(String categoryName, MultipartFile categoryImage) {
    	
    	
        try {
        	
        	System.out.println(categoryName);
            // Create directory if not exists
            File uploadDir = new File(UPLOAD_DIR);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }

            // Generate a unique file name
            String fileName = UUID.randomUUID() + "_" + categoryImage.getOriginalFilename();
            String filePath = UPLOAD_DIR + fileName;

            // Save file
            Path path = Paths.get(filePath);
            Files.write(path, categoryImage.getBytes());

            // Create Category object with file path
            Category category = new Category(
                categoryName,
                filePath, // Save path in DB
                LocalDate.now(),
                LocalTime.now()
            );

            categoryRepository.save(category);
            return true;
        } catch (IOException e) {
            throw new RuntimeException("Error saving category image", e);
        }
    }
    
    
//    list of category 
    
    
    public List getAllCategories() {
        return (List) categoryRepository.findAll();
    }
}
