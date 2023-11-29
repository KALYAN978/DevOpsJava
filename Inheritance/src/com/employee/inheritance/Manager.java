package com.employee.inheritance;

public class Manager extends Employee {
	
	String[] projects;
	
	public Manager(int id, String name, String depart, double salary,String[] projects) {
		super(id, name, depart, salary);
		this.projects = projects;
	}
	
	@Override
	protected void work() {
		super.work();
		System.out.println("Manager is managing "+ projects);
		for(int i=0;i<projects.length;i++) {
			System.out.println(projects);
		}
	}

	

	

}
