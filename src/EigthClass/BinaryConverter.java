package EigthClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener{
JFrame frame;
JPanel mrpanel;
JButton but;
JTextField num1;
JTextField num2;
	public static void main(String[] args) {
BinaryConverter b = new BinaryConverter();
		b.stert();
}
void stert(){
	frame= new JFrame();
	mrpanel = new JPanel();
	num1 = new JTextField(20);
	num2 = new JTextField(20);
	but = new JButton("Convert Boi");
	but.addActionListener(this);
	mrpanel.add(num1);
	mrpanel.add(but);
	mrpanel.add(num2);
	frame.add(mrpanel);
    frame.setVisible(true);
    frame.pack();
}
String convert(String binary){
	int asciiValue= Integer.parseInt(binary,2);
	char theLetter = (char) asciiValue;
	return "" + theLetter;
}
void echo(String echo){
	System.out.println(echo+" "+echo);
}
@Override
public void actionPerformed(ActionEvent e) {
String bin = num1.getText();

String num = convert(bin);

num2.setText(num);

echo(num);
}

}
