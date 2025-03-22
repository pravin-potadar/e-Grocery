package com.nt.entity;

public class CategoryData {
	
	private int id;
	private String categoryName;
	private String categoryImage;
	private String currentDate;
	
	
	public CategoryData() {
		
	}


	public CategoryData(int id, String categoryName, String categoryImage, String currentDate) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.categoryImage = categoryImage;
		this.currentDate = currentDate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public String getCategoryImage() {
		return categoryImage;
	}


	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}


	public String getCurrentDate() {
		return currentDate;
	}


	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	
	
	
	

}
