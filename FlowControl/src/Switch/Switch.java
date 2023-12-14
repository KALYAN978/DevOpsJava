package Switch;

public class Switch {

	public static void main(String[] args) {

//		int value = 3;
//		if(value ==1 ) {
//			System.out.println("Value was 1");
//		}else if(value == 2) {
//			System.out.println("value was 2");
//		}else {
//			System.out.println("Neither 1 nor 2");
//		}

		int switchValue = 1;

		switch (switchValue) {
		case 1:
			System.out.println("Value is : 1");
			break;
		case 2:
			System.out.println("value is : 2");
			break;
		case 3:
			System.out.println("value is : 3");
			break;
		default:
			System.out.println("value not defined");
		}

	}

}
