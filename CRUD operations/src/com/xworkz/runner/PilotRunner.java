package com.xworkz.runner;

import com.xworkz.dtoClasses.PilotDTO;
import com.xworkz.interfaces.PilotRepository;
import com.xworkz.things.PilotRepositoryImpl;

public class PilotRunner {
	public static void main(String[] args) {
		PilotDTO pilot1 = new PilotDTO("Nitin Singh","IND/MM/1190","Teems India Pvt Ltd.","Air India","Delhi");
		PilotDTO pilot2 = new PilotDTO("CH RAMU","IND/MS/1066","Aarvee Associates","IndiGo","Mumbai");
		PilotDTO pilot3 = new PilotDTO("SATVIK KG","IND/MM/1193","ATPL","Kingfisher","Bengaluru");
		PilotDTO pilot4 = new PilotDTO("ANAND BINU","IND/MM/1187","Aarvee Associates","Jet Airways","Kolkata");
		PilotDTO pilot5 = new PilotDTO("SATISH PATHAK","IND/MS/1069","ATPL","Gujarat Airways","Ahmedabad");
		System.out.println(pilot1);
		
		PilotRepository pr = new PilotRepositoryImpl();
		pr.save(pilot1);
		pr.save(pilot2);
		pr.save(pilot3);
		pr.save(pilot4);
		pr.save(pilot5);
	}

}
