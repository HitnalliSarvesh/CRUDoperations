package com.xworkz.runner;

import com.xworkz.interfaces.ArmyRepository;
import com.xworkz.things.ArmyRepositoryImpl;

public class ArmyRunner {
	public static void main(String[] args) {
		ArmyRepository army = new ArmyRepositoryImpl();
		army.create("Alpha");
		army.create("Delta");
		army.create("Tango");
		army.create("Shershah");
		army.create("Eagles");
		army.create("Force");
		
		army.display();
		
		
	}

}
