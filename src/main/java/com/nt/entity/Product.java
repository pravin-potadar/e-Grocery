package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
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

	private int categoryId;

	public Product() {

	}

	public Product(int id, String name, String brand, String description, String price, String discount, String stock,
			String unitType, int unitNum, String status, String imageUrl, LocalDate createdDate, LocalTime createdTime,
			int categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.price = price;
		this.discount = discount;
		this.stock = stock;
		this.unitType = unitType;
		this.unitNum = unitNum;
		this.status = status;
		this.imageUrl = imageUrl;
		this.createdDate = createdDate;
		this.createdTime = createdTime;
		this.categoryId = categoryId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalTime getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(LocalTime createdTime) {
		this.createdTime = createdTime;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getUnitNum() {
		return unitNum;
	}

	public void setUnitNum(int unitNum) {
		this.unitNum = unitNum;
	}

}
