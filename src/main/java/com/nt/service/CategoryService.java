package com.nt.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.nt.dao.CategoryRepository;
import com.nt.entity.Category;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    private static final String UPLOAD_DIR = "Q:\\SPRING\\Spring WebApplication\\e-Grocery\\src\\main\\webapp\\resources\\AdminModel\\img\\Category\\";

    // Save image file and return its new unique name
    private String saveImageFile(MultipartFile imageFile) throws IOException {
        File uploadDir = new File(UPLOAD_DIR);
        if (!uploadDir.exists()) {
            uploadDir.mkdirs();
        }

        String originalFilename = imageFile.getOriginalFilename();
        String fileName = UUID.randomUUID() + "_" + (originalFilename != null ? originalFilename.replaceAll("\\s+", "_") : "default.png");
        Path path = Paths.get(UPLOAD_DIR + fileName);
        Files.write(path, imageFile.getBytes());

        return fileName;
    }

    // Add new category
    public boolean addCategory(String categoryName, MultipartFile categoryImage) {
        try {
            String fileName = saveImageFile(categoryImage);

            Category category = new Category(categoryName, fileName, LocalDate.now(), LocalTime.now());
            categoryRepository.save(category);
            return true;
        } catch (IOException e) {
            throw new RuntimeException("Error saving category image", e);
        }
    }

    // Get all categories
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Get category by ID
    public Category getCategoryFindById(int id) {
        Optional<Category> optional = categoryRepository.findById(id);
        if (optional.isPresent()) {
            System.out.println("find using id " + optional.get().getName());
            return optional.get();
        } else {
            System.err.println("Category not found with ID: " + id);
            return null;
        }
    }

    // Update existing category
    public boolean updateCategory(Category updateCategory, MultipartFile image) {
        try {
            Optional<Category> optional = categoryRepository.findById(updateCategory.getId());
            if (!optional.isPresent()) {
                System.err.println("Category not found for update with ID: " + updateCategory.getId());
                return false;
            }

            Category existing = optional.get();
            existing.setName(updateCategory.getName());
            existing.setCreatedDate(LocalDate.now());
            existing.setCreatedTime(LocalTime.now());

            // Only replace image if a new one is uploaded
            if (image != null && !image.isEmpty()) {

                // Delete old image from disk
                String oldImagePath = UPLOAD_DIR + existing.getImageUrl();
                File oldImageFile = new File(oldImagePath);
                if (oldImageFile.exists()) {
                    oldImageFile.delete(); // delete old image
                }

                // Save new image
                String fileName = UUID.randomUUID() + "_" + image.getOriginalFilename().replaceAll("\\s+", "_");
                Path path = Paths.get(UPLOAD_DIR + fileName);
                Files.write(path, image.getBytes());

                // Update image URL in DB
                existing.setImageUrl(fileName);
            }

            categoryRepository.save(existing);
            return true;

        } catch (IOException e) {
            throw new RuntimeException("Error updating category", e);
        }
    }

}
