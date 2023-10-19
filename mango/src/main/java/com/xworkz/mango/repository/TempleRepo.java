package com.xworkz.mango.repository;

import java.util.Collection;

import com.xworkz.mango.dtos.TempleDTO;

public interface TempleRepo {
	
void save(TempleDTO dto);
	
	default int total() {
		return 0;
		
	}
	
	default Collection<TempleDTO>getAll(){
		return null;
	}


}
