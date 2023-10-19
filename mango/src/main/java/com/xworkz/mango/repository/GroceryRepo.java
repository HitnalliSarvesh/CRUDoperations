package com.xworkz.mango.repository;

import java.util.Collection;

import com.xworkz.mango.dtos.GroceryDTO;

public interface GroceryRepo {
	int ITEMS=3;
	
	void save(GroceryDTO dto);
	
	default int total() {
		return 0;
		
	}
	
	default Collection<GroceryDTO>getAll(){
		return null;
	}

}
