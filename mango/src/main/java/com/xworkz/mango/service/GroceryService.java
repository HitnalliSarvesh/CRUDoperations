package com.xworkz.mango.service;

import java.util.Collection;

import com.xworkz.mango.dtos.GroceryDTO;

public interface GroceryService {
	
boolean validateAndSave(GroceryDTO dto);
	
	default int total(){
		return 0;
	}
	
	default Collection<GroceryDTO> getAll(){
		return null;
	}
	

}
