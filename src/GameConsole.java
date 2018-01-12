import java.util.Scanner;

/**
 * Play guessing game on the console.
 */
public class GameConsole {

	/** play the game. */
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
