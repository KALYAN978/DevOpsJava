package practiseprograms;

public class ReverseNumber {

	public static void main(String[] args) {
		
//		// Original Number
//		int number = 1234;
//		
//		int reversedNumber = 0;
//		int temp=0;
//		
//		while(number > 0) {
//			// use the modulus operator to strip the last digit
//			temp = number%10; //Created the reversed Number
//			
//			reversedNumber = reversedNumber * 10 + temp;
//			number = number/10;
//			
//			//Output the reversed Number
//			System.out.println("Reversed Number is: "+ reversedNumber);
//			
//		}
		
		
		
		
		
		int number = 1234;
		
		int reversedNumber = 0;
		int temp = 0;

		
		while (number > 0) {
			//use the modulus operator to strip off the last digit
			temp = number % 10;  //created the reverseNumber
			reversedNumber = reversedNumber * 10 + temp;
			number = number/10;
		}
		
		//Output the result 
		System.out.println("Reversed Number is : " + reversedNumber);

	}

}
