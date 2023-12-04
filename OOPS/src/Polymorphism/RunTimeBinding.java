package Polymorphism;

public class RunTimeBinding {

	public static void main(String[] args) {

		AppleLaptop m1 = new MACBookPro();

		AppleLaptop m2 = new MACBookAir();
		
		//Object UpCasting 

		m1.start();
		m1.shutdown();
		
		
		MACBookPro m3 = (MACBookPro) m1;  //Object DownCasting
		m3.prosmethod();

		m2.start();
		m2.shutdown();
		
		MACBookAir m4 = (MACBookAir) m2;  //Object DownCasting
		

	}

}
