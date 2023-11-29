package com.java.flowcontrol;

public class SwitchCase {

	public static void main(String[] args) {
		
		//in switch duplicate labels are not allowed

		int a = 10;
		final int b = 20;
		
		switch(a) {
		case 10:
			System.out.println("case 10");
			break;
		case 20:
			System.out.println("case 20");
			break;
		case 30:
			System.out.println("case 30");
			break;
		default:
			System.out.println("No Match");
		}
	}

}
