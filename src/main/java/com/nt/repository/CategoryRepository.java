package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Category;

import antlr.collections.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

	List findByName(String categorySearchData);

	Category findById(int id);


}
