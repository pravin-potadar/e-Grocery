package com.nt.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.nt.dao.BlogRepository;
import com.nt.entity.Blog;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    private static final String UPLOAD_DIR = "Q:\\SPRING\\Spring WebApplication\\e-Grocery\\src\\main\\webapp\\resources\\AdminModel\\img\\BlogImges\\";

    public boolean addBlogs(Blog blog, MultipartFile imageFile) {
        try {
            // Create upload directory if not exists
            File uploadDir = new File(UPLOAD_DIR);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }

            // Generate a unique image file name
            String fileName = UUID.randomUUID() + "_" + imageFile.getOriginalFilename();
            String filePath = UPLOAD_DIR + fileName;

            // Save image file to path
            Path path = Paths.get(filePath);
            Files.write(path, imageFile.getBytes());
            
            blog.setImageUrl(fileName);

            // Set image name and timestamps
//            blog.setImageUrl(fileName);
            blog.setDate(LocalDate.now());
//            blog.setCreatedTime(LocalTime.now());

            // Save blog
            blogRepository.save(blog);
            return true;
        } catch (IOException e) {
            throw new RuntimeException("Error saving blog image", e);
        }
    }

    
    
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

}
