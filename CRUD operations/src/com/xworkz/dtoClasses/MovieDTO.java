package com.xworkz.dtoClasses;

import java.io.Serializable;

public class MovieDTO implements Serializable{
	private String name;
	private String actor;
	private String actress;
	
	public MovieDTO() {
		System.out.println("No- Arg constructor");
	}

	public MovieDTO(String name, String actor, String actress) {
		super();
		this.name = name;
		this.actor = actor;
		this.actress = actress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getActress() {
		return actress;
	}

	public void setActress(String actress) {
		this.actress = actress;
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", actor=" + actor + ", actress=" + actress + "]";
	}
	
	

}
