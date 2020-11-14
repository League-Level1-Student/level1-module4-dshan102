package _12_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Slot_Machine implements ActionListener {
	JFrame frame = new JFrame("Slot Machine");
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JButton b1;
	JLabel label1;
	JLabel label2;
	JLabel label3;
   
	public void run() throws MalformedURLException {
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
	public void spin() throws MalformedURLException {
		Random rand = new Random();
		int option1 = rand.nextInt(3);
		int option2 = rand.nextInt(3);
		int option3 = rand.nextInt(3);
		
		if(option1==0) {
			panel.remove(label1);
			label1=createLabelImage("cherry.jpg");
			label1.setPreferredSize(new Dimension(200,200));
			panel.add(label1);
		}
		if(option1==1) {
			panel.remove(label1);
			label1=createLabelImage("orange-512.png");
			label1.setPreferredSize(new Dimension(200,200));
			panel.add(label1);
		}
		if(option1==2) {
			panel.remove(label1);
			label1=createLabelImage("watermelon.png");
			label1.setPreferredSize(new Dimension(200,200));
			panel.add(label1);
		}
		if(option2==0) {
			panel.remove(label2);
			label2=createLabelImage("cherry.jpg");
			label2.setPreferredSize(new Dimension(200,200));
			panel.add(label2);
		}
		if(option2==1) {
			panel.remove(label2);
			label2=createLabelImage("orange-512.png");
			label2.setPreferredSize(new Dimension(200,200));
			panel.add(label2);
		}
		if(option2==2) {
			panel.remove(label2);
			label2=createLabelImage("watermelon.png");
			label2.setPreferredSize(new Dimension(200,200));
			panel.add(label2);
		}
		if(option3==0) {
			panel.remove(label3);
			label3=createLabelImage("cherry.jpg");
			label3.setPreferredSize(new Dimension(200,200));
			panel.add(label3);
		}
		if(option3==1) {
			panel.remove(label3);
			label3=createLabelImage("orange-512.png");
			label3.setPreferredSize(new Dimension(200,200));
			panel.add(label3);
		}
		if(option3==2) {
			panel.remove(label3);
			label3=createLabelImage("watermelon.png");
			label3.setPreferredSize(new Dimension(200,200));
			panel.add(label3);
		}
		if(option1==option2 && option2==option3 && option1==option3) {
			JOptionPane.showMessageDialog(null, "YOU WIN");
		}
	}

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
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			try {
				spin();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			frame.pack();
		}
	}
}
