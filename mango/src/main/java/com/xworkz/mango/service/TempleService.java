package com.xworkz.mango.service;

import java.util.Collection;

import com.xworkz.mango.dtos.TempleDTO;

public interface TempleService {
	
boolean validateAndSave(TempleDTO dto);
	
	default int total(){
		return 0;
	}
	
	default Collection<TempleDTO> getAll(){
		return null;
	}


}
