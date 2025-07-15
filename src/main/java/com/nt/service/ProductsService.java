package com.nt.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.nt.dao.ProductsRepository;
import com.nt.entity.Product;
import com.nt.entity.Users;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    private static final String UPLOAD_DIR = "Q:\\SPRING\\Spring WebApplication\\e-Grocery\\src\\main\\webapp\\resources\\AdminModel\\img\\Products\\";

    // ✅ Add or Update product
    public boolean productAdd(Product product, MultipartFile imgFile, Users user) {
        try {
            // Upload directory
            File uploadDir = new File(UPLOAD_DIR);
            if (!uploadDir.exists()) uploadDir.mkdirs();

            // Save uploaded image file
            if (imgFile != null && !imgFile.isEmpty()) {
                String fileName = UUID.randomUUID() + "_" + imgFile.getOriginalFilename().replaceAll("\\s+", "_");
                Path path = Paths.get(UPLOAD_DIR).resolve(fileName);
                Files.write(path, imgFile.getBytes());
                product.setImageUrl(fileName);
            }

            // Set metadata
            product.setCreatedDate(LocalDate.now());
            product.setCreatedTime(LocalTime.now());
            product.setUser(user); // ✅ Important: assign owner

            productsRepository.save(product);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // ✅ List all products (for admin)
    public List<Product> productsList() {
        return productsRepository.findAll();
    }

    // ✅ Get one product by ID
    public Product getProductById(int id) {
        return productsRepository.findById(id).orElse(null);
    }

    // ✅ Get products by category
    public List<Product> getCategoryProducts(int categoryId) {
        List<Product> allProducts = productsRepository.findAll();
        List<Product> categoryProducts = new ArrayList<>();
        for (Product product : allProducts) {
            if (product.getCategory() != null && product.getCategory().getId() == categoryId) {
                categoryProducts.add(product);
            }
        }
        return categoryProducts;
    }

    // ✅ Get products by user (for logged-in farmer)
    public List<Product> getProductsByUser(Users user) {
        return productsRepository.findByUser(user);
    }
}
