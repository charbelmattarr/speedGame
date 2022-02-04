package application;

import java.util.Random;

import javafx.scene.paint.Color;

/*--Equation:
	
	aValue
	bValue
	finalValue
	location
	color
	*/
public class Equation {
	private Integer firstValue;
	private Integer secondValue;
	private Integer finalValue;
	private Integer location;
	private Color color = GameSettings.equationColor;
	
	public Integer getFirstValue() {
		return firstValue;
	}
	public void setFirstValue() {
		Random randomNumber = new Random();
		Integer firstValue = randomNumber.nextInt(GameSettings.upperBoundRandomNumber);
		this.firstValue = firstValue;
	}
	public Integer getSecondValue() {
		return secondValue;
	}
	public void setSecondValue() {
		Random randomNumber = new Random();
		Integer secondValue = randomNumber.nextInt(GameSettings.upperBoundRandomNumber);
		this.secondValue = secondValue;
	}
	public Integer getFinalValue() {
		return finalValue;
	}
	private void setFinalValue(Integer finalValue) {
		this.finalValue = finalValue;
	}
	public Integer getLocation() {
		return location;
	}
	public void setLocation(Integer location) {
		this.location = location;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void printEquation() {
		System.out.println(this.firstValue + " + " + this.secondValue);
	};


}
