
public class Methods {
	
	
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		
		int finalScore = score;
		
		if (gameOver) {
			finalScore += (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("your final score "+ finalScore);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		
		calculateScore(gameOver, score, levelCompleted,9 );
		
		calculateScore(true, 10000, 8, 200);
		
		
		
		
		
		
		
		
		
	}

}
