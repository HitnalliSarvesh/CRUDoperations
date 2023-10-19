package com.xworkz.things;

import com.xworkz.interfaces.ArmyRepository;

public class ArmyRepositoryImpl implements ArmyRepository{
	
	private String[] teams= new String[TOTAL_TEAMS];
	private int index=0;
	
	
	@Override
	public void create(String name) {
		System.out.println("Creating method for Army Repository, Team saved is:"+name);
		if(this.index<TOTAL_TEAMS) {
			System.out.println("Team name is at index:"+this.index);
			this.teams[index]=name;
			index=index+1;
			System.out.println("Next index is:"+this.index);
		}else {
			System.err.println("You cannot enter more values......");
		}
		
	}
	@Override
	public void display() {
		System.out.println("Invoking display method of Army Repository");
		for(int i=0; i<TOTAL_TEAMS;i++) {
			System.out.println("Team name at index "+i+" is "+this.teams[i]);
		}		
	}
}
