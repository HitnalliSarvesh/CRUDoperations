package com.xworkz.runner;

import com.xworkz.interfaces.HospitalRepository;
import com.xworkz.things.HospitalRepositoryImpl;

public class HospitalRunner {
	public static void main(String[] args) {
		HospitalRepository hospital = new HospitalRepositoryImpl();
		hospital.create("KIMS");
		hospital.create("APOLLO");
		hospital.create("AIIMS");
		hospital.create("VIKRAM");
		hospital.create("FORTIS");
		
		hospital.display();
		
		
	}

}
