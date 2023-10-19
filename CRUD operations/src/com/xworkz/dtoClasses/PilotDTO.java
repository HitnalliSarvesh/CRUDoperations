package com.xworkz.dtoClasses;

import java.io.Serializable;

public class PilotDTO implements Serializable{
	private String name;
	private String certificateNumber;
	private String organization;
	private String airlines;
	private String location;
	
	public PilotDTO() {
		System.out.println("No-Argument Constructor for PilotDTO class");
	}

	public PilotDTO(String name, String certificateNumber, String organization, String airlines, String location) {
		super();
		this.name = name;
		this.certificateNumber = certificateNumber;
		this.organization = organization;
		this.airlines = airlines;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization( String organization) {
		this.organization = organization;
	}

	public String getAirlines() {
		return airlines;
	}

	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "PilotDTO [name=" + name + ", certificateNumber=" + certificateNumber + ", organization=" + organization + ", airlines=" + airlines
				+ ", location=" + location + "]";
	}
	
	
	

}
