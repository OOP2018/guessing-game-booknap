/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main {
	public static void main(String[] args) {
		int upperBound = 100;
		NumberGame game = new BooknapGame(upperBound);
		GameSolver solver = new GameSolver();
		GameConsole ui = new GameConsole( );
		
		int solution = ui.play( game );
		System.out.println("correct! the answer is "+solution);
		System.out.println("You guessed "+game.getCount()+" times.");
		System.out.println(solver.play(game));
		}
}
