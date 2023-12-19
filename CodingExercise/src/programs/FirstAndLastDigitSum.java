package programs;

public class FirstAndLastDigitSum {

	public static int sumFirstAndLastDigit(int number) {
		if (number < 0) {
			return -1;
		}

		// Finding the last digit

		int lastDigit = number % 10;

		// Find the first digit using a loop
		int firstDigit = number;
		while (firstDigit >= 10) {
			firstDigit /= 10;
		}

		// Return the sum of the first and Last Digit
		return firstDigit + lastDigit;
	}
	
	

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252));
		System.out.println(sumFirstAndLastDigit(0));
		System.out.println(sumFirstAndLastDigit(98));


	}

}
