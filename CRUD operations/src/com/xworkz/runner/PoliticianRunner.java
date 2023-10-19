package com.xworkz.runner;

import com.xworkz.interfaces.PoliticianRepository;
import com.xworkz.things.PoliticianRepositoryImpl;

public class PoliticianRunner {

	public static void main(String[] args) {
		PoliticianRepository repo = new PoliticianRepositoryImpl();
		repo.save("BRP");
		repo.save("DKS");
		repo.save("Siddu");
		repo.save("HDK");
		repo.save("Suresh Kumar");
		repo.save("Bommai");
		repo.save("CT Ravi");
		repo.save("Savadi");
		repo.save("Jarakiholi");
		repo.save("R Ashok");
		
		repo.display();
		
	}

}


