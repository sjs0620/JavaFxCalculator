package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
		
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("JavaFx 계산기 프로그램");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
