package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
JButton b1;
JButton b2;
JButton b3;
JButton b4;
JTextField t1;
JTextField t2;
JLabel label = new JLabel();
JFrame frame = new JFrame();

public void run() {
	JPanel panel = new JPanel();
	frame.add(panel);
	t1 = new JTextField(10);
	panel.add(t1);
	t2 = new JTextField(10);
	panel.add(t2);
	b1 = new JButton("Add");
	panel.add(b1);
	b1.addActionListener(this);
	b2 =  new JButton("Subtract");
	panel.add(b2);
	b2.addActionListener(this);
	b3 = new JButton("Multiply");
	panel.add(b3);
	b3.addActionListener(this);
	b4 = new JButton("Divide");
	panel.add(b4);
	b4.addActionListener(this);
	panel.add(label);
	frame.pack();
	frame.setVisible(true);
}

public void Add() {
	double number1 = Double.parseDouble(t1.getText());
	double number2 = Double.parseDouble(t2.getText());
	label.setText(number1+number2+"");
	
}
public void Subtract() {
	double number1 = Double.parseDouble(t1.getText());
	double number2 = Double.parseDouble(t2.getText());
	label.setText(number1-number2+"");
}
public void Multiply() {
	double number1 = Double.parseDouble(t1.getText());
	double number2 = Double.parseDouble(t2.getText());
	label.setText(number1*number2+"");
}
public void Divide() {
	double number1 = Double.parseDouble(t1.getText());
	double number2 = Double.parseDouble(t2.getText());
	label.setText(number1/number2+"");
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b1) {
		Add();
	}
	else if(e.getSource()==b2) {
		Subtract();
	}
	else if(e.getSource()==b3) {
		Multiply();
	}
	else if(e.getSource()==b4) {
		Divide();
	}
}
}
