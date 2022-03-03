package application;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TryAgain extends Application {

 
	public Stage primaryStage;
//	public void start(Stage primaryStage) {
	
	public Scene getScene(){
	
		BorderPane pane = new BorderPane();
		Scene sc = new Scene(pane,800,800);
		sc.setFill(Color.BLACK);
	    
		VBox box1 = new VBox();
		pane.setTop(box1);
		
	    
		Text youLost = new Text("GAME OVER!.....");
		youLost.setFill(Color.WHITE);
		youLost.setStyle("-fx-font-size: 60px");
		box1.getChildren().add(youLost);
		
		
		Text yourScore = new Text("your score is :   " + GameSettings.score);
		yourScore.setFill(Color.WHITE);
		yourScore.setStyle("-fx-font-size: 18px");
		box1.getChildren().add(yourScore);
		
		VBox box2 = new VBox();
		box2.setAlignment(Pos.CENTER);
		//box2.getChildren().add(yourScore);
		pane.setCenter(box2);
		
		Button TryAgain = new Button("play Again");
		TryAgain.setPrefHeight(75);
		TryAgain.setPrefWidth(100);
		TryAgain.setOnAction(e->{
			
			ChangeScenes();
		});
		VBox box3 = new VBox();
		box3.setAlignment(Pos.BOTTOM_CENTER);
		box3.getChildren().add(TryAgain);
		pane.setBottom(box3);
		Background bg = new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY , Insets.EMPTY));
		
		// set background
		pane.setBackground(bg);
		
		//pane.getChildren().addAll(box1,box2,box3);
		
		return (sc);
		//primaryStage.setScene(sc);
		//primaryStage.show();
	}

	private void ChangeScenes() {
		
		Main main = new Main();
		Scene scene = main.getScene();
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
   
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}