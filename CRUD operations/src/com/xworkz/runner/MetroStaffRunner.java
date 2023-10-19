package com.xworkz.runner;

import com.xworkz.dtoClasses.MetroStaffDTO;
import com.xworkz.interfaces.MetroStaffRepository;
import com.xworkz.things.MetroStaffRepositoryImpl;

public class MetroStaffRunner {
	public static void main(String[] args) {
		MetroStaffDTO metro1= new MetroStaffDTO("Kumar","MS01",40,"Male","Morning");
		System.out.println(metro1);
		MetroStaffDTO metro2= new MetroStaffDTO("Shanti","MS02",35,"Female","Afternoon");
		System.out.println(metro2);
		MetroStaffDTO metro3= new MetroStaffDTO("Arun","MS03",45,"Male","Evening");
		System.out.println(metro3);
		MetroStaffDTO metro4= new MetroStaffDTO("Pushpa","MS04",33,"Female","Night");
		System.out.println(metro4);
		MetroStaffDTO metro5= new MetroStaffDTO("Karthik","MS05",46,"Male","Morning");
		System.out.println(metro5);
		
		MetroStaffRepository msr = new MetroStaffRepositoryImpl();
		msr.save(metro1);
		msr.save(metro2);
		msr.save(metro3);
		msr.save(metro4);
		msr.save(metro5);
	}

}
