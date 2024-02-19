package encapsulation;



class Personn{
	private String name = "Kalyan";
	private int age = 21;
	
	
	//Getter Methods
	public String getName() {
		return this.name;
	}
	
	
	public int getAge() {
		return this.age;
	}
}



public class WriteClassOnly {
	
	public static void main(String[] args) {
		
		Personn per = new Personn();
		
		System.out.println(per.getName());
		System.out.println(per.getAge());
		

	}

}
