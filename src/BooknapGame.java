import java.util.Random;

/**
 * Player guess number from 0 to 100. When player guess correct number, program
 * will tell you how many time you guessed.
 * 
 * @author Napasai Sutthichutipong
 * @version 2018.01.12
 */
public class BooknapGame extends NumberGame {

	private int upperBound;
	private int secret;
	private int count;
	private int lastGuess;

	/**
	 * set the secret number.
	 * 
	 * @param upperbound
	 */
	public BooknapGame(int upperbound) {
		this.upperBound = upperbound;
		long seed = System.nanoTime();
		Random rand = new Random(seed);
		this.secret = rand.nextInt(upperbound);
	}

	/**
	 * If your guess number is bigger than secret number, program will tell you
	 * "Your number is too large". If your guess number is smaller than secret
	 * number, program will tell you "Your number is too small".
	 * 
	 * @param number
	 *            that you guessed.
	 * @return true when you guessed correct number, false otherwise.
	 */
	public boolean guess(int number) {
		lastGuess = number;
		if (lastGuess == secret) {
			setMessage("Correct! the secret number is " + secret);
			count++;
			return true;
		} else if (lastGuess < secret) {
			setMessage("Your number is too small.");
			count++;
		} else if (lastGuess > secret) {
			setMessage("Your number is too large.");
			count++;
		}
		return false;
	}

	/**
	 * Get upperbound of the game.
	 * 
	 * @return upperbound of the game.
	 */
	public int getUpperBound() {
		return upperBound;
	}

	@Override
	public String toString() {
		return String.format("Guess number between 0 to %d", upperBound);
	}

	/**
	 * Get number of guesses.
	 * 
	 * @return number of guesses.
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Get last guess number.
	 * 
	 * @return last guess number
	 */
	public int getLastGuess() {
		return lastGuess;
	}

}