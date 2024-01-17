package classesobjects;

public class Animal {

	void bark() {
		System.out.println("Bow-bow-bow");
	}
	
	
	public static void main(String[] args) {
		
		
		
		Animal animal = new Animal();
		
		Animal animal2 = new Animal();
		
		animal.bark();
		animal2.bark();
	}

}
