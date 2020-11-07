package _12_slot_machine;

import java.awt.Dimension;
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

public class Slot_Machine implements ActionListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JButton b1;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
    
	
	public void run() throws MalformedURLException {
		JPanel panel = new JPanel();
		frame.add(panel);
		label1 = createLabelImage("cherry.jpg");
		label1.setPreferredSize(new Dimension(200,200));
		panel.add(label1);
		label2 = createLabelImage("orange-512.png");
		label2.setPreferredSize(new Dimension(200,200));
		panel.add(label2);
		label3 = createLabelImage("watermelon.png");
		label3.setPreferredSize(new Dimension(200,200));
		panel.add(label3);
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
		if(e.getSource()==b1) {
			
		}
	}
}
