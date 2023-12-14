
public class OperatorPrecedence {

	public static void main(String[] args) {
		
		double myFirstValue = 20.00d;
		double mySecondValue = 80.00d;
		
		double TotalValue = myFirstValue + mySecondValue * 100.00d;
		System.out.println(TotalValue);
		
		double remainder = TotalValue % 40.00d;
		System.out.println(remainder);
		
		boolean isNoRemainder = (remainder == 0) ? true : false ;
		System.out.println(isNoRemainder);
		
		if(!isNoRemainder) {
			System.out.println("Got some remainder");
		}
		
		

	}

}
