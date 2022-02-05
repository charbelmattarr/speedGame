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
	public void setFinalValue(Integer finalValue) {
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
	
	public void printSumEquation() {
		System.out.println(this.firstValue + " + " + this.secondValue);
	};

	public void printProductEquation() {
		System.out.println(this.firstValue + " + " + this.secondValue);
	};
	
	public void printMinusEquation() {
		if(this.finalValue > this.secondValue) {
		System.out.println(this.firstValue + " * " + this.secondValue);
		}
		else{
			System.out.println(this.secondValue + " - " + this.firstValue);
			}
	};
	
	public Integer sum(Integer firstInteger,Integer secondInteger) {
		return firstInteger+secondInteger;
	}
	
	public Integer product(Integer firstInteger,Integer secondInteger) {
		return firstInteger*secondInteger;
	}
	public Integer minus(Integer firstInteger,Integer secondInteger) {
		
		return Math.abs(firstInteger-secondInteger);
	}
}
