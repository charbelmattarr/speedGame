package application;

import java.util.Random;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/*--Equation:
	
	aValue
	bValue
	finalValue
	location
	color
	*/
public class Equation extends Pane {
	private Integer firstValue;
	private Integer secondValue;
	private Integer finalValue;
	private String equation;
	private Color color = GameSettings.equationColor;
	public Integer picker = 0;
	public Equation() {
		setColor();
		setFirstValue();
		setSecondValue();
		// random equation type
		Random random = new Random();
		picker = random.nextInt(2)+1;
		
		if (picker == 1) {
			setSumEquation();
			setFinalValue(sum(getFirstValue(),getSecondValue()));
			//setSoustractionEquation();
			//setFinalValue(minus(getFirstValue(),getSecondValue()));
		}else if(picker == 2) {
			setSumEquation();
			setFinalValue(sum(getFirstValue(),getSecondValue()));
		}//else if(picker == 3) {
		//setDivEquation();
		//}else if(picker == 4) {
		//	setMultEquation();
		//}
		
	}

	public Integer getFirstValue() {
		return firstValue;
	}
	public void setFirstValue() {
		Random randomNumber = new Random();
		Integer firstValue = randomNumber.nextInt(GameSettings.upperBoundRandomNumber);
		if (firstValue == 0)
		{
			firstValue++;
		}
		this.firstValue = firstValue;
	}
	public Integer getSecondValue() {
		return secondValue;
	}
	public void setSecondValue() {
		Random randomNumber = new Random();
		Integer secondValue = randomNumber.nextInt(GameSettings.upperBoundRandomNumber);
		if (secondValue == 0)
		{
			secondValue++;
		}
		this.secondValue = secondValue;
	}
	
	public Integer getFinalValue() {
		return finalValue;
	}
	public void setFinalValue(Integer finalValue) {
		this.finalValue = finalValue;
	}
	
	
	
	public String getEquation() {
		return equation;
	}
	
	
	// setting type of equation for text
	public void setSumEquation() {
		this.equation = this.firstValue.toString() + " + " +  this.secondValue.toString();
			
	}
	public void setSoustractionEquation() {
		this.equation = this.firstValue.toString() + " - " +  this.secondValue.toString();
			
	}

	
	public Color getColor() {
		return color;
	}
	public void setColor() {
		this.color = GameSettings.equationColor;
	}
	
	public void printSumEquation() {
		System.out.println(equation);
	};

	public void printProductEquation() {
		System.out.println(equation);
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

	public Integer minus(Integer firstInteger,Integer secondInteger) {
		
		return Math.abs(firstInteger-secondInteger);
	} 
	
}
