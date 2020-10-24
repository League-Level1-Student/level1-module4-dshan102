package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slot_Machine implements ActionListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JButton b1;
	
	public void run() {
		JPanel panel = new JPanel();
		frame.add(panel);
		b1 = new JButton("SPIN");
		panel.add(b1);
		b1.addActionListener(this);
		frame.pack();
		panel.add(label);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
