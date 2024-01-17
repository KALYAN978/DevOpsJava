
class Employee{
	float salary = 80000.078f;
}


public class Inheritance1 extends Employee{

	int bonus = 1000000;
	
	public static void main(String[] args) {
		
		
		Inheritance1 in = new Inheritance1();
		
		System.out.println("Programmer salary" + in.salary);
		System.out.println("Bonus of Programmer"+ in.bonus);
	}

}
