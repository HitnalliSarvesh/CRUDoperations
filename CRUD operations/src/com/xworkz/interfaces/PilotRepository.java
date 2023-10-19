package com.xworkz.interfaces;

import com.xworkz.dtoClasses.PilotDTO;

public interface PilotRepository {
	int ITEMS=5;
	void save(PilotDTO pilot);

}
