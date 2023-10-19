package com.xworkz.dtoClasses;

import java.io.Serializable;

public class MarketDTO implements Serializable{
	private String marketName;
	private String marketType;
	private String area;
	private int numOfShops;
	private String timings;
	
	public MarketDTO() {
		System.out.println("No-Argument Constructor of MarketDTO");
	}

	public MarketDTO(String marketName, String marketType, String area, int numOfShops, String timings) {
		super();
		this.marketName = marketName;
		this.marketType = marketType;
		this.area = area;
		this.numOfShops = numOfShops;
		this.timings = timings;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public String getMarketType() {
		return marketType;
	}

	public void setMarketType(String marketType) {
		this.marketType = marketType;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getNumOfShops() {
		return numOfShops;
	}

	public void setNumOfShops(int numOfShops) {
		this.numOfShops = numOfShops;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	@Override
	public String toString() {
		return "MarketDTO [marketName=" + marketName + ", marketType=" + marketType + ", area=" + area + ", numOfShops="
				+ numOfShops + ", timings=" + timings + "]";
	}
	
	
	

}
