package com.rd.dto;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProductDto {
	
	@Min(value=99, message = "Product code must be equal or more than 99")
	private int code;
	
	@Size(min=5, max=30, message="The Product name should be between 5 to 30 characters")
	private String name;
	
	@DecimalMin(value="00.01", message = "The price should be equal to or more than 00.01")
	@DecimalMax(value="1000.00", message = "The price should be equal to or less than 1000.00")
	private double price;
	
	@NotNull(message = "The product category cannot be null")
	private String category;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public ProductDto() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductDto(int code, String name, double price, String category) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.category = category;
	}
}
