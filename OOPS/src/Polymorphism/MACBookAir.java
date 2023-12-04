package Polymorphism;

public class MACBookAir extends MACBook {
	
	
	@Override
	public void start() {
		System.out.println("Inside MacBookAir start Method");
	}
	
	
	@Override
	public void shutdown() {
		System.out.println("Inside MacBookAir shutdown Method");
	}

}
