package FourteenthClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener { 
	JFrame frame;
	JPanel panel;
	JButton Trick;
	JButton Treat;
	public static void main(String[] args) {
		NastySurprise halloween = new NastySurprise();
		halloween.Start();
	}
void Start(){
	frame = new JFrame();
	panel = new JPanel();
	Trick = new JButton("Trick");
	Treat = new JButton("Treat");
	Trick.addActionListener(this);
	Treat.addActionListener(this);
    panel.add(Trick);
    panel.add(Treat);
    frame.add(panel);
    frame.pack();
    frame.setVisible(true);
}
private void showPictureFromTheInternet(String imageUrl) {
	try {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		JFrame frame = new JFrame();
		frame.add(imageLabel);
		frame.setVisible(true);
		frame.pack();
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
}


public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton)e.getSource();
	if(buttonPressed == Treat){
		showPictureFromTheInternet("http://img13.deviantart.net/b425/i/2017/024/b/e/alolan_muk_by_mudsaw-dawnk82.png");
	}
	else if(buttonPressed == Trick){
		showPictureFromTheInternet("http://www.dogwallpapers.net/wallpapers/lovely-labrador-retriever-puppy-wallpaper.jpg");
	}
}

}
