package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Whack_A_Mole implements ActionListener {
	JFrame frame = new JFrame("Whack-a-mole");
	JLabel label = new JLabel();
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	Random random = new Random();
	int rand = random.nextInt(9-1)+1;
	
	public void drawButtons() {
		JPanel panel = new JPanel();
		frame.add(panel);
		b1 = new JButton();
		panel.add(b1);
		b1.addActionListener(this);
		b2 = new JButton();
		panel.add(b2);
		b2.addActionListener(this);
		b3 = new JButton();
		panel.add(b3);
		b3.addActionListener(this);
		b4 = new JButton();
		panel.add(b4);
		b4.addActionListener(this);
		b5 = new JButton();
		panel.add(b5);
		b5.addActionListener(this);
		b6 = new JButton();
		panel.add(b6);
		b6.addActionListener(this);
		b7 = new JButton();
		panel.add(b7);
		b7.addActionListener(this);
		b8 = new JButton();
		panel.add(b8);
		b8.addActionListener(this);
		b9 = new JButton();
		panel.add(b9);
		b9.addActionListener(this);
		panel.add(label);
		frame.setSize(200, 200);
		frame.pack();
		frame.setVisible(true);
}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
