/**
 * Automatically solve secret number to any numberGame by using for loop.
 */
public class GameSolver {

	public int play(NumberGame game) {
		for (int i = 0;; i++) {
			if (game.guess(i))
				return i;
		}
	}

}
