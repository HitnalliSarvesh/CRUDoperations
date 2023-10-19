package com.xworkz.interfaces;

import com.xworkz.dtoClasses.CustomerDTO;

public interface CustomerRepository {
	int TOTAL_ITEMS=5;
	
	void save(CustomerDTO cdto); 

}
