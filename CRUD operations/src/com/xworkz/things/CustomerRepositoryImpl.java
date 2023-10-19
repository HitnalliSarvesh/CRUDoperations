package com.xworkz.things;

import com.xworkz.dtoClasses.CustomerDTO;
import com.xworkz.interfaces.CustomerRepository;

public class CustomerRepositoryImpl implements CustomerRepository{
	
	private CustomerDTO[] cdto = new CustomerDTO[TOTAL_ITEMS];
	private int index = 0;

	@Override
	public void save(CustomerDTO cdto) {

		System.out.println("Invoking save method");
		System.out.println("Customer saved:"+cdto);
		if(this.index<TOTAL_ITEMS) {
			this.cdto[index]=cdto;
			System.out.println("Customer saved at:"+this.index);
			index++;
		}else {
			System.err.println("Dataset is full...");
		}
		
	}

}
