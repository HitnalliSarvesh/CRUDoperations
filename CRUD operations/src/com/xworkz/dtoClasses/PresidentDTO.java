package com.xworkz.dtoClasses;

import java.io.Serializable;
import java.time.LocalDate;

public class PresidentDTO implements Serializable {
	private int id;
	private String name;
	private int age;
	private LocalDate durationStart;
	private LocalDate durationEnd;
	
	public PresidentDTO() {
		// TODO Auto-generated constructor stub
	}

	public PresidentDTO(int id, String name, int age, LocalDate durationStart, LocalDate durationEnd) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.durationStart = durationStart;
		this.durationEnd = durationEnd;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDurationStart() {
		return durationStart;
	}

	public void setDurationStart(LocalDate durationStart) {
		this.durationStart = durationStart;
	}

	public LocalDate getDurationEnd() {
		return durationEnd;
	}

	public void setDurationEnd(LocalDate durationEnd) {
		this.durationEnd = durationEnd;
	}

	@Override
	public String toString() {
		return "PresidentDTO [id=" + id + ", name=" + name + ", age=" + age + ", durationStart=" + durationStart
				+ ", durationEnd=" + durationEnd + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((durationEnd == null) ? 0 : durationEnd.hashCode());
		result = prime * result + ((durationStart == null) ? 0 : durationStart.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PresidentDTO other = (PresidentDTO) obj;
		if (age != other.age)
			return false;
		if (durationEnd == null) {
			if (other.durationEnd != null)
				return false;
		} else if (!durationEnd.equals(other.durationEnd))
			return false;
		if (durationStart == null) {
			if (other.durationStart != null)
				return false;
		} else if (!durationStart.equals(other.durationStart))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	

}
