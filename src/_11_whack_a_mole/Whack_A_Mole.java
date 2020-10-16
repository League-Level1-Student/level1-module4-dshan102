package _11_whack_a_mole;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Whack_A_Mole {
	JLabel label = new JLabel();
	JFrame frame = new JFrame("Whack-a-mole");
	
	public void run() {
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(label);
		frame.pack();
		frame.setVisible(true);
}
}
