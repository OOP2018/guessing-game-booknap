
import java.util.Observable;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * A class for create new window to display last guess number.
 * @author Napasai Sutthichutipong
 *
 */
public class GuessView implements java.util.Observer {

	private Stage stage;
	private BooknapGame game;
	private Label label;

	/**
	 * Initialize a GuessView, which shows last guess number.
	 * @param game
	 */
	public GuessView(BooknapGame game) {
		this.game = game;
		initComponents();
	}

	/** Set new window. */
	private void initComponents() {
		stage = new Stage();
		HBox root = new HBox();
		root.setPadding(new Insets(50));
		root.setAlignment(Pos.CENTER);
		label = new Label("   ");
		label.setPrefWidth(250);
		label.setFont(new Font("Arial", 20.0));
		label.setAlignment(Pos.CENTER);
		root.getChildren().add(label);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Last Guess");
		stage.sizeToScene();
	}

	/** Show the window and update the value. */
	public void run() {
		stage.show();
		displayGuess();
	}

	/** Display last guess number */
	public void displayGuess() {
		label.setText(String.format("Last guess is %d", game.getLastGuess()));
	}

	/** Update last guess number */
	@Override
	public void update(Observable o, Object arg) {
		displayGuess();
	}
}
