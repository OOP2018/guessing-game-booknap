import java.util.Random;
/**
 * Player guess number from 0 to 100.
 * When player guess correct number, program will tell you how many time you guessed.
 * @author Napasai Sutthichutipong
 * @version 2018.01.12
 */
public class BooknapGame extends NumberGame {

	private int upperBound;
	private int secret;
	private int count;

	/**
	 * set the secret number.
	 * @param upperbound
	 */
	public BooknapGame(int upperbound) {
		this.upperBound = upperbound;
		long seed = System.nanoTime();
		Random rand = new Random(seed);
		this.secret = rand.nextInt(upperbound);
	}

	/**
	 * If your guess number is bigger than secret number, program will tell you "Your number is too large".
     * If your guess number is smaller than secret number, program will tell you "Your number is too small".
	 * @param number that you guessed.
	 * @return true when you guessed correct number, false otherwise.
	 */
	public boolean guess(int number) {
		if (number == secret){
			count++;
			return true;
		}
		else if (number < secret) {
			setMessage("Your number is too small.");
			count++;
		}
		else if (number>secret){
			setMessage("Your number is too large.");
			count++;
		}
		return false;
	}
	
	public int getUpperBound(){
		return upperBound;
	}
	
	public String toString(){
		return "Guess number between 0 to 100";
	}
	
	public int getCount(){
		return count;
	}
	
}