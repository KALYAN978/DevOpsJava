
public class ObjectAndString {

	public static void main(String[] args) {

		long x = 1000;
		
		Long y = Long.valueOf(x);  //Object
		
		String s = y.toString();  //Converted Object to String
		
		// To Convert from String to Object
		Long z = Long.valueOf(s);
	}

}
