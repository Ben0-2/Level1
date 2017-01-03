package FirstClass;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class House {
public static void main(String[] args) {
	Tortoise.setX(5);
Tortoise.setY(250);
	String Size = "y";
	Tortoise.getBackgroundWindow().setColor(Color.pink);
Tortoise.penDown();
  Tortoise.setSpeed(10);

  for(int i = 0; i < 72; i++) {
	
   house(Size);
if(i == 12){
	Tortoise.setX(5);
    Tortoise.setY(300);
}
if(i == 24){
	Tortoise.setX(5);
    Tortoise.setY(350);
}
if(i == 36){
	Tortoise.setX(5);
    Tortoise.setY(400);
}
if(i == 48){
	Tortoise.setX(5);
    Tortoise.setY(450);
}
if(i == 60){
	Tortoise.setX(5);
    Tortoise.setY(500);
}
  }  
}
static void house(String Size){
	int x = new Random().nextInt(3);
	if(x == 0){
		Size="small";
	}
	else if(x == 1)	{
		Size = "medium";
	}
	else{
		Size = "large";
	}
	if(Size.equals("small")){
Tortoise.setPenColor(Color.cyan);
	Tortoise.move(60);
Tortoise.turn(45);
Tortoise.move(60/2);
Tortoise.turn(90);
Tortoise.move(60/2);
Tortoise.turn(45);
Tortoise.move(60);
Tortoise.turn(-90);
Tortoise.setPenColor(Color.green);
Tortoise.move(30);
Tortoise.turn(-90);
Tortoise.setPenColor(Color.cyan);
}
if(Size.equals("medium")){
	Tortoise.setPenColor(Color.blue);
	Tortoise.move(120);
	Tortoise.turn(45);
	Tortoise.move(120/2);
	Tortoise.turn(90);
	Tortoise.move(120/2);
	Tortoise.turn(45);
	Tortoise.move(120);
	Tortoise.turn(-90);
	Tortoise.setPenColor(Color.green);
	Tortoise.move(60);
	Tortoise.turn(-90);
	Tortoise.setPenColor(Color.blue);
}
if(Size.equals("large")){
	Tortoise.setPenColor(Color.red);
	Tortoise.move(250);
	
	Tortoise.turn(90);
	Tortoise.move(250/2);
	Tortoise.turn(90);
	Tortoise.move(250);
	Tortoise.turn(-90);
	Tortoise.setPenColor(Color.green);
	Tortoise.move(120);
	Tortoise.turn(-90);
	Tortoise.setPenColor(Color.red);
}
}
}
