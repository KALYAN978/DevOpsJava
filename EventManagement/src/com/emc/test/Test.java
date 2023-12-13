package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;

public class Test {

	public static void main(String[] args) {
		
		Organizer organizer = new Organizer();
		
		organizer.setId(123l);
		organizer.setName("Capgemini");
		System.out.println(organizer);
		System.out.println(organizer.getName());
		
		
		Event event = new Event(454l,"Iphone 100 launch","Grand Launch");
		
//		event.id = 456l;
//		event.name = "Iphone 100 launch";
//		event.description = "Grand Launch";
		
		System.out.println(event.getDescription());
		
		
		

	}

}
