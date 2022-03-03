package application;





import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.beans.value.WritableValue;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/*--GamePanel

lines*/

public class GamePanel extends Pane {
	Rectangle rectangleTop =new Rectangle();

public GamePanel() {
	
	
	// red top rectangle 
	rectangleTop.setFill(Color.FIREBRICK);
	rectangleTop.setHeight(20);
	rectangleTop.setWidth(2300);
	rectangleTop.setY(50);
	rectangleTop.setX(0);
	rectangleTop.setStroke(Color.FIREBRICK);
	getChildren().add(rectangleTop);
	
	
	//1st rectangle
	RectangleShape rectangleShape = new RectangleShape();
	Line line1 = new Line(470,900,470,-210);
	
	getChildren().add(line1);
	line1.setStroke(Color.TRANSPARENT);
	getChildren().add(rectangleShape.getRectangle());
	
	
	PathTransition pathTransition = new PathTransition(Duration.millis(13000), line1, rectangleShape.getRectangle());
	pathTransition.play();
	
	rectangleShape.setRectangleColor(rectangleShape);

	KeyFrame keyFrame1 = new KeyFrame(Duration.millis(15000), e -> makeNewRectangle(line1 , Duration.millis(13000)));
	Timeline timeLine1 = new Timeline(keyFrame1);
	timeLine1.setCycleCount(Timeline.INDEFINITE);
	timeLine1.play();
	

	
	Line line2 = new Line(670,900,670,-210);
	line2.setStroke(Color.TRANSPARENT);
	RectangleShape rectangleShape2 = new RectangleShape();
	
	
	getChildren().add(line2);
	getChildren().add(rectangleShape2.getRectangle());
	
	PathTransition pathTransition2 = new PathTransition(Duration.millis(12000),line2,rectangleShape2.getRectangle());
	pathTransition2.play();
	
	rectangleShape2.setRectangleColor(rectangleShape2);
	
	KeyFrame keyFrame2 = new KeyFrame(Duration.millis(14000), e -> makeNewRectangle(line2 , Duration.millis(12000)));
	Timeline timeLine2 = new Timeline(keyFrame2);
	timeLine2.setCycleCount(Timeline.INDEFINITE);
	timeLine2.play();
	
	
	Line line3 = new Line(870,900,870,-210);
	line3.setStroke(Color.TRANSPARENT);
	RectangleShape rectangleShape3 = new RectangleShape();
	
	
	getChildren().add(line3);
	getChildren().add(rectangleShape3.getRectangle());
	
	PathTransition pathTransition3 = new PathTransition(Duration.millis(12000),line3,rectangleShape3.getRectangle());
	pathTransition3.play();
	
	rectangleShape3.setRectangleColor(rectangleShape2);
	
	KeyFrame keyFrame3 = new KeyFrame(Duration.millis(14000), e -> makeNewRectangle(line3 , Duration.millis(12000)));
	Timeline timeLine3 = new Timeline(keyFrame3);
	timeLine3.setCycleCount(Timeline.INDEFINITE);
	timeLine3.play();
}



private void makeNewRectangle(Line line, Duration duration) {

	RectangleShape rectangleShape12 = new RectangleShape();
	this.getChildren().add(rectangleShape12.getRectangle());
	
	PathTransition pathTransition = new PathTransition(duration , line , rectangleShape12.getRectangle());
	pathTransition.play();
	rectangleShape12.setRectangleColor(rectangleShape12);
	
}



}

