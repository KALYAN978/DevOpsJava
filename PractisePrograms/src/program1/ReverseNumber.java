package program1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		//Original Number
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int reversedNumber = 0;
		
		int temp = 0;
		
		while(number > 0) {
			// Use modulus operator to strip off the last digit
			
			temp = number%10;  // create the reversed number
			
			reversedNumber = reversedNumber * 10 + temp;
			
			number = number/10;
		}
		
		//outputing the reversed Number
		
		System.out.println("ReversedNumber is: " + reversedNumber);

	}

}
