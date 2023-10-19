package com.xworkz.mango.service;

import java.util.Collection;

import com.xworkz.mango.dtos.GroceryDTO;
import com.xworkz.mango.repository.GroceryRepo;

public class GroceryServiceImpl implements GroceryService{
private GroceryRepo repo;
	
	public GroceryServiceImpl(GroceryRepo repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(GroceryDTO dto) {
		System.out.println("Validate and save in Service " + dto);
		repo.save(dto);
		return true;
	}
	
	@Override
	public int total() {
		return this.repo.total();
	}

	@Override
	public Collection<GroceryDTO> getAll() {
		return this.repo.getAll();
	}	

}
