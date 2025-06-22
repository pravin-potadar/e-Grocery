package com.nt.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
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

    // ✅ Add blog
    public boolean addBlogs(Blog blog, MultipartFile imageFile) {
        try {
            // Ensure upload directory exists
            File uploadDir = new File(UPLOAD_DIR);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }

            // Save image
            String originalFilename = imageFile.getOriginalFilename();
            if (originalFilename == null || originalFilename.isEmpty()) {
                throw new IllegalArgumentException("Invalid image file");
            }

            String fileName = UUID.randomUUID() + "_" + originalFilename.replaceAll("\\s+", "_");
            Path path = Paths.get(UPLOAD_DIR + fileName);
            Files.write(path, imageFile.getBytes());

            // Set image and metadata
            blog.setImageUrl(fileName);
            blog.setDate(LocalDate.now());

            blogRepository.save(blog);
            return true;
        } catch (IOException e) {
            throw new RuntimeException("Error saving blog image", e);
        }
    }

    // ✅ Get all blogs
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    // ✅ Get blog by ID (useful for update/edit operations)
    public Blog getBlogById(int id) {
        Optional<Blog> optional = blogRepository.findById(id);
        return optional.orElse(null);
    }

    // 🔄 Optional: Update existing blog
    public boolean updateBlog(Blog updatedBlog, MultipartFile newImage) {
        try {
            Optional<Blog> optional = blogRepository.findById(updatedBlog.getId());
            if (!optional.isPresent()) {
                return false;
            }

            Blog existing = optional.get();
            existing.setTitle(updatedBlog.getTitle());
            existing.setDescription(updatedBlog.getDescription());
            existing.setConclusion(updatedBlog.getConclusion());
            existing.setDate(LocalDate.now());

            if (newImage != null && !newImage.isEmpty()) {
                // Delete old image
                File oldImage = new File(UPLOAD_DIR + existing.getImageUrl());
                if (oldImage.exists()) oldImage.delete();

                // Save new image
                String fileName = UUID.randomUUID() + "_" + newImage.getOriginalFilename().replaceAll("\\s+", "_");
                Path path = Paths.get(UPLOAD_DIR + fileName);
                Files.write(path, newImage.getBytes());

                existing.setImageUrl(fileName);
            }

            blogRepository.save(existing);
            return true;
        } catch (IOException e) {
            throw new RuntimeException("Error updating blog", e);
        }
    }

    // 🗑️ Optional: Delete blog
    public boolean deleteBlog(int id) {
        Optional<Blog> optional = blogRepository.findById(id);
        if (optional.isPresent()) {
            Blog blog = optional.get();
            File imageFile = new File(UPLOAD_DIR + blog.getImageUrl());
            if (imageFile.exists()) imageFile.delete(); // delete image
            blogRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
