package SixthClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LotteryNumbers implements ActionListener {
	private JLabel slotone;
	private JLabel slottwo;
	private JLabel slotthree;
	private JLabel slotfour;
	private JLabel slotfive;
	private JLabel slotsix;
	private JButton quickpick;
	private JPanel lotteryticket;
	private JFrame frame;

	public static void main(String[] args) {
		LotteryNumbers numbers = new LotteryNumbers();
		numbers.setup();
	}

	public void setup() {

		lotteryticket = new JPanel();

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		frame.setSize(1000, 1000);
		quickpick = new JButton("Let Me Pick Your Numbers For You!");
		quickpick.addActionListener(this);
		quickpick.setBounds(550, 50, 100, 100);
		lotteryticket.add(quickpick);
		frame.setVisible(true);
		frame.add(lotteryticket);
		slotone = new JLabel();
		slotone.setBounds(125, 525, 100, 50);
		slottwo = new JLabel();
		slottwo.setBounds(275, 525, 100, 50);
		slotthree = new JLabel();
		slotthree.setBounds(425, 525, 100, 50);
		slotfour = new JLabel();
		slotfour.setBounds(575, 525, 100, 50);
		slotfive = new JLabel();
		slotfive.setBounds(725, 525, 100, 50);
		slotsix = new JLabel();
		slotsix.setBounds(875, 525, 100, 50);
		lotteryticket.add(slotone);
		lotteryticket.add(slottwo);
		lotteryticket.add(slotthree);
		lotteryticket.add(slotfour);
		lotteryticket.add(slotfive);
		lotteryticket.add(slotsix);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int rand1 = new Random().nextInt(100);
		int rand2 = new Random().nextInt(100);
		int rand3 = new Random().nextInt(100);
		int rand4 = new Random().nextInt(100);
		int rand5 = new Random().nextInt(100);
		int rand6 = new Random().nextInt(100);
		String num1 = Integer.toString(rand1);
		String num2 = Integer.toString(rand2);
		String num3 = Integer.toString(rand3);
		String num4 = Integer.toString(rand4);
		String num5 = Integer.toString(rand5);
		String num6 = Integer.toString(rand6);
		slotone.setText(num1);
		slottwo.setText(num2);
		slotthree.setText(num3);
		slotfour.setText(num4);
		slotfive.setText(num5);
		slotsix.setText(num6);
		
		

		frame.repaint();

	}

}
