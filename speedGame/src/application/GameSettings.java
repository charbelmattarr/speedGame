package application;

import javafx.scene.paint.Color;

/*--GameSettings (singleton)
static width
static height
static shapeColor
-score*/

public class GameSettings {
public static Color shapeColor = Color.GREY;
public static Color shapeColorPressed = Color.DARKOLIVEGREEN;
public static Color shapeColorhalfPressed = Color.GREY;;
public static Color shapeColorLosePressed = Color.RED;
public static final Integer shapeHeight = 200;
public static final Integer shapeWidth = 100;
public static Color equationColor = Color.GREEN;
public static Integer upperBoundRandomNumber = 3;
public static Integer score = 0;
public static Integer Top = 296;
public static Integer newLives = 3;
}



