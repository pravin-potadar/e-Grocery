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

    private String saveImageFile(MultipartFile imageFile) throws IOException {
        if (imageFile == null || imageFile.isEmpty()) {
            throw new IllegalArgumentException("Image file is required.");
        }

        String contentType = imageFile.getContentType();
        if (contentType == null || !contentType.startsWith("image/")) {
            throw new IllegalArgumentException("Only image files are allowed.");
        }

        File uploadDir = new File(UPLOAD_DIR);
        if (!uploadDir.exists()) {
            uploadDir.mkdirs();
        }

        String originalFilename = imageFile.getOriginalFilename();
        String safeFilename = UUID.randomUUID() + "_" +
                (originalFilename != null ? originalFilename.replaceAll("\\s+", "_") : "default.png");

        Path path = Paths.get(UPLOAD_DIR).resolve(safeFilename);
        Files.write(path, imageFile.getBytes());

        return safeFilename;
    }

    public boolean addCategory(String categoryName, MultipartFile categoryImage) {
        try {
            String fileName = saveImageFile(categoryImage);

            Category category = new Category(categoryName, fileName, LocalDate.now(), LocalTime.now());
            categoryRepository.save(category);
            return true;
        } catch (Exception e) {
            System.err.println("Error saving category: " + e.getMessage());
            return false;
        }
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryFindById(int id) {
        return categoryRepository.findById(id)
                .orElse(null);
    }

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

            if (image != null && !image.isEmpty()) {
                // Delete old image
                String oldImagePath = UPLOAD_DIR + existing.getImageUrl();
                File oldFile = new File(oldImagePath);
                if (oldFile.exists()) {
                    oldFile.delete();
                }

                // Save new image
                String newFileName = saveImageFile(image);
                existing.setImageUrl(newFileName);
            }

            categoryRepository.save(existing);
            return true;

        } catch (Exception e) {
            System.err.println("Error updating category: " + e.getMessage());
            return false;
        }
    }
}
