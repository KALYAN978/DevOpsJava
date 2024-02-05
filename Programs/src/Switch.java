
public class Switch {

	public static void main(String[] args) {

		char grade = 'c';
		
		switch(grade) {
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
		case 'C':
			System.out.println("You Passed");
			break;
		default:
			System.out.println("Invalid grade");
		}
		
		System.out.println("Your grade is "+ grade);

	}

}
