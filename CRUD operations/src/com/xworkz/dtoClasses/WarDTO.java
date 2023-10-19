package com.xworkz.dtoClasses;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class WarDTO implements Serializable{
	
	private int id;
	private LocalDate startDate;
	private LocalDate endDate;
	private List<CountryDTO> countries;
	private String wonBy;
	
	public WarDTO() {
		// TODO Auto-generated constructor stub
	}

	public WarDTO(int id, LocalDate startDate, LocalDate endDate, List<CountryDTO> countries, String wonBy) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.countries = countries;
		this.wonBy = wonBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public List<CountryDTO> getCountries() {
		return countries;
	}

	public void setCountries(List<CountryDTO> countries) {
		this.countries = countries;
	}

	public String getWonBy() {
		return wonBy;
	}

	public void setWonBy(String wonBy) {
		this.wonBy = wonBy;
	}

	@Override
	public String toString() {
		return "WarDTO [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", countries=" + countries
				+ ", wonBy=" + wonBy + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countries == null) ? 0 : countries.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((wonBy == null) ? 0 : wonBy.hashCode());
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
		WarDTO other = (WarDTO) obj;
		if (countries == null) {
			if (other.countries != null)
				return false;
		} else if (!countries.equals(other.countries))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (id != other.id)
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (wonBy == null) {
			if (other.wonBy != null)
				return false;
		} else if (!wonBy.equals(other.wonBy))
			return false;
		return true;
	}
	
	


}
