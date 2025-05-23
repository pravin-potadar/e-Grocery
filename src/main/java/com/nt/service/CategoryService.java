package com.nt.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.nt.dao.CategoryRepository;
import com.nt.entity.Category;

import antlr.collections.List;

@Service
public class CategoryService {
	
    @Autowired
    private CategoryRepository categoryRepository;

    private static final String UPLOAD_DIR = "Q:\\SPRING\\Spring WebApplication\\e-Grocery\\src\\main\\webapp\\resources\\AdminModel\\img\\Category\\"; // Change path as needed

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
                fileName, // Save path in DB
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
    
    
    public   java.util.List<Category> getAllCategories() {
        return  categoryRepository.findAll();
    }


//	public java.util.List<Category> findCategory(String categorySearchData) {
//		System.out.println("Category service");
//		
//		boolean hasLetters = categorySearchData.matches(".*[a-zA-Z].*");
//        boolean hasNumbers = categorySearchData.matches(".*[0-9].*");
//        
//        if(hasLetters == true || hasNumbers == true) {
//        	
//        	if(hasLetters) {
//        		System.out.println(hasLetters + " first condition");
//        		
//        		java.util.List<Category> data = getAllCategories();
//        		
//        		
//        		
//        		System.out.println(data);
//        		
//        		for (Category currentData : data) {
//					if(currentData.getName().equals(categorySearchData)) {
//						System.out.println(currentData.getName());
//						
//						return (java.util.List<Category>) currentData;
//					}
//				}
//        		
//        	}else if(hasNumbers) {
//        		
//        		System.out.println(hasNumbers + " second condition");
//        		
//        		int id = Integer.parseInt(categorySearchData);
//        		
////        		System.out.println(categoryRepository.findById(id));
//        		
//        		java.util.List<Category> categoryData = categoryRepository.findById(id);
//        		
//        		return categoryData;
//        		
//        	}
//        	
//        }
//		return null;
//        
//		
//	}
    
    
    
    public Category getCategoryFindById(int id) {
    	Category categoryData = (Category) categoryRepository.findById(id);
    	
    	System.out.println("find using id" + categoryData.getName());
    	
    	return categoryData;

	}


	public void updateCategory(Category updateCategory) {
		
		categoryRepository.save(updateCategory);
		
	}
    
    
    
    
}
