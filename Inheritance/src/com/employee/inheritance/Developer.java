package com.employee.inheritance;

public class Developer extends Employee {
	
	String technology;
	
	

	public Developer(int id, String name, String depart, double salary,String technology) {
		super(id, name, depart, salary);
		this.technology = technology;
	}

	
	@Override
	protected void work() {
		super.work();
		System.out.println("Developer is developing "+ technology);
	}
}
