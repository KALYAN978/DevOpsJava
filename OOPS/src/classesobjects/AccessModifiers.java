package classesobjects;

public class AccessModifiers {
	
	private int vehicleSpeed;
	private int vehicleWheels;
	private String color;

	public static void horn() {
		System.out.println("Beep-Beep");
	}
	public static void main(String[] args) {

		horn();
	}

}
