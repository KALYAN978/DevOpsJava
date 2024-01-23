package practiseprograms;

import java.util.Scanner;

// write a palindrome program by taking input from the user 

public class PalindromeNumberScanner {
	
	
	public static void main(String[] args) {
		
		String original, reverse = "";
		
		System.out.println("Enter a String/numnber to check whether it is a palindrome or not!!!");
		
		Scanner sc = new Scanner(System.in);
		
		original = sc.next();
		
		int length = original.length();
		
		for(int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("Entered String is palindrome");
			
		}
		else {
			System.out.println("Entered string is not output");
		}
	 
		
		
		

	}

}
  