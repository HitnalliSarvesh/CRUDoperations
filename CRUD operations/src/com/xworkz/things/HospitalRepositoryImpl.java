package com.xworkz.things;

import com.xworkz.interfaces.HospitalRepository;

public class HospitalRepositoryImpl implements HospitalRepository{
	private String[] names=new String[TOTAL_HOSPITALS];
	private int index=0;

	@Override
	public void create(String name) {
		System.out.println("Creating Method of Hospital Repository, Name saved is:"+name);
		if(this.index<TOTAL_HOSPITALS) {
			System.out.println("Hospital name at index:"+this.index);
			this.names[index]=name;
			index=index+1;
			System.out.println("Next index is:"+this.index);
		}else {
			System.err.println("You cannot enter more values......");
		}
		
	}

	@Override
	public void display() {
		System.out.println("Invoking display method of Hospital Repository");
		for(int i=0; i<TOTAL_HOSPITALS;i++) {
			System.out.println("Hospital name at index "+i+" is "+this.names[i]);
		}
		
	}

}
