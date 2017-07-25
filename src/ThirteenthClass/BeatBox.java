package ThirteenthClass;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BeatBox implements ActionListener{
JButton Butt1;
JButton Butt2;
JButton Butt3;
	public static void main(String[] args) {
	BeatBox Boxxxx = new BeatBox();
	Boxxxx.stert();
}
void stert(){
	JFrame frame = new JFrame();

	JPanel panel = new JPanel();
	 Butt1 = new JButton();
	Butt2 = new JButton();
	 Butt3 = new JButton();
	Butt1.addActionListener(this);
	Butt2.addActionListener(this);
	Butt3.addActionListener(this);
	Butt1.setBackground(Color.BLACK);
	Butt1.setOpaque(true);
	Butt2.setBackground(Color.YELLOW);
	Butt2.setOpaque(true);
	Butt3.setBackground(Color.MAGENTA);
	Butt3.setOpaque(true);
	panel.add(Butt1);
	panel.add(Butt2);
	panel.add(Butt3);
	frame.add(panel);
	
	frame.pack();
    frame.setVisible(true);
}
void speak(String vords){
	try{
Runtime.getRuntime().exec("say " + vords);
	}
	catch(IOException e){
		e.printStackTrace();
	}

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
if(buttonPressed==Butt1){
	speak("Jake");
	}
else if(buttonPressed==Butt2){
	speak("Paul");
}
else if(buttonPressed==Butt3){
	speak("Sucks");
}
}
}
