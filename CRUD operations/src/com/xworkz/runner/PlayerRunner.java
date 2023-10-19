package com.xworkz.runner;

import com.xworkz.dtoClasses.PlayerDTO;
import com.xworkz.interfaces.PlayerRepository;
import com.xworkz.interfaces.PlayerRepositoryImpl;
import com.xworkz.service.PlayerService;
import com.xworkz.service.PlayerServiceImpl;

public class PlayerRunner {
	public static void main(String[] args) {
		PlayerDTO playerdto = new PlayerDTO("Virat Kohli", "Cricket");
		PlayerRepository repository = new PlayerRepositoryImpl();
		
		
		PlayerService player = new PlayerServiceImpl(repository);
		boolean result = player.validateAndsave(playerdto);
		
		if(result) {
			System.out.println("Saved result is: "+result);
		}else {
			System.err.println(result);
		}
		
	}

}
