package com.xworkz.dtoClasses;

import java.io.Serializable;

public class PlayerDTO implements Serializable{
	private String name;
	private String sportName;
	
	public PlayerDTO() {
		
	}

	public PlayerDTO(String name, String sportName) {
		super();
		this.name = name;
		this.sportName = sportName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	@Override
	public String toString() {
		return "PlayerDTO [name=" + name + ", sportName=" + sportName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sportName == null) ? 0 : sportName.hashCode());
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
		PlayerDTO other = (PlayerDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sportName == null) {
			if (other.sportName != null)
				return false;
		} else if (!sportName.equals(other.sportName))
			return false;
		return true;
	}
	
	

}
