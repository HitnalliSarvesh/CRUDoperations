package com.xworkz.runner;

import com.xworkz.interfaces.OlympicRepository;
import com.xworkz.things.OlympicRepositoryImpl;

public class OlympicRunner {
	public static void main(String[] args) {
		OlympicRepository olympic = new OlympicRepositoryImpl();
		olympic.create("1908");
		olympic.create("1920");
		olympic.create("1924");
		olympic.create("1928");
		olympic.create("1932");
		
		olympic.display();
		
	}

}
