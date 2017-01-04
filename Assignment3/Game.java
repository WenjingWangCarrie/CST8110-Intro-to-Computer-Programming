import java.util.Scanner;

public class Game {
	private int potAmount;
	private int betAmount;
	private Scanner sc = new Scanner(System.in);

	public Game() {
		potAmount = 50;
	}

	public int getBetAmountFromUser() {

		while (true) {
			System.out.println("Enter your bet amount");
			while (!sc.hasNextInt())
				sc.nextInt();
			betAmount = sc.nextInt();

			if (betAmount == 0) {
				System.out.println("You end the game with ot of " + potAmount);
				break;
			} else if (betAmount > potAmount) {
				System.out.println("Error - cannot bet less than 0 or morre that " + potAmount + "...");
			}

		}
		return betAmount;
	}

	/**
	 * It will have three local reference variables referring to three different
	 * objects of Die class to represent the three dice in the game.
	 */
	public void playGame() {

		Die die1 = new Die();
		Die die2 = new Die();
		Die die3 = new Die();

		while (true) {
			System.out.println("Your current pot is " + potAmount);
			if (potAmount == 0) {
				System.out.println("No enough pot, exit");
				break;
			}

			System.out.println("Enter your bet amount");
			betAmount = sc.nextInt();

			potAmount -= betAmount;

			int dieValue1 = die1.rollDie();
			int dieValue2 = die1.rollDie();
			int dieValue3 = die1.rollDie();
			int sum = dieValue1 + dieValue2 + dieValue3;

			System.out.println("Your die are: " + dieValue1 + " " + dieValue2 + " " + dieValue3);

			if (sum > 12) {
				System.out.println("You WIN...your bet back");
				potAmount += betAmount;
			} else if (dieValue1 == dieValue2 || dieValue1 == dieValue3 || dieValue2 == dieValue3) {
				potAmount += betAmount * 2;
				System.out.println("You WIN...double your bet");
			} else if (dieValue1 == dieValue2 && dieValue1 == dieValue3) {
				potAmount += betAmount * 3;
				System.out.println("You WIN...triples your bet");
			} else {
				System.out.println("You LOSE...your bet");
			}
			
			System.out.println();
		}
	}

}
