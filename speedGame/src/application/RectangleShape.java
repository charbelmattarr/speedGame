package application;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/*--Shape:

location
color
direction
equation*/
public class RectangleShape extends Pane{
private Equation equation;
private Color color;
private Rectangle rectangle;

public RectangleShape() {
	Rectangle rectangle = new Rectangle();
	this.equation = new Equation();
	Text text1 = new Text();
	text1.setText(equation.getEquation());
	text1.setFill(Color.RED);
	getChildren().add(text1);
	rectangle.setWidth(GameSettings.shapeWidth);
	rectangle.setHeight(GameSettings.shapeHeight);
	this.setRectangle(rectangle);
	
}


public Equation getEquation() {
	return equation;
}
public void setEquation() {
	Equation equation = new Equation();
	this.equation = equation;
}
public Color getColor() {
	return color;
}
public void setColor() {
	this.color = GameSettings.shapeColor;
	
}

public Rectangle getRectangle() {
	return rectangle;
}

public void setRectangle(Rectangle rectangle) {
	this.rectangle = rectangle;
}


}