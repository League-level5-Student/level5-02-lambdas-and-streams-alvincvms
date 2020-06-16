package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(e -> addNum());
		randNumber.addActionListener(e -> randNum());
		tellAJoke.addActionListener(e -> joke());
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	private void addNum() {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number:"));
		JOptionPane.showMessageDialog(null, "The answer is " + (a + b));
	}
	
	private void randNum() {
		JOptionPane.showMessageDialog(null, new Random().nextInt());
	}
	
	private void joke() {
		JOptionPane.showMessageDialog(null, "This button.");
	}
}
