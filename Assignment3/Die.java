import java.util.Random;

/**
 * This class represent one dice.
 * 
 * @author wenjing
 *
 */
public class Die {
	private int dieValue;

	public Die() {
		dieValue = 0;
	}

	/**
	 * To get random value as rolled value and returns it.
	 */
	public int rollDie() {
		Random random = new Random();
		dieValue = random.nextInt(6) + 1;
		return dieValue;
	}

	public void displayDie() {
		System.out.println("Your die are: " + dieValue);

	}
}
