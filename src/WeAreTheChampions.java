package FirstClassWeAreTheChampions;

import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class WeAreTheChampions {

	public static void main(String[] args) {
		WeAreTheChampions ohChristmasTree = new WeAreTheChampions();
		
		ohChristmasTree.drawStar();
		ohChristmasTree.drawTreeBody();
		
		ohChristmasTree.drawTreeTrunk();
		
	}

	double treeWidth = 30;
	double scale = 1.1;	//This is how much the width of the tree increases with each layer down

	void drawTreeBody() {
		// 8. Change the color of the line the tortoise draws to forest green	
Tortoise.setPenColor(Colors.Reds.IndianRed);
		// 1. Make a variable for turnAmount and set it to 175
int turnAmount = 175;
		// 2. Start the Tortoise facing to the right
Tortoise.setAngle(90);
		
// 5. Repeat steps 3 through 11, 11 times
for (int i = 0; i < 15; i++) {
	Tortoise.setSpeed(10);

			// 3. Move the tortoise the width of the tree
	Tortoise.move(treeWidth);
			// 4. Turn the tortoise the current turnAmount to the right
	drawSquare(treeWidth/100.0);
	Tortoise.turn(turnAmount);
			// 6. Set the treeWidth to the current treeWidth times the scale
	treeWidth=treeWidth*scale;
			// 7. Move the tortoise the width of a tree again
	Tortoise.move(treeWidth);
			
	// 9. Turn the tortoise the current turn amount to the LEFT
	Tortoise.turn(-turnAmount);
			// 10. Set the treeWidth to the current treeWidth times the scale again
	treeWidth=treeWidth*scale;
			// 11. Decrease turnAmount by 1
    turnAmount -=1;

    drawSquare(treeWidth/100.0);
}
}
	
	void drawTreeTrunk() {
		// 1. Move the tortoise half the width of the tree
        Tortoise.move(treeWidth/2);
		// 2. Change the tortoise so that it is pointing straight down
        Tortoise.turn(90);
		// 4. Set the pen width to the tree width divided by 10
        Tortoise.setPenWidth(treeWidth/10);
		// 5. Change the color of the line the tortoise draws to brown
        Tortoise.setPenColor(Colors.Blues.Aqua);
		// 3. Move the tortoise a quarter the tree width
        Tortoise.move(treeWidth/4);
	}
	
	void drawStar() {
		// * Optional: Draw a red star on top of the tree. Hint: 144 degrees makes a star.
	
		for (int i = 0; i < 5; i++) {
		Tortoise.setSpeed(10);
	Tortoise.setPenColor(Colors.Greens.Aquamarine);
		Tortoise.move(30);
	Tortoise.turn(144);
	}
	}
void drawSquare(double size){
	double scale = new Random().nextDouble()*size;
	for (int i = 0; i < 4; i++) {
		
	
	Tortoise.move(scale*10);
    Tortoise.turn(90);
	}
	}

}


