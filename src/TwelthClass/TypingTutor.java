package TwelthClass;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor {
private JFrame frame;
	private JLabel labeer;
char currentLetter;
	public static void main(String[] args) {
		TypingTutor toot = new TypingTutor();
		char currentLetter = toot.generateRandomLetter();
		String MoreCurrentLetter = ""+currentLetter;
		JFrame frame = new JFrame("MAIRO TEACHZ TYPING");
	JLabel labeer = new JLabel(MoreCurrentLetter);
}
char generateRandomLetter() {
	Random r = new Random();
	return (char) (r.nextInt(26) + 'a');


}}
	


