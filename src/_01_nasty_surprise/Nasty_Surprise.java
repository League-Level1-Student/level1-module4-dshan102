package _01_nasty_surprise;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Nasty_Surprise {
	public static void main(String[] args) {
		showPictureFromTheInternet("https://thehappypuppysite.com/wp-content/uploads/2015/01/Dollarphotoclub_68650327-300x299.jpg");
	}
	private static void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        JButton button1 = new JButton("Treat");
	        button1.setSize(50, 50);
	        JButton button2 = new JButton("Trick");
	        button2.setSize(50, 50);
	        frame.add(imageLabel);
	        frame.add(button1);
	        frame.add(button2);
	        frame.pack();
	        frame.setVisible(true);
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}

}
