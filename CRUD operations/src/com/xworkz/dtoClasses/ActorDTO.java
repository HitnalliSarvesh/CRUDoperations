package com.xworkz.dtoClasses;

public class ActorDTO implements Comparable<ActorDTO>{
	private Integer id;
	private String name;
	private String langKnown;
	private String gender;
	private String country;
	
	public ActorDTO() {
		System.out.println("No-args constr");
	}

	public ActorDTO(Integer id, String name, String langKnown, String gender, String country) {
		super();
		this.id = id;
		this.name = name;
		this.langKnown = langKnown;
		this.gender = gender;
		this.country = country;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLangKnown() {
		return langKnown;
	}

	public void setLangKnown(String langKnown) {
		this.langKnown = langKnown;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "ActorDTO [id=" + id + ", name=" + name + ", langKnown=" + langKnown + ", gender=" + gender
				+ ", country=" + country + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + id;
		result = prime * result + ((langKnown == null) ? 0 : langKnown.hashCode());
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
		ActorDTO other = (ActorDTO) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id != other.id)
			return false;
		if (langKnown == null) {
			if (other.langKnown != null)
				return false;
		} else if (!langKnown.equals(other.langKnown))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(ActorDTO act) {
		ActorDTO temp=this;
		
		return act.getName().compareTo(temp.getName());
	}
	
	

}
