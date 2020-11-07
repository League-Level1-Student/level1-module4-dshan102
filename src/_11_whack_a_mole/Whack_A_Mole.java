package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Whack_A_Mole implements ActionListener {
	JFrame frame = new JFrame("Whack-a-mole");
	JPanel panel = new JPanel();
	Date timeAtStart = new Date(); 
	static int moleHits = 0;
	
	public void run() {
		frame.setPreferredSize(new Dimension(200, 200));
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		drawButtons();
	}
	
	public void drawButtons() {
		panel.removeAll();
		Random rand = new Random();
		int rand1 = rand.nextInt(24);
		for(int i=0; i<24; i++) {
			JButton b = new JButton();
			b.addActionListener(this);
			panel.add(b);
			if(i==rand1) {
				b.setText("Mole!");
			}
		}
		}
	
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }
	
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(! buttonPressed.getText().equals("Mole")) {
			moleHits++;
			frame.dispose();
			run();
		}
		else {
			speak("Fat L");
		}
		if (moleHits==10) {
			endGame(timeAtStart, 10);
		}

	}
}

