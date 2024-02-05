package numbers;

public class InstanceVariables {
	
	public String name;
	public double salary;
	
	public InstanceVariables(String eName) {
		name = eName;
	}
	
	
	public void setSalary(double empSal) {
		salary = empSal;
	}

	public static void main(String[] args) {
		
		InstanceVariables in = new InstanceVariables("Kalyan");
		in.setSalary(1000);
		

	}

}
