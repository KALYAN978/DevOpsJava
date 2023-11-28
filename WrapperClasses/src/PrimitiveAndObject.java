
public class PrimitiveAndObject {

	public static void main(String[] args) {

		int x = 100;
		//To Converting this integer to Integer Object
		Integer y = Integer.valueOf(x);
		y.intValue();
		
		//Converting again Integer Object to Primitive Value
		int z = y.intValue();
	}

}
