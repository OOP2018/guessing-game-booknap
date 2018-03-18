import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main class to start the program.
 * @author Napasai Sutthichutipong
 *
 */
public class GameApp extends Application {

	/**
	 * The main entry point for all JavaFX applications. The start method is called
	 * after the init method has returned, and after the system is ready for the
	 * application to begin running. 
	 * @param stage
	 */
	@Override
	public void start(Stage stage) {
		try {
			Parent root = (Parent) FXMLLoader.load(getClass().getResource("GameUI.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.sizeToScene();
			stage.setTitle("Guessing Game");
			stage.show();
		} catch (Exception e) {
			System.out.println("Exception creating scene: " + e.getMessage());
		}
	}

	/**
	 * Main method to run the program.
	 * @param args not used
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
