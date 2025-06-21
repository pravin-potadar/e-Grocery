package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;

	private String name;

	private String brand;

	private String description;

	private String price;

	private String discount;

	private String stock;

	private String unitType;

	private int unitNum;

	private String status;

	private String imageUrl;

	private LocalDate createdDate;

	private LocalTime createdTime;

//	private int categoryId;
	
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users user;

	

}
