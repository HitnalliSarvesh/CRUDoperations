package com.xworkz.runner;

import com.xworkz.interfaces.ApartmentRepository;
import com.xworkz.things.ApartmentRepositoryImpl;

public class ApartmentRunner {
	public static void main(String[] args) {
		ApartmentRepository apt = new ApartmentRepositoryImpl();
		apt.create("Varshini Comforts");
		apt.create("Sobha Indraprastha");
		apt.create("Tata Promont Luxury apartments");
		apt.create("RMZ Latitudes");
		apt.create("Peninsula Heights");
		
		apt.display();
	}
	
	

}
