package com.xworkz.interfaces;

import com.xworkz.dtoClasses.MovieDTO;

public class MovieRepositoryImpl implements MovieRepository{
	
	private MovieDTO[] movie = new MovieDTO[TOTAL];
	private int index=0;
	

	@Override
	public boolean save(MovieDTO moviedto) {
		
		return false;
	}

}
