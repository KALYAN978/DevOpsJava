
public class NarrowingTypeCasting {

	public static void main(String[] args) {

		int num = 5004;
		
		double doubleNum = (double) num;
		
		System.out.println("The Value of : " + num + " after converting to the double is :" + doubleNum);
		
		
		//Type Casting double into int 
		
		int ConvertedDoubleToInt = (int) doubleNum;
		System.out.println(doubleNum + ConvertedDoubleToInt);
	}

}
