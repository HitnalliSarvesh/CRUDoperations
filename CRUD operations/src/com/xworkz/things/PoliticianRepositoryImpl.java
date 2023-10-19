package com.xworkz.things;

import com.xworkz.interfaces.PoliticianRepository;

public class PoliticianRepositoryImpl implements PoliticianRepository{

	private String[] names = new String[TOTAL_ITEMS];
	private int index=0;

	@Override
	public void save(String name) {
		System.out.println("Save method of Politician Repository, Name saved:"+name);
		if(this.index<TOTAL_ITEMS) {
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
		System.out.println("invoking display method from repository interface !");
		for(int i=0;i<TOTAL_ITEMS;i++) {
			System.out.println("Politician name at index "+i+" is :"+this.names[i]);
		}
	}

}
