package com.xworkz.service;

import com.xworkz.interfaces.PlayerRepository;

import com.xworkz.interfaces.PlayerRepositoryImpl;
import com.xworkz.dtoClasses.PlayerDTO;
import com.xworkz.util.PlayerUtil;

public class PlayerServiceImpl implements PlayerService{
	
	private PlayerRepository playerrepo;
	
	public PlayerServiceImpl(PlayerRepository playerrepo) {
		this.playerrepo=playerrepo;
	}

	@Override
	public boolean validateAndsave(PlayerDTO playerdto) {
		
		String name= playerdto.getName();
		String sport = playerdto.getSportName();
		
		if(PlayerUtil.validate(name)) {
			System.out.println("Player name is: "+name);
		}else {
			System.err.println(name);
		}
		
		if(PlayerUtil.validate(sport)) {
			System.out.println("Sport name is: "+sport);
		}else {
			System.err.println(sport);
		}	
		
		PlayerRepository player1 = new PlayerRepositoryImpl();
		player1.save(playerdto);
		return true;
	}

	

}
