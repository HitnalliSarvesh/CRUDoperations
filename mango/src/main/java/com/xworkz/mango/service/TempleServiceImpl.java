package com.xworkz.mango.service;

import java.util.Collection;

import com.xworkz.mango.dtos.TempleDTO;
import com.xworkz.mango.repository.TempleRepo;

public class TempleServiceImpl implements TempleService{

private TempleRepo repo;
	
	public TempleServiceImpl(TempleRepo repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(TempleDTO dto) {
		System.out.println("Validate and save in Service " + dto);
		repo.save(dto);
		return true;
	}
	
	@Override
	public int total() {
		return this.repo.total();
	}

	@Override
	public Collection<TempleDTO> getAll() {
		return this.repo.getAll();
	}	

}
