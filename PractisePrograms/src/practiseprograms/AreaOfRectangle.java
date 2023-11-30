package practiseprograms;

import java.io.IOException;
import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {

		int width = 0;
		int height = 0;

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter length of a rectangle: ");

			height = sc.nextInt();
			width = sc.nextInt();
		}
		// If Invalid value has entered
		catch (Exception e) {

			System.out.println(e);
			System.exit(0);
		}

		int area = width * height;
		System.out.println("Area of Rectangle: "+ area);
	}

}
