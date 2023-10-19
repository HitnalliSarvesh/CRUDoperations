package com.xworkz.mango.dtos;

import java.io.Serializable;

public class TempleDTO implements Serializable{
	private String name;
	private String place;
	private String god;
	private String constructionYear;
	private String constructedBy;
	
	public TempleDTO() {
		System.out.println("No-Arg constructor");
	}
	
	public TempleDTO(String name, String place, String god, String constructionYear, String constructedBy) {
		super();
		this.name = name;
		this.place = place;
		this.god = god;
		this.constructionYear = constructionYear;
		this.constructedBy = constructedBy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getGod() {
		return god;
	}

	public void setGod(String god) {
		this.god = god;
	}

	public String getConstructionYear() {
		return constructionYear;
	}

	public void setConstructionYear(String constructionYear) {
		this.constructionYear = constructionYear;
	}

	public String getConstructedBy() {
		return constructedBy;
	}

	public void setConstructedBy(String constructedBy) {
		this.constructedBy = constructedBy;
	}

	@Override
	public String toString() {
		return "TempleDTO [name=" + name + ", place=" + place + ", god=" + god + ", constructionYear="
				+ constructionYear + ", constructedBy=" + constructedBy + "]";
	}
	
	
	

}
