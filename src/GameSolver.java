/**
 * Automatically solve secret number to any numberGame.
 */
public class GameSolver {
/**
 * Using for loop to check the secret from 0 until found the secret then return the solution.
 * @param game
 * @return solution
 */
	public int play(NumberGame game) {
		for (int i = 0;; i++) {
			if (game.guess(i))
				return i;
		}
	}

}
