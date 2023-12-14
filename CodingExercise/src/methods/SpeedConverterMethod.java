package methods;

public class SpeedConverterMethod {
	
	
	public static long toMilesPerHour(double kilometersPerHour) {
		if(kilometersPerHour < 0) {
			return -1;
		}else {
		return Math.round(kilometersPerHour/1.609);
		}
	}
	
	
	public static void printConversion(double kilometerPerHour) {
		long milesPerHour = toMilesPerHour(kilometerPerHour);
		
		if(milesPerHour == -1) {
			System.out.println("Invalid Value");
		}else {
			System.out.println(kilometerPerHour + "km/h" + milesPerHour + "mi/h");
		}
	}

	public static void main(String[] args) {
		
		printConversion(1.5);
		printConversion(10.25);
		printConversion(-5.6);
		printConversion(35.43);
		printConversion(75.114);
		

	}

}
