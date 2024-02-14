package methods;


class Animal{
	public void move() {
		System.out.println("This is Animal Keyword: ");
	}
}


class Dog extends Animal{
	public void move() {
		super.move();
		System.out.println("Dogs can walk and run: ");
	}
}




public class SuperKeyword {
	
	public static void main(String[] args) {
		
		
		Animal a = new Dog();
		a.move();

	}

}
