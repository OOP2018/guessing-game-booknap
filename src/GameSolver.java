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
		int max = game.getUpperBound();
		int min = 0;
		int ans; boolean nigger = false;
		do {
			ans = (max + min)/2;
			nigger = game.guess(ans);
			if (game.getMessage().contains("small")) {
				min = ans;
			} else if (game.getMessage().contains("large")) {
				max = ans;
			}
			
	} while (!nigger);
		return ans;
	
	
}
	
}
