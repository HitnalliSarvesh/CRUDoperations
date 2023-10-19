package com.xworkz.things;

import com.xworkz.interfaces.OlympicRepository;

public class OlympicRepositoryImpl implements OlympicRepository{
	
	private String[] years = new String[TOTAL_YEARS];
	private int index=0;

	@Override
	public void create(String year) {
		System.out.println("Create Method of Olympic Repository, Year saved:"+year);
		if(this.index<TOTAL_YEARS) {
			System.out.println("Year saved at index:"+this.index);
			this.years[index] = year;
			index++;
			System.out.println("Next index is:"+this.index);
		}else {
			System.err.println("Dataset is full ...!");
		}
	}
	
	@Override
	public void display() {
		System.out.println("invoking display method from olympic repository interface !");
		for(int i=0;i<TOTAL_YEARS;i++) {
			System.out.println("Olympic Year at index "+i+" is :"+this.years[i]);
		}
	}

}
