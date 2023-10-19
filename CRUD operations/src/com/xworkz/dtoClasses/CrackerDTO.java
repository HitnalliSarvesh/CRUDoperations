package com.xworkz.dtoClasses;

import java.io.Serializable;

public class CrackerDTO extends AbstractAuditDTO implements Serializable{
	
	private String brand;
	private String name;
	private double price;
	
	
	public CrackerDTO(String brand, String name, double price) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
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


	@Override
	public String toString() {
		return "CrackerDTO [brand=" + brand + ", name=" + name + ", price=" + price + ", getCreatedBy()="
				+ getCreatedBy() + ", getCreatedOn()=" + getCreatedOn() + ", getUpdatedBy()=" + getUpdatedBy()
				+ ", getUpdatedOn()=" + getUpdatedOn() + "]";
	}
	
	
	
	
	


	
	
	
	

}
