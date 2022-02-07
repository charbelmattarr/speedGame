package application;

import javafx.scene.Group;
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
private String stringTextEquation;
private Color color;
private Rectangle rectangle;
public Pane rectanglePane;

public RectangleShape() {
	rectanglePane = new Pane();
	rectangle = new Rectangle();
	equation = new Equation();

	rectangle.setWidth(GameSettings.shapeWidth);
	rectangle.setHeight(GameSettings.shapeHeight);
	rectangle.setStroke(Color.GREEN);
	rectangle.setFill(Color.WHITE);
	this.setRectangle(rectangle);
	rectanglePane.getChildren().add(rectangle);
	
	Text textEquation = new Text(equation.getEquation());
	textEquation.setStroke(GameSettings.equationColor);
	textEquation.setFill(Color.WHITE);
	textEquation.setY(rectangle.getHeight()/2);
	textEquation.setId("equationDesign");
	textEquation.setStyle("-fx-font-size: 30px");
    
    rectanglePane.getChildren().add(textEquation);
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

public Pane getRectangle() {
	return rectanglePane;
}

public void setRectangle(Rectangle rectangle) {
	this.rectangle = rectangle;
}


}