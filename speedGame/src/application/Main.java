package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		BorderPane rootPane = new BorderPane();
		
		
		GamePanel gamePanel = new GamePanel();
		rootPane.setCenter(gamePanel);
		
		
		Scene scene = new Scene(rootPane,600,600);
		
		
		primaryStage.setTitle("Speed Game"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
		}
	

	public static void main(String[] args) {
		launch(args);
	}
	
	
}

