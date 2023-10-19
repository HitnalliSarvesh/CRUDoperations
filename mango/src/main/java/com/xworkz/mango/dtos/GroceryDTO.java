package com.xworkz.mango.dtos;

import java.io.Serializable;

public class GroceryDTO implements Serializable{
	private String name;
	private String type;
	private double price;
	private int quantity;
	
	private String getName() {
		return name;
	}
	
	public GroceryDTO() {
		System.out.println("No-argument Constructor");
	}

	public GroceryDTO(String name, String type, double price, int quantity) {
		System.out.println("All-argument constructor");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "GroceryDTO [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	
	

}
