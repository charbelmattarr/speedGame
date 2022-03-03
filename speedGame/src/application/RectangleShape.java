package application;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

/*--Shape:

location
color
direction
equation*/



public class RectangleShape extends Pane{
private Equation equation;
private  Color color = Color.TRANSPARENT;
private Rectangle rectangle;
private Pane rectanglePane;



private Integer clicks = 0;
public Boolean Pressed ;
public Boolean HalfPressed ;
public Boolean losePressed;
public int win;
public Boolean checked;
public RectangleShape() {
	checked = false;
	rectanglePane = new Pane();
	rectangle = new Rectangle();
	equation = new Equation();
	rectangle.setWidth(GameSettings.shapeWidth);
	rectangle.setHeight(GameSettings.shapeHeight);
	rectangle.setStroke(Color.TRANSPARENT);
	rectangle.setFill(Color.TRANSPARENT);
	this.setRectangle(rectangle);
	rectanglePane.getChildren().add(rectangle);
	
	
	
	//text equation
	Text textEquation = new Text(equation.getEquation());
	textEquation.setStroke(GameSettings.equationColor);
	textEquation.setFill(Color.WHITE);
	textEquation.setY(rectangle.getHeight()/2);
	textEquation.setId("equationDesign");
	textEquation.setStyle("-fx-font-size: 30px");
    rectanglePane.getChildren().add(textEquation);
    
    //setting colors on mouse clicks
    
    rectangle.setOnMouseClicked(e->{
    	
    	if((equation.getFinalValue() != 0)) {// 
    	clicks++;
    	      if(equation.getFinalValue() == clicks) {
    		//Fully pressed 
    	      	changeColorPressed();
    	        }
    	       else if(equation.getFinalValue() - 1 == clicks  ) {
    		      changeColorHalfPressed();
    	                }
    	       else if(equation.getFinalValue() + 1 == clicks){
    	    	  changeColorToLose();
    	    	  if (GameSettings.newLives == 1) {
    	    		  TryAgain tryAgain = new TryAgain();
        	    	  Main.primaryStage.setScene(tryAgain.getScene());
        	    	  System.out.println("you lose");
    	    		  
    	    	  }
    	    	  else {
    	    		  GameSettings.newLives--;
    	    	 }
    	    	  
    	      }
    	     }
    	});
    if((equation.getFinalValue() == 0)) {
                   
    	            
    	
           }
    
    
    
    KeyFrame keyFrame = new KeyFrame(Duration.millis(50),e->checkColor(rectangle));
    Timeline animation= new Timeline();
    animation.setCycleCount(Timeline.INDEFINITE);
    animation.play();
   
    
}


public void checkColor(Rectangle r) {
	if(Pressed) {
this.setColor(GameSettings.shapeColorPressed);	
	}else if(HalfPressed) {
this.setColor(GameSettings.shapeColorhalfPressed);	
	}
	
}
private Boolean changeColorHalfPressed() {
	rectangle.setFill(GameSettings.shapeColorhalfPressed);
	this.setColor(GameSettings.shapeColorhalfPressed);
	GameSettings.score = GameSettings.score + 50 ;
	HalfPressed = true;
	return HalfPressed;
}

private Boolean changeColorPressed() {
	rectangle.setFill(GameSettings.shapeColorPressed);
	this.setColor(GameSettings.shapeColorPressed);
	Pressed = true;
	GameSettings.score = GameSettings.score + 100 ;
	return Pressed;
	
}

private boolean changeColorToLose() {
	rectangle.setFill(GameSettings.shapeColorLosePressed);
	this.setColor(GameSettings.shapeColorLosePressed);
	losePressed = true;
	
	return losePressed;
	
}

public Equation getEquation() {
	return equation;
}
public void setEquation() {
	Equation equation = new Equation();
	this.equation = equation;
}
public Color getColor() {
	return this.color;
}
public void setColor(Color color) {
	this.color = color;
	
}

public Pane getRectangle() {
	return rectanglePane;
}
public Rectangle getRectangleOnly() {
	return rectangle;
}

public void setRectangle(Rectangle rectangle) {
	this.rectangle = rectangle;
}


public Integer getClicks() {
	return clicks;
}


public void setClicks(Integer clicks) {
	this.clicks = clicks;
}

public Pane getRectanglePane() {
	return rectanglePane;
}
public void setRectanglePane(Pane rectanglePane) {
	this.rectanglePane = rectanglePane;
}

public void setRectangleColor(RectangleShape rectangleShape) {
	this.rectangle.setFill(GameSettings.shapeColor);
	this.rectangle.setStroke(GameSettings.shapeColor);
}
}
