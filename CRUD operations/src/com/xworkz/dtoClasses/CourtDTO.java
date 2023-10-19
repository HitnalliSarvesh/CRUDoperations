package com.xworkz.dtoClasses;

import java.io.Serializable;

public class CourtDTO implements Serializable{
	private String type;
	private String city;
	private int noOfJudges;
	private int noOfActiveCases;
	
	public CourtDTO() {
		
	}

	public CourtDTO(String type, String city, int noOfJudges, int noOfActiveCases) {
		super();
		this.type = type;
		this.city = city;
		this.noOfJudges = noOfJudges;
		this.noOfActiveCases = noOfActiveCases;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getNoOfJudges() {
		return noOfJudges;
	}

	public void setNoOfJudges(int noOfJudges) {
		this.noOfJudges = noOfJudges;
	}

	public int getNoOfActiveCases() {
		return noOfActiveCases;
	}

	public void setNoOfActiveCases(int noOfActiveCases) {
		this.noOfActiveCases = noOfActiveCases;
	}

	@Override
	public String toString() {
		return "CourtDTO [type=" + type + ", city=" + city + ", noOfJudges=" + noOfJudges + ", noOfActiveCases="
				+ noOfActiveCases + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + noOfActiveCases;
		result = prime * result + noOfJudges;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		CourtDTO other = (CourtDTO) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (noOfActiveCases != other.noOfActiveCases)
			return false;
		if (noOfJudges != other.noOfJudges)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
	

}
