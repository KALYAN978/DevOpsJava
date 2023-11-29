package moreinheritanceconcepts;

// Constructor chaining: is a concept where using the super method and 
// this method we can access more than one constructor of the child and parent in a single object creation

public class SuperClass {
	
	 int x;

	public SuperClass() {
		System.out.println("No Args Super Class Constructor");
	}
	
	public SuperClass(int x) {
		this();
		this.x = x;
		System.out.println("One Args Super Class Constructor");
	}
	
	 

}
