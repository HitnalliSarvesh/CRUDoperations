package com.xworkz.dtoClasses;

import java.io.Serializable;

public class MetroStaffDTO implements Serializable{
	private String name;
	private String ID;
	private int age;
	private String gender;
	private String shift;
	
	public MetroStaffDTO() {
		System.out.println("No-Argument constructor for MetroStaffDTO");
	}

	public MetroStaffDTO(String name, String iD, int age, String gender, String shift) {
		super();
		this.name = name;
		ID = iD;
		this.age = age;
		this.gender = gender;
		this.shift = shift;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	@Override
	public String toString() {
		return "MetroStaffDTO [name=" + name + ", ID=" + ID + ", age=" + age + ", gender=" + gender + ", shift=" + shift
				+ "]";
	}
	
	
	
	

}
