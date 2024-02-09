
public class InstanceVariablesAndMethods {
	
	int puppyAge;
	
	public InstanceVariablesAndMethods (String name) {
		System.out.println("Name Chosen is : " + name);
	}
	
	
	public void setAge(int age) {
		puppyAge = age;
	}
	
	
	public int getAge() {
		System.out.println("Puppy's age is :" + puppyAge);
		return puppyAge;
	}
	
	
	public static void main(String args[]) {
		InstanceVariablesAndMethods iv = new InstanceVariablesAndMethods("Kalyan");
		
		iv.setAge(2);
		iv.getAge();
		
		System.out.println("Variable value : "+ iv.puppyAge);
	}

}
