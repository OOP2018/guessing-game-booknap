import javafx.fxml.FXML;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;

/**
 * Controller for the Game buttons user interface.
 * @author Napasai Sutthichutipong
 *
 */
public class GameController {

	@FXML
	private TextField field;

	@FXML
	private Labeled label;
	private CounterView counterView;
	private GuessView guessView;
	private BooknapGame game;

	/**
	 * Initialize the game.
	 */
	@FXML
	public void initialize() {
		game = new BooknapGame(100);
		counterView = new CounterView(game);
		guessView = new GuessView(game);
		counterView.run();
		guessView.run();
	}
	
	/**
	 * This method use to handle guess button.
	 */
	public void handleGuess() {
		try {
			int number = Integer.parseInt(field.getText());
			game.guess(number);
			label.setText(game.getMessage());
			counterView.displayCount();
			guessView.displayGuess();
			field.clear();
		} catch (NumberFormatException e) {
			label.setText("Invalid number");
		}
	}

	/**
	 * This method use to handle clear button.
	 */
	public void handleClear() {
		field.clear();
		label.setText("");
	}
	
}
