package com.xworkz.dtoClasses;

import java.util.Collection;
import java.util.HashSet;

public class BrandTester {

	public static void main(String[] args) {

		BrandDTO dto1 = new BrandDTO("Nike", "Phil Knight", 30.7, "USA");
		BrandDTO dto2 = new BrandDTO("Titan", "Tata", 5.1, "India");
		BrandDTO dto3 = new BrandDTO("Apple", "Tim Cook", 800, "USA");
		BrandDTO dto4 = new BrandDTO("Tesla", "Elon Musk", 8.14, "USA");
		BrandDTO dto5 = new BrandDTO("Google", "Sundar Pichai", 280, "USA");
		BrandDTO dto6 = new BrandDTO("BMW", "Oliver Zipse", 159.5, "Germany");
		BrandDTO dto7 = new BrandDTO("Sony", "Kenichiro Yoshida", 89.23, "Japan");
		BrandDTO dto8 = new BrandDTO("Starbucks", "Laxman Narasimhan", 9.2, "USA");
		BrandDTO dto9 = new BrandDTO("Dell", "Michael S", 102.3, "Texas");
		BrandDTO dto10 = new BrandDTO("Louis Vuitton", "Pietro Beccari", 79.2, "France");

		Collection<BrandDTO> collection = new HashSet<BrandDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);

		System.out.println("====================");
		collection.stream().sorted().forEach(b -> System.out.println(b));
		
		System.out.println("*************************************************");
		System.out.println("Printing Brands having revenue greater than 20 billion");
		collection.stream().filter((e) -> e.getRevenue() > 20).forEach((e) -> System.out.println(e.toString()));
		
		System.out.println("*************************************************");
		System.out.println("Printing Brands having revenue less than 20 billion");
		collection.stream().filter((e) -> e.getRevenue() < 20).forEach((e) -> System.out.println(e.toString()));
		
		System.out.println("*************************************************");
		System.out.println("Printing Brands Origin from USA");
		collection.stream().filter((e) -> e.getCountry() == "USA").forEach((e) -> System.out.println(e.toString()));
		
		System.out.println("*************************************************");
		System.out.println("Printing Brands Not Origined from USA");
		collection.stream().filter((e) -> e.getCountry() != "USA").forEach((e) -> System.out.println(e.toString()));
		
		System.out.println("*************************************************");
		System.out.println("Printing brands whose name starts with S");
		collection.stream().filter((e) -> e.getName().startsWith("S")).forEach((e) -> System.out.println(e.toString()));
		
		System.out.println("*************************************************");
		System.out.println("Printing brand names having length more than 5");
		collection.stream().filter((e) -> e.getName().length() > 5).forEach((e) -> System.out.println(e.toString()));
		
		System.out.println("*************************************************");
		System.out.println("Printing brand names having length less than 5");
		collection.stream().filter((e) -> e.getName().length() < 5).forEach((e) -> System.out.println(e.toString()));
		
		System.out.println("*************************************************");
		System.out.println("Printing brand names having length equal to 5");
		collection.stream().filter((e) -> e.getName().length() == 5).forEach((e) -> System.out.println(e.toString()));

	}

}
