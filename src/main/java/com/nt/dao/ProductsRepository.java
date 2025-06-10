package com.nt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Product;

import antlr.collections.List;

@Repository
public interface ProductsRepository extends JpaRepository<Product , Integer> {
	
	Product findById(int id);

	

}
