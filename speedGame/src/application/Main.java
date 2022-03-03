package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;


public class Main extends Application {
	public static Stage primaryStage;
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		BorderPane rootPane = new BorderPane();
		
		
		GamePanel gamePanel = new GamePanel();
		rootPane.setCenter(gamePanel);
		
		 
		Scene scene = new Scene(rootPane,900,600);
		
		System.out.println("entered main");
		primaryStage.setTitle("Speed Game"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
		}
	

	public static void main(String[] args) {
		launch(args);
	}
	public Scene getScene() {
	
	BorderPane rootPane = new BorderPane();
	
	
	GamePanel gamePanel = new GamePanel();
	rootPane.setCenter(gamePanel);
	
	 
	Scene scene = new Scene(rootPane,900,600);
	
	return scene;
	}
	
}

