package Polymorphism.overriding;

public class Overriding {

	public static void main(String[] args) {

		Parent.doSomething();
		Child.doSomething();
		
		
		Parent p = new Parent();
		System.out.println(p.s);
		
		Child c = new Child();
		System.out.println(c.s);
		                               
		                           //Runtime Polymorphism
		Parent c1 = new Child();   //Creating the child Object
		System.out.println(c1.s);
		
	}

}
