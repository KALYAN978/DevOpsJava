package practiseprograms;

public class SwapNumWithOut3rdVariable {

	public static void main(String[] args) {
		
		int num1 = 10; int num2 = 20;
		System.out.println("Printing Numbers Before Swapping Are: "+num1+ " , "+num2);
		
		//add the two numbers to the first number
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 -num2;
		
		System.out.println("Printing numbers after Swapping are: "+ num1+" , "+ num2);
		
		
		
		
	}

}
