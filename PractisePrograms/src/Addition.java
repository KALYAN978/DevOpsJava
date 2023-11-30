import java.util.Scanner;

public class Addition {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two Numbers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = a + b;

		System.out.println(result);
		
	}

}
