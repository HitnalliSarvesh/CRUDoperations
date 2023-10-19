package com.xworkz.things;

import com.xworkz.interfaces.ApartmentRepository;

public class ApartmentRepositoryImpl implements ApartmentRepository{

	private String[] names = new String[TOTAL_NAMES];
	private int index=0;

	@Override
	public void create(String name) {
		System.out.println("Create Method of Apartment Repository, Name saved:"+name);
		if(this.index<TOTAL_NAMES) {
			System.out.println("Name saved at index:"+this.index);
			this.names[index] = name;
			index++;
			System.out.println("Next index is:"+this.index);
		}else {
			System.err.println("Dataset is full ...!");
		}
	}
	
	@Override
	public void display() {
		System.out.println("invoking display method from apartment repository interface !");
		for(int i=0;i<TOTAL_NAMES;i++) {
			System.out.println("Apartment name at index "+ i +" is :"+this.names[i]);
		}
	}

}
