package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.UsersRepository;
import com.nt.entity.Users;

@Service
public class UserLoginService {
    
    @Autowired
    private UsersRepository usersRepository;

    public Users userLoginService(String email) {
        Users presentUser = usersRepository.findByEmail(email);
        System.out.println(presentUser + " service page");
        return presentUser;
    }
}
