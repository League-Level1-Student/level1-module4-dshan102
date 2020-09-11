package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Typing_Tutor implements KeyListener {
char currentLetter;
JLabel label = new JLabel();

char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}

	public void createGUI() {
		JFrame frame = new JFrame();
		frame.setTitle("Type For Your Life");
		frame.addKeyListener(this);
		frame.add(label);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		currentLetter = generateRandomLetter();
		label.setText(""+currentLetter);
		frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You typed: " + Character.toLowerCase((char)e.getKeyCode()));
		if (currentLetter == Character.toLowerCase((char)e.getKeyCode())) {
			System.out.println("Correct");
			label.setOpaque(true);
			label.setBackground(Color.green);
		}
		else {
			System.out.println("Incorrect");
			label.setOpaque(true);
			label.setBackground(Color.red);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter =  generateRandomLetter();
		label.setText(""+currentLetter);
	}
	
}
