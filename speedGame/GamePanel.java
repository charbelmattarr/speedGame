package application;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.beans.value.WritableValue;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.util.Duration;

/*--GamePanel

lines*/

public class GamePanel extends Pane {
public GamePanel() {
	
	RectangleShape rectangleShape = new RectangleShape();
	
	
	
	Line line1 = new Line();
	line1.setStartX(400); 
	line1.setStartY(900);
	line1.setEndX(400);
	line1.setEndY(-210);
	
	
	getChildren().add(line1);
	getChildren().add(rectangleShape.getRectangle());

	
	
	PathTransition pathTransition = new PathTransition();
	pathTransition.setDuration(Duration.millis(7000));
	pathTransition.setPath(line1);
	pathTransition.setNode(rectangleShape.getRectangle());
	pathTransition.setAutoReverse(false);
	pathTransition.play();
	//pathTransition.getCycleCount(); 

	KeyFrame keyFrame = new KeyFrame(javafx.util.Duration.millis(50), e -> makeNewRectangle(line1));
	Timeline timeLine = new Timeline(keyFrame);
	RectangleShape rectangleShape2 = new RectangleShape();
	
	
	Line line2 = new Line();
	line2.setStartX(600);
	line2.setStartY(900);
	line2.setEndX(600);
	line2.setEndY(-210);
	
	
	getChildren().add(line2);
	getChildren().add(rectangleShape2.getRectangle());

	
	
	PathTransition pathTransition2 = new PathTransition();
	pathTransition2.setDuration(Duration.millis(4000));
	pathTransition2.setPath(line2);
	pathTransition2.setNode(rectangleShape2.getRectangle());
	pathTransition2.setCycleCount(Timeline.INDEFINITE);
	pathTransition2.setAutoReverse(false);
	pathTransition2.play();
	
	
	RectangleShape rectangleShape3 = new RectangleShape();
	
	Line line3 = new Line();
	line3.setStartX(800);
	line3.setStartY(900);
	line3.setEndX(800);
	line3.setEndY(-210);
	
	
	getChildren().add(line3);
	getChildren().add(rectangleShape3.getRectangle());

	
	
	PathTransition pathTransition3 = new PathTransition();
	pathTransition3.setDuration(Duration.millis(9000));
	pathTransition3.setPath(line3);
	pathTransition3.setNode(rectangleShape3.getRectangle());
	pathTransition3.setCycleCount(Timeline.INDEFINITE);
	pathTransition3.setAutoReverse(false);
	pathTransition3.play();
}

private void makeNewRectangle(Line line1) {
	RectangleShape rectangleShape12 = new RectangleShape();
	getChildren().add(rectangleShape12.getRectangle());
	PathTransition pathTransition = new PathTransition();
	pathTransition.setDuration(Duration.millis(7000));
	pathTransition.setPath(line1);
	pathTransition.setNode(rectangleShape12.getRectangle());
	pathTransition.setAutoReverse(false);
	pathTransition.play();
}


}