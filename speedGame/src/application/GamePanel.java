package application;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
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

	
	
	PathTransition pt = new PathTransition();
	pt.setDuration(Duration.millis(7000));
	pt.setPath(line1);
	pt.setNode(rectangleShape.getRectangle());
	pt.setCycleCount(Timeline.INDEFINITE);
	pt.setAutoReverse(false);
	pt.play();
	
	RectangleShape rectangleShape2 = new RectangleShape();
	
	
	Line line2 = new Line();
	line2.setStartX(600);
	line2.setStartY(900);
	line2.setEndX(600);
	line2.setEndY(-210);
	
	
	getChildren().add(line2);
	getChildren().add(rectangleShape2.getRectangle());

	
	
	PathTransition pt2 = new PathTransition();
	pt2.setDuration(Duration.millis(4000));
	pt2.setPath(line2);
	pt2.setNode(rectangleShape2.getRectangle());
	pt2.setCycleCount(Timeline.INDEFINITE);
	pt2.setAutoReverse(false);
	pt2.play();
	
	
	RectangleShape rectangleShape3 = new RectangleShape();
	
	Line line3 = new Line();
	line3.setStartX(800);
	line3.setStartY(900);
	line3.setEndX(800);
	line3.setEndY(-210);
	
	
	getChildren().add(line3);
	getChildren().add(rectangleShape3.getRectangle());

	
	
	PathTransition pt3 = new PathTransition();
	pt3.setDuration(Duration.millis(9000));
	pt3.setPath(line3);
	pt3.setNode(rectangleShape3.getRectangle());
	pt3.setCycleCount(Timeline.INDEFINITE);
	pt3.setAutoReverse(false);
	pt3.play();
}
}