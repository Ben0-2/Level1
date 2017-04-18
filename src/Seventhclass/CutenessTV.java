package Seventhclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton button1;
	JButton button2;
	JButton button3;

	public static void main(String[] args) {
		CutenessTV cute = new CutenessTV();
		cute.start();
	}

	void showDucks() {
		playVideo("4EMJl4sy-yM");
	}

	void showFrog() {
		playVideo("cxKnhYU8pjw");
	}

	void showFluffyUnicorns() {
		playVideo("q6EoRBvdVPQ");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void start() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();

		button1 = new JButton("To Be Continued");
		button1.addActionListener(this);
		panel.add(button1);
		button2 = new JButton("Fresh Avocado");
		panel.add(button2);
		button2.addActionListener(this);
		button3 = new JButton("Yee");
		button3.addActionListener(this);
		panel.add(button3);
		frame.add(panel);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button1) {
			showDucks();
		} else if (buttonPressed == button2) {
			showFrog();
		}
		if (buttonPressed == button3) {
			showFluffyUnicorns();
		}
	}

}
