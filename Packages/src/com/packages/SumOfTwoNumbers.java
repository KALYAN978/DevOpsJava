package com.packages;

import java.util.Scanner;
//import static java.lang.Integer.*;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		System.out.println("Enter Two Numbers: ");
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = Integer.parseInt(sc.next());
		int num2 = sc.nextInt();
		
		int result = num1 + num2;
		
		System.out.println(result);
		

	}

}
