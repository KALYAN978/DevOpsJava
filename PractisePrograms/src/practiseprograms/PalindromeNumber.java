package practiseprograms;



// Palindrom Number Algorithm
// Get the number to check for palindrome
// Hold the Number in temporary variable
// Reverse the number
// Compare the temporary number with reversed number
// if Both numbers are same, print "palindrome Number"
// Else print "not palindrome number"


public class PalindromeNumber {

	public static void main(String[] args) {
		
		
		int r, sum = 0, temp;
		int n = 454; // It is the number variable to be checked for palindrome
		
		temp = n;
		while(n>0) {
			r = n%10;  // getting remainder
			sum = (sum * 10) + r;
			
			n = n/10;
		}
		if(temp == sum)
		{
			System.out.println("It is a palindrome number");
		}
		else {
			System.out.println("Not a palindrome Number");
		}
		

	}

}
