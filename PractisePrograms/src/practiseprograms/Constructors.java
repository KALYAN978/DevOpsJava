package practiseprograms;

public class Constructors {
	
	
	int x;   // Create a class attribute

	
	//create a class contructor for main class
	public Constructors() {
		x = 5;  // Setting the initial values for the class attibute x
	}
	
	public static void main(String[] args) {
		
		Constructors con = new Constructors();
		
		System.out.println(con.x);

	}

}
