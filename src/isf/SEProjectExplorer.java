package isf;

import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class SEProjectExplorer extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage = FXMLLoader.load(Paths.get("ui/explorer.fxml").toUri().toURL());
		primaryStage.show();	
	}
	
	public static void main(String[]args) {
		launch(args);
	}
}
