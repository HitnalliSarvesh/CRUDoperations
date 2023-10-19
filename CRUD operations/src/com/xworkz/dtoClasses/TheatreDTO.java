package com.xworkz.dtoClasses;

import java.io.Serializable;

public class TheatreDTO implements Serializable{
	private String name;
	private String film;
	private String location;
	private int capacity;
	private float ratings;
	
	
	public TheatreDTO() {
		System.out.println("No-Argument Constructor for TheatreDTO");
	}


	public TheatreDTO(String name, String film, String location, int capacity, float ratings) {
		super();
		this.name = name;
		this.film = film;
		this.location = location;
		this.capacity = capacity;
		this.ratings = ratings;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFilm() {
		return film;
	}


	public void setFilm(String film) {
		this.film = film;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public float getRatings() {
		return ratings;
	}


	public void setRatings(float ratings) {
		this.ratings = ratings;
	}


	@Override
	public String toString() {
		return "TheatreDTO [name=" + name + ", film=" + film + ", location=" + location + ", capacity=" + capacity
				+ ", ratings=" + ratings + "]";
	}
	
	


}
