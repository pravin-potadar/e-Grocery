package com.nt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

}
