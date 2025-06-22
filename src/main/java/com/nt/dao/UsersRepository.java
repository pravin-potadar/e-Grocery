package com.nt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
	

	Users findByEmail(String email);

//	Users findByuserId(Integer userId);

//	Optional findById(Integer userId);

}
