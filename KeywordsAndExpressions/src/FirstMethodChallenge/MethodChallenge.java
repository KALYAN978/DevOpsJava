package FirstMethodChallenge;

public class MethodChallenge {
	
	
	public static void displayHighScorePosition(String playerName,int highScorePosition) {
		System.out.println(playerName + " Managed to get into position" 
				+highScorePosition + "on the high score list");
	}
	
	
	
	public static int calculateHighScorePosition(int playerScore) {
		if (playerScore >= 1000) {
			return 1;
		}else if( playerScore >= 500 && playerScore < 1000) {
			return 2;
		}else if(playerScore >= 100 && playerScore < 500) {
			return 3;
		}else {
			return 4;
		}
	}
	
	

	public static void main(String[] args) {
		
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Tim", highScorePosition);
		
		
		highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("Bob",highScorePosition);
		
		highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition("Mercy",highScorePosition);
		
		
		highScorePosition = calculateHighScorePosition(100);
		displayHighScorePosition("Rudra",highScorePosition);
		
		highScorePosition = calculateHighScorePosition(25);
		displayHighScorePosition("Check",highScorePosition);
			
		}

	

}
