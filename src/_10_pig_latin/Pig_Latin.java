package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pig_Latin implements ActionListener {
	JTextField t1;
	JTextField t2;
	JButton b1;
	JLabel label = new JLabel();
	
	public void run() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		t1 = new JTextField(10);
		panel.add(t1);
		b1 = new JButton("Translate");
		panel.add(b1);
		b1.addActionListener(this);
		t2 = new JTextField(10);
		panel.add(t2);
		panel.add(label);
		frame.pack();
		frame.setVisible(true);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

