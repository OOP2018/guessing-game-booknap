/**
 * Automatically solve secret number to any numberGame.
 * @author Napasai Sutthichutipong
 */
public class GameSolver {
	/**
	 * Play a number and return the solution.
	 * @param NumberGame to solve.
	 * @return solution of game.
	 */
	public int play(NumberGame game) {
		int max = game.getUpperBound();
		int min = 0;
		int ans;
		boolean check = false;
		do {
			ans = (max + min) / 2;
			check = game.guess(ans);
			if (game.getMessage().contains("small")) min = ans;
			else if (game.getMessage().contains("large")) max = ans;
		} while (!check);
		return ans;
	}

}
