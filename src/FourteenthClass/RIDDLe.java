package FourteenthClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RIDDLe implements ActionListener, KeyListener  {
JTextField TextField;
int rand;
String Riddle1;
String Riddle2;
JLabel Label;
public static void main(String[] args) {
	RIDDLe Ridd = new RIDDLe();
	Ridd.Start();

	}
void Start(){
	Riddle1 = new String ("What vehicle's name is a palindrome?");
	Riddle2 = new String("What Band's name is a palindrome?");
	 rand = new Random(1).nextInt();
	if(rand == 0){
		Label = new JLabel(Riddle1);
	}
		if(rand==1)	{
			Label = new JLabel(Riddle2);
		}
	JFrame Frame=new JFrame();
	JPanel Panel = new JPanel();
	
	JButton Button = new JButton("Submit");
	TextField = new JTextField();
	Button.addActionListener(this);
TextField.setText("Answer Goes Here");
	TextField.addKeyListener(this);
    Panel.add(Button);
    Panel.add(TextField);
    Panel.add(Label);
    Frame.add(Panel); 
    Frame.pack();
    Frame.setVisible(true);

}
void speak(String vords){
	try{
Runtime.getRuntime().exec("say " + vords);
	}
	catch(IOException e){
		e.printStackTrace();
	}

}
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String Answer = TextField.getText();
	if(rand==0){
		if(Answer.equalsIgnoreCase("Racecar")){
			speak("Good Job!");
		}
		else{
			speak("You suck!");
		}	
	}
	else if(rand == 1){
		if(Answer.equalsIgnoreCase("Abba")){
			speak("Good Job!");
		}
		else{
			speak("You Suck!");
		}
	}
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
