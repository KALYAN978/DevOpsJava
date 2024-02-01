package numbers;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		System.out.println("Enter a number to check whether it is Even or Odd: ");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println(a+ "is an Even Number");
		}
		else {
			System.err.println(a + " is an Odd number");
		}

	}

}
