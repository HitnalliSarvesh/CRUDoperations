package com.xworkz.dtoClasses;

import java.io.Serializable;

public class CountryDTO implements Serializable{
	
	private int id;
	private String name;
	private PresidentDTO presidentDTO;
	private String continent;
	
	public CountryDTO() {
		// TODO Auto-generated constructor stub
	}

	public CountryDTO(int id, String name, PresidentDTO presidentDTO, String continent) {
		super();
		this.id = id;
		this.name = name;
		this.presidentDTO = presidentDTO;
		this.continent = continent;
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

	public PresidentDTO getPresidentDTO() {
		return presidentDTO;
	}

	public void setPresidentDTO(PresidentDTO presidentDTO) {
		this.presidentDTO = presidentDTO;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "CountryDTO [id=" + id + ", name=" + name + ", presidentDTO=" + presidentDTO + ", continent=" + continent
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((continent == null) ? 0 : continent.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((presidentDTO == null) ? 0 : presidentDTO.hashCode());
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
		CountryDTO other = (CountryDTO) obj;
		if (continent == null) {
			if (other.continent != null)
				return false;
		} else if (!continent.equals(other.continent))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (presidentDTO == null) {
			if (other.presidentDTO != null)
				return false;
		} else if (!presidentDTO.equals(other.presidentDTO))
			return false;
		return true;
	}
	
	


}
