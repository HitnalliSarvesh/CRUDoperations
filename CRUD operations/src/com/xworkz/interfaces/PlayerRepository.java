package com.xworkz.interfaces;

import com.xworkz.dtoClasses.PlayerDTO;

public interface PlayerRepository {
	int PLAYERS=4;
	
	public boolean save(PlayerDTO playerdto);
		
}
