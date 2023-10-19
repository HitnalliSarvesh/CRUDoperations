package com.xworkz.interfaces;

import com.xworkz.dtoClasses.MovieDTO;

public interface MovieRepository {
	int TOTAL =5;
	
	public boolean save(MovieDTO moviedto);

}
