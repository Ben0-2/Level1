package SecondClass;

import java.net.URI;

import javax.swing.JOptionPane;

public class Cat {
	String owner;
	String bestFriend;
Cat(String owner, String bestFriend){
	this.owner = owner;
	this.bestFriend = bestFriend;
}
void supportTrump(){
	 JOptionPane.showMessageDialog(null, "Vote for meh owner boy");
	 JOptionPane.showMessageDialog(null, "Seriously y r u still here bro");
     JOptionPane.showMessageDialog(null, "GO NOW OR ELSE!!!!");
     JOptionPane.showMessageDialog(null, "g'bye");
}
void goodbye(){
	JOptionPane.showMessageDialog(null, "I really gotta go, goodbye, here is a funny vid");
	
	
}
void playVideo(String videoURL) {
	try {
		URI uri = new URI(videoURL);
		java.awt.Desktop.getDesktop().browse(uri);
	} catch (Exception e) {
		e.printStackTrace();
	}
}


}
