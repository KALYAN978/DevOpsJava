package practiseprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class CalculateCircleArea {

	public static void main(String[] args) throws IOException {
		
		
		int radius = 0;
		
		System.out.println("Enter a radius: ");
		
		try {
			//get the radius from the console
			
			Scanner sc = new Scanner(System.in);
			
			radius = sc.nextInt();
			
		}
		//if Invalid value has entered
		catch(NumberFormatException ne) {
			System.out.println("Invalid Radius value: "+ ne);
		}

		double area = Math.PI * radius * radius;
		
		System.out.println(area);
		
	}

}
