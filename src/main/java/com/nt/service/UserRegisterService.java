package com.nt.service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.nt.dao.UsersRepository;
import com.nt.entity.Users;

@Service
public class UserRegisterService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	private static final String UPLOAD_DIR = "Q:\\SPRING\\Spring WebApplication\\e-Grocery\\src\\main\\webapp\\resources\\LoginAndRegister\\UsersImg"; // Change
	

	public boolean newUserRegister(Users userData, MultipartFile userImageFile) {
		
		try {
			
			File uploadDir = new File(UPLOAD_DIR);
			if (!uploadDir.exists()) {
				uploadDir.mkdirs();
			}
			
			String fileName = UUID.randomUUID() + "_" + userImageFile.getOriginalFilename();
			String filePath = UPLOAD_DIR + File.separator + fileName;
			
			Path path = Paths.get(filePath);
			Files.write(path, userImageFile.getBytes());
//			
//			userData.setFirstName(userData.getFirstName());
//			userData.setLastName(userData.getLastName());
			userData.setUserImage(fileName);
			
			
			usersRepository.save(userData);
			
			return true;

			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}


	public boolean addNewUserRegister(Users userData) {
		Users presentUser = usersRepository.save(userData);
		
		if(presentUser != null)
			return true;
		else
		return false;
		
	}


	

}
