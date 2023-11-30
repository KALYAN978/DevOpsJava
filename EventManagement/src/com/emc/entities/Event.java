package com.emc.entities;

public class Event extends EMBase{

	
	public String description;
	public String startTime;
	public String endTime;
	public Boolean started;

	// Creating a constructor
	public Event(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;

	}
	
	
	

}
