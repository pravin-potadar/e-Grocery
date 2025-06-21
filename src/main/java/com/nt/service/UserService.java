package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.UsersRepository;
import com.nt.entity.Users;

@Service
public class UserService {
	
	@Autowired
	private UsersRepository userRepository;

//	public void showProfile() {
//		// TODO Auto-generated method stub
//		
//	}

	public Users findByEmail(String email) {
		
		Users users = userRepository.findByEmail(email);
		
		return users;
	}

}
