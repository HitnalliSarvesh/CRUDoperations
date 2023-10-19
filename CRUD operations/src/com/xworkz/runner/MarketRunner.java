package com.xworkz.runner;

import com.xworkz.dtoClasses.MarketDTO;
import com.xworkz.interfaces.MarketRepository;
import com.xworkz.things.MarketRepositoryImpl;

public class MarketRunner {
	public static void main(String[] args) {
		MarketDTO market1 = new MarketDTO("Malleshwaram Market","Wholesale Market", "Malleshwaram", 50, "9:00am-9:00pm");
		MarketDTO market2 = new MarketDTO("Majestic Market","Retail","Majestic",60,"8:00am-10:00pm");
		MarketDTO market3 = new MarketDTO("Gandhi Bazar","Local Market","M.G.Road",90,"7:00am-10:00pm");
		MarketDTO market4 = new MarketDTO("Commercial Street","Antique Stores","Shivaji Nagar",50,"10:00am-9:00pm");
		MarketDTO market5 = new MarketDTO("National Market","Street Market","Gandhi Nagar",60,"9:00am-10:00pm");
		System.out.println(market1);
		
		MarketRepository mr = new MarketRepositoryImpl();
		mr.save(market1);
		mr.save(market2);
		mr.save(market3);
		mr.save(market4);
		mr.save(market5);
	}

}
