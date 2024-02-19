package encapsulation;

public class RunEncap {

	public static void main(String[] args) {
		
		EncapTest encap = new EncapTest();
		encap.setName("kalyan");
		encap.setAge(23);
		encap.setIdNum("12313d3e");
		
		System.out.println(encap.getName() + " " + encap.getAge() + " " + encap.getIdNum());

	}

}


