package com.xworkz.dtoClasses;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

public class ActorRunner {

	public static void main(String[] args) {
		
		ActorDTO dto1 = new ActorDTO(1,"RanveerSingh", "Hindi","Male","India");
		ActorDTO dto2 = new ActorDTO(2, "Dwayne Johnson", "English","Male","USA");
		ActorDTO dto3 = new ActorDTO(3, "Taaha Shah", "Urdu", "Female","UAE");
		ActorDTO dto4 = new ActorDTO(4, "Anthony Hopkins", "English", "Male", "Wales");
		ActorDTO dto5 = new ActorDTO(5, "Aaron Yan", "Chinese", "Female", "Taiwan");
		ActorDTO dto6 = new ActorDTO(6, "Takeru satoh", "Japanese", "Female", "Japan");
		ActorDTO dto7 = new ActorDTO(7, "Chris Hemsworth", "English", "Male", "Australia");
		ActorDTO dto8 = new ActorDTO(8, "Burak Ozcivit", "Turkish", "Male", "Turkey");
		ActorDTO dto9 = new ActorDTO(9, "Cillian Murphy", "English", "Female", "Ireland");
		ActorDTO dto10 = new ActorDTO(10, "Arnold S", "English", "Male", "Australia");
		
		
		Collection<ActorDTO> collection = new HashSet<ActorDTO>();
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
		
		//1
		System.out.println("Printing Actor names in descending order");
		collection.stream().sorted((e1,e2)->e2.getName().compareTo(e1.getName()))
		.map(ref->ref.getName()).collect(Collectors.toList())
		.forEach((c)->System.out.println(c));
		
		System.out.println("");
		collection.stream().sorted((e1,e2)->e2.getName().compareTo(e1.getName())).forEach((c)->System.out.println(c));
		
		//2
		System.out.println("");
		System.out.println("Countries in Uppercase in descending order");
		collection.stream().sorted((a1,a2)->a2.getCountry()
				.compareTo(a1.getCountry())).map(ref->ref.getCountry().toUpperCase())
		.collect(Collectors.toList()).forEach((c)->System.out.println(c));
		
		//3
		System.out.println("");
		System.out.println("Printing ID in ascending order");
		collection.stream().map(ref->ref.getId()).sorted().collect(Collectors.toList())
		.forEach((c)->System.out.println(c));
		
		//4
		System.out.println("");
		System.out.println("All actors in ascending order by language known");
		collection.stream().sorted((e1,e2)->e1.getLangKnown().compareTo(e2.getLangKnown()))
		.forEach((c)->System.out.println(c));
		
		//5
		System.out.println("");
		System.out.println("All actors in descending order by language known");
		collection.stream().sorted((e1,e2)->e2.getLangKnown().compareTo(e1.getLangKnown()))
		.forEach((c)->System.out.println(c));
		
		//6
		System.out.println("");
		System.out.println("Printing  male actors ");
		collection.stream().sorted((a1,a2)->a1.getId().compareTo(a2.getId()))
		.filter((e) -> e.getGender() == "Male").forEach((e) -> System.out.println(e.toString()));
		
		//7
		System.out.println("");
		System.out.println("Printing  Female actors in descending order by name");
		collection.stream().sorted((a1,a2)->a2.getName().compareTo(a1.getName()))
		.filter((e) -> e.getGender() == "Female").forEach((e) -> System.out.println(e.toString()));
		
		//8
		System.out.println("");
		System.out.println("Printing the count with same country name");
		Long count = collection.stream().filter(c -> c.getCountry().equals("Australia")).count();
		System.out.println("Count:"+count);
		
		//9
		System.out.println("");
		System.out.println("Printing actors having ID more than 5 ");
		collection.stream().sorted((a1,a2)->a1.getId().compareTo(a2.getId()))
		.filter((e) -> e.getId() > 5).collect(Collectors.toList()).forEach((e) -> System.out.println(e.toString()));


	}

}
