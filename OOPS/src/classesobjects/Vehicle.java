package classesobjects;

public class Vehicle {
	
	
	int maxSpeed;
	int wheels;
	String color;
	
	double fuelCapacity;
	
	void horn() {
		System.out.println("Beep-Beep");
	}
	
	

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		
		vehicle.color = "Blue";
		vehicle.horn();
		
		

	}

}
