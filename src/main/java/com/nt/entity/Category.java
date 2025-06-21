package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String imageUrl; // Store image path instead of byte[]

    private LocalDate createdDate;
    private LocalTime createdTime;
    
    private String status;
    
    
    @OneToMany(mappedBy = "category")
    private List<Product> products;

	
    
    public Category() {
    	
	}


	public Category(String name, String imageUrl, LocalDate createdDate, LocalTime createdTime) {
		super();
		this.id = id;
		this.name = name;
		this.imageUrl = imageUrl;
		this.createdDate = createdDate;
		this.createdTime = createdTime;
	}


	
    
    
    
    
   
}
