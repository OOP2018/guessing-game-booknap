import java.util.Scanner;

/**
 * Play guessing game on the console.
 * @author Napasai Sutthichutipong
 */
public class GameConsole {

	/**
	 * Play the game.
	 * @param NumberGame to play.
	 * @return how many time player guessed.
	 */
	public int play(NumberGame game) {
		Scanner console = new Scanner(System.in);

		System.out.println(game.toString());
		int guess = 0;
		while (true) {
			System.out.println(game.getMessage());
			System.out.print("Your answer? ");
			guess = console.nextInt();
			boolean correct = game.guess(guess);
			if (correct) break;
		}
		return guess;
	}

}
