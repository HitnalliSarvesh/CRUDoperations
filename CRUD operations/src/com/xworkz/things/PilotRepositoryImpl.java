package com.xworkz.things;

import com.xworkz.dtoClasses.PilotDTO;
import com.xworkz.interfaces.PilotRepository;

public class PilotRepositoryImpl implements PilotRepository{
	private PilotDTO[] pilot = new PilotDTO[ITEMS];
	int index=0;
	
	@Override
	public void save(PilotDTO pilot) {
		System.out.println("Invoking Save method for Pilot RepositoryImpl");
		System.out.println("Details saved:"+pilot);
		if(this.index<ITEMS) {
			this.pilot[index]=pilot;
			System.out.println("Details Saved at index:"+this.index);
			index++;
		}else {
			System.err.println("Data set is full....");
		}
		
	}
	

}
