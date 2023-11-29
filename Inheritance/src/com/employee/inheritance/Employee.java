package com.employee.inheritance;

public class Employee {
	
	int id;
	String name;
	String depart;
	double salary;
	
	
	
	public Employee(int id,String name,String depart,double salary) {
		this.id = id;
		this.name = name;
		this.depart = depart;
		this.salary = salary;
	}
	
	

	protected void work() {
		System.out.println("Common work for everyone");
	}
	
	
}
