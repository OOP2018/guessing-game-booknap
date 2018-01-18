import java.util.Random;
/**
 * Guessing game.
 * 
 * @author Napasai Sutthichutipong
 * @version 2018.01.12
 */
public class BooknapGame extends NumberGame {

	private int upperBound;
	private int secret;
	private int count;

	public BooknapGame(int upperbound) {
		this.upperBound = upperbound;
		long seed = System.nanoTime();
		Random rand = new Random(seed);
		this.secret = rand.nextInt(upperbound);
	}

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