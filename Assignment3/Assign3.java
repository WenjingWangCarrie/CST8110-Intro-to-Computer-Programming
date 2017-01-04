
public class Assign3 {

	public static void main(String[] args) {

		System.out.println("Welcome to Solitaire Dice Game. Bet an amount - "
				+ "if the sum of the three die is greater than 12, you keep your bet, "
				+ "if you roll doubles you win double your bet, if you roll triples"
				+ " you win triple your bet, otherwise you lose your bet. A bet of 0 ends the game.");
		
		Game game = new Game();
		game.playGame();

	}

}
