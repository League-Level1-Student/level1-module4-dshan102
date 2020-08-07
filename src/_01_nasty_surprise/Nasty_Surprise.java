package _01_nasty_surprise;

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

public class Nasty_Surprise implements ActionListener {
	JButton button1;
	JButton button2;
	String image;
	JPanel panel;
	
	public void createGUI() {
        JFrame frame = new JFrame();
        panel = new JPanel();
        frame.add(panel);
        button1 = new JButton("Treat");
        panel.add(button1);
        button1.addActionListener(this);
        button2 = new JButton("Trick");
        panel.add(button2);
        button2.addActionListener(this);
        frame.pack();
        frame.setVisible(true);
	}
	
	void showPictureFromTheInternet(String imageUrl) {
	    try {
	    	URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        panel.add(imageLabel);
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			image = "https://vignette.wikia.nocookie.net/ben10fanfiction/images/0/0d/Ben_10_trollface.png/revision/latest?cb=20130628132010";
		}
		else if (e.getSource()==button2) {
			image = "https://i.pinimg.com/736x/ce/53/c5/ce53c5bcd350ba856e5c53c343376fb2.jpg";
		}
		showPictureFromTheInternet(image);
	}

}
