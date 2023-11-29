package com.employee.inheritance;

public class Test {

	public static void main(String[] args) {

		 String[] projects = new String[] {"Flight Reservation","Check In"};
		Manager manager = new Manager(1, "John", "Travel", 1000000, projects);
		
		System.out.println(manager.id);
		System.out.println(manager.name);
		System.out.println(manager.depart);
		System.out.println(manager.salary);
		
		manager.work();
	}

}
