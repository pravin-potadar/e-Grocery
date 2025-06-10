package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String dob;
	private String userImage;
	private String address;
	private String areaPinCode;
	
	private String mobileNo;
	
	private String role;

	public Users() {
		
	}

	public Users(int id, String firstName, String lastName, String email, String password, String dob, String userImage,
			String address, String areaPinCode, String mobileNo, String role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.userImage = userImage;
		this.address = address;
		this.areaPinCode = areaPinCode;
		this.mobileNo = mobileNo;
		this.role = role;
	}
	
	

	
	

}
