package numbers;

import java.util.Scanner;

public class EvenOrOddSecondMethod {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number to be checked for whether a number is even or Odd: ");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if((a/2)*2 == 0){
			System.out.println(a + " Is an Even Number");
		}else {
			System.out.println(a + " is an Odd Number");
		}
		
	}
	
	
	

}
