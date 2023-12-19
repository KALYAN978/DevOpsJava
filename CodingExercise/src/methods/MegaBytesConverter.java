package methods;

public class MegaBytesConverter {
	
	public static void printMegaByteAndKiloBytes(int kiloBytes) {
		if(kiloBytes < 0) {
			System.out.println("Invalid Value");
		}else {
			int megaBytes = kiloBytes / 1024;
			int remainingKiloBytes = kiloBytes % 1024;
			System.out.println(kiloBytes + " KB = " + megaBytes + " MB and "+ remainingKiloBytes + " KB");
		}
	}
	
	
	public static void main(String[] args) {
		printMegaByteAndKiloBytes(2500);
		printMegaByteAndKiloBytes(-1024);
		printMegaByteAndKiloBytes(5000);
	}
	
}
