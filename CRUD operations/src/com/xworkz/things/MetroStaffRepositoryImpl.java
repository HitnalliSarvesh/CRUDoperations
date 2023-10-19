package com.xworkz.things;

import com.xworkz.dtoClasses.MetroStaffDTO;
import com.xworkz.interfaces.MetroStaffRepository;

public class MetroStaffRepositoryImpl implements MetroStaffRepository{
	
	private MetroStaffDTO[] metro= new MetroStaffDTO[values];
	private int index=0;

	@Override
	public void save(MetroStaffDTO metro) {
		System.out.println("Invoking save method in Metrostaff Repository");
		System.out.println("Metro Staff Details stored:"+metro);
		
		if(this.index<values) {
			this.metro[index]=metro;
			System.out.println("Details saved at index:"+this.index);
			index++;		
		}else {
			System.err.println("Data set is full.....");
		}
		
	}

}
