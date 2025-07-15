package com.nt.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Product;
import com.nt.entity.Users;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Integer> {

    // ✅ Use Optional to safely fetch by ID
    Optional<Product> findById(Integer id);

    // ✅ Get all products for a specific user
    List<Product> findByUser(Users user);
}
