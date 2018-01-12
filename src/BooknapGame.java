import java.util.Random;

public class BooknapGame extends NumberGame {

	private int upperBound;
	private int secret;
	private int count;

	public BooknapGame(int upperbound) {
		final int base = 16;
		this.upperBound = upperbound;
		long seed = System.nanoTime();
		Random rand = new Random(seed);
		// don't just copy this.
		// random.nextInt(n) returns a random integer between 0 and n-1,
		// inclusive.
		this.secret = rand.nextInt(Math.max(upperbound - 10, 1)) + 10;
		super.setMessage("What is the decimal value of 0x" + Integer.toString(secret, base) + " (hexadecimal)?");
	}

	public boolean guess(int number) {
		if (number == secret)
			return true;
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
		return "Convert a number from hexadecimal to decimal.";
	}
	
	public int getCount(){
		return count;
	}
	
}