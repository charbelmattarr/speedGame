package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.control.*;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {

			
			Equation equation1 = new Equation();
			equation1.setFirstValue();
			equation1.setSecondValue();
			equation1.printEquation();
			
			
			
			BorderPane root = new BorderPane();
			
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Speed Game");
			primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
