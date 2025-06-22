package com.nt.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.nt.dao.ProductsRepository;
import com.nt.entity.Product;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    private static final String UPLOAD_DIR = "Q:\\SPRING\\Spring WebApplication\\e-Grocery\\src\\main\\webapp\\resources\\AdminModel\\img\\Products\\";

    public boolean productAdd(Product product, MultipartFile imgFile) {
        try {
            File uploadDir = new File(UPLOAD_DIR);
            if (!uploadDir.exists()) uploadDir.mkdirs();

            String fileName = UUID.randomUUID() + "_" + imgFile.getOriginalFilename().replaceAll("\\s+", "_");
            Path path = Paths.get(UPLOAD_DIR).resolve(fileName);
            Files.write(path, imgFile.getBytes());

            product.setImageUrl(fileName);
            product.setCreatedDate(LocalDate.now());
            product.setCreatedTime(LocalTime.now());

            productsRepository.save(product);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Product> productsList() {
        return productsRepository.findAll();
    }

    public Product getProductById(int id) {
        return productsRepository.findById(id);
    }

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

	
}
