package loops;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Testing Center!!! ");
		System.out.println("Please Enter your marks: ");
		
		int marksObtained, passingMarks = 40;
		marksObtained = sc.nextInt();
		
		if (marksObtained >= passingMarks) {
			System.out.println("you passed the test.");
		}
		else {
			System.out.println("Oops!! you failed the test.");
		}
		

	}

}
