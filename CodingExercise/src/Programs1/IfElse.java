package Programs1;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marksObtained, passingMarks = 40;
		System.out.println("Enter your marks : ");
		
		marksObtained = sc.nextInt();
		
		if(marksObtained > passingMarks) {
			System.out.println("You are passed  ");
		}else if(marksObtained < 0) {
			System.out.println("Marks Cannot be negative!!");
		}else if(marksObtained < passingMarks) {
			System.out.println("Oops!! You are failed.");
		}else {
			System.out.println("You are absent for write the exam.");
		}

	}

}
