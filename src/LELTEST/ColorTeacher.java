package LELTEST;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher implements ActionListener {
	JFrame frame;
	JButton Yellow;
	JButton Red;
	JButton Blue;
	JButton Green;
	JPanel poonel;

	public static void main(String[] args) {
		ColorTeacher Teach = new ColorTeacher();
		Teach.start();
	}

	void start() {
		frame = new JFrame();
		poonel = new JPanel();
		frame.setTitle("Color Teacher");
		Yellow = new JButton();
		Yellow.addActionListener(this);
		Yellow.setBackground(Color.YELLOW);
		Yellow.setOpaque(true);
		Red = new JButton();
		Red.addActionListener(this);
		Red.setBackground(Color.RED);
		Red.setOpaque(true);
		Blue = new JButton();
		Blue.addActionListener(this);
		Blue.setBackground(Color.BLUE);
		Blue.setOpaque(true);
		Green = new JButton();
		Green.addActionListener(this);
		Green.setBackground(Color.GREEN);
		Green.setOpaque(true);
		poonel.add(Yellow);
		poonel.add(Red);
		poonel.add(Blue);
		poonel.add(Green);
		frame.add(poonel);
		frame.pack();
		frame.setVisible(true);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == Yellow) {
			speak("Yellow");
		} else if (buttonPressed == Red) {
			speak("Red");
		} else if (buttonPressed == Blue) {
			speak("Blue");
		} else if (buttonPressed == Green) {
			speak("Green");
		}
	}
}
