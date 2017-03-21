package Why;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Jeffy implements ActionListener{
	JButton pancakes;
	public static void main(String[] args) {
	Jeffy jeffy = new Jeffy();
	jeffy.showButton();
}
	public void showButton(){
	JFrame greenbeans = new JFrame();
	greenbeans.setVisible(true);
	pancakes = new JButton();
	greenbeans.add(pancakes);
	pancakes.addActionListener(this);
	
	
}

public void actionPerformed(ActionEvent arg0) {
	int rand = new Random().nextInt(5);
if(arg0.getSource().equals(pancakes)){
	if(rand == 0){
		System.out.println("YEEEEEEE YOU WILL BE RICH");
	}
    if(rand == 1){
    	System.out.println("You will die at age 26");
    }
    if(rand == 2){
    	System.out.println("You will be liked by all people");
    }
    if(rand == 3){
    	System.out.println("You will live a long life, but shall go through many perilous struggles a long the way");
    }
    if(rand == 4){
    	System.out.println("You will become JEFFY");
    }
}

}
}