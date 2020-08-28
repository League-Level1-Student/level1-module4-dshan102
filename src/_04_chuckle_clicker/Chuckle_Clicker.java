package _04_chuckle_clicker;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle_Clicker implements ActionListener {
	JButton b1;
	JButton b2;

	public void makeButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		b1 = new JButton("Joke");
		panel.add(b1);
		b1.addActionListener(this);
		b2 = new JButton("Punchline");
		panel.add(b2);
		b2.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			JOptionPane.showMessageDialog(null, "Why do we tell actors to break a leg?");
		} else if (e.getSource() == b2) {
			JOptionPane.showMessageDialog(null, "Because every play has a cast.");
		}

	}

}
