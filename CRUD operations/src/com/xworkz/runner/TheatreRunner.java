package com.xworkz.runner;

import com.xworkz.dtoClasses.TheatreDTO;
import com.xworkz.interfaces.TheatreRepository;
import com.xworkz.things.TheatreRepositoryImpl;

public class TheatreRunner {
	public static void main(String[] args) {
		TheatreDTO theatre1 = new TheatreDTO("Gopalan Cinemas","Jailer","J.P.Nagar",100,4.1f);
		TheatreDTO theatre2 = new TheatreDTO("Urvashi Cinema","OMG2","Sudhama Nagar",150,4.2f);
		TheatreDTO theatre3 = new TheatreDTO("Inox Theatre","Gaddar2","Mantri Junction",200,4.6f);
		TheatreDTO theatre4 = new TheatreDTO("PVR Gold Class","Bawaal","BTM layout",120, 3.6f);
		TheatreDTO theatre5 = new TheatreDTO("Sangeet Theatre","RRKPK","Shivaji Nagar", 80,2.6f);
		System.out.println(theatre1);
		
		TheatreRepository tr = new TheatreRepositoryImpl();
		tr.save(theatre1);
		tr.save(theatre2);
		tr.save(theatre3);
		tr.save(theatre4);
		tr.save(theatre5);
	}

}
