
import java.util.Observable;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * A class for create new window to display how many time you guessed.
 * @author Napasai Sutthichutipong
 *
 */
public class CounterView implements java.util.Observer {
	
	private Stage stage;
	private BooknapGame game;
	private Label label;
	
	/**
	 * Initialize a CounterView, which shows how many you guessed.
	 * @param game
	 */
	public CounterView(BooknapGame game) {
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
		stage.setTitle("Guess counter");
		stage.sizeToScene();
	}
	
	/** Show the window and update the value. */
	public void run() {
		stage.show();
		displayCount();
	}
	
	/** Display count. */
	public void displayCount() {
		label.setText( String.format("You guessed %d time(s)", game.getCount()) );
	}

	/** Update count. */
	@Override
	public void update(Observable o, Object arg) {
		displayCount();
	}	
}
