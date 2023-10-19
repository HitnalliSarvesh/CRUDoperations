package com.xworkz.runner;

import com.xworkz.dtoClasses.CustomerDTO;
import com.xworkz.interfaces.CustomerRepository;
import com.xworkz.things.CustomerRepositoryImpl;

public class CustomerRunner {
	public static void main(String[] args) {
		CustomerDTO customer = new CustomerDTO("sarvesh","sarvesh@gmail.com","vijayapur",false);
		CustomerDTO customer1 = new CustomerDTO("Ravi","ravi@gmail.com","Nepal", true);
		
		System.out.println(customer);
		
		CustomerRepository cr = new CustomerRepositoryImpl();
		cr.save(customer);
		cr.save(customer1);
		
	}

}
