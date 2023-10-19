package com.xworkz.things;

import com.xworkz.dtoClasses.TheatreDTO;
import com.xworkz.interfaces.TheatreRepository;

public class TheatreRepositoryImpl implements TheatreRepository{
	
	private TheatreDTO[] theatre = new TheatreDTO[value];
	private int index=0;
	

	@Override
	public void save(TheatreDTO theatre) {
		System.out.println("Invoking save method in TheatreRepositoryImpl");
		System.out.println("Theatre Details saved:"+theatre);
		if(this.index<value) {
			this.theatre[index]=theatre;
			System.out.println("Theatre details saved at index:"+this.index);
			index++;		
		}else {
			System.err.println("Data set is full.....");
		}
		
	}

}
