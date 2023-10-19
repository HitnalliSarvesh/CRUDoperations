package com.xworkz.mango.repository;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.mango.dtos.TempleDTO;

public class TempleRepoImpl implements TempleRepo{
	
	private Collection<TempleDTO> group = new LinkedList<TempleDTO>();

	@Override
	public void save(TempleDTO dto) {
		System.out.println("Running save in Temple Repo");
		boolean saved = this.group.add(dto);
		if (saved) {
			System.out.println("Data saved");
		} else {
			System.out.println("Not saved");
		}
	}
	
	@Override
	public int total() {
		return this.group.size();
	}

	@Override
	public Collection<TempleDTO> getAll() {
		return this.group;
	}

}
