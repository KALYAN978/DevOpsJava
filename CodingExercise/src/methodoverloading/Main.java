package methodoverloading;

public class Main {
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}
	
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed score: " + score + " points");
		return score * 1000;
	}
	
	
	public static int calculateScore() {
		System.out.println("No player name, no player sore");
		return 0;
	}
	

	public static void main(String[] args) {
		
	int newScore = calculateScore("Tim", 500);
	System.out.println("New Score is : " + newScore);
	
	calculateScore(75);
	
	
	calculateScore();

	}

}
