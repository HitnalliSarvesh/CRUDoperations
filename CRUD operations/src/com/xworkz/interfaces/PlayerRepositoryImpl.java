package com.xworkz.interfaces;

import com.xworkz.dtoClasses.PlayerDTO;

public class PlayerRepositoryImpl implements PlayerRepository{
	
	private PlayerDTO[] player=new PlayerDTO[PLAYERS];
	private int index=0;
	
	@Override
	public boolean save(PlayerDTO playerdto) {
		if(this.index<PLAYERS) {
			System.out.println("Invoking save method in RepositoryImpl");
			this.player[index]= playerdto;
			System.out.println(playerdto+" is player's data");
			this.index++;
		}else {
			System.err.println(playerdto+" is player's data");
		}
		return true;		
	}
}
