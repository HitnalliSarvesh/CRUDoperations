package com.xworkz.things;

import com.xworkz.dtoClasses.MarketDTO;
import com.xworkz.interfaces.MarketRepository;

public class MarketRepositoryImpl implements MarketRepository{
	private MarketDTO[] market = new MarketDTO[values];
	private int index=0;

	@Override
	public void save(MarketDTO market) {
		System.out.println("Invoking save method in Market RepositoryImpl");
		System.out.println("Details saved:"+market);
		if(this.index<values) {
			this.market[index]=market;
			System.out.println("Market details at index:"+this.index);
			index++;
		}else {
			System.err.println("Data set is full....");
		}
		
	}

}
