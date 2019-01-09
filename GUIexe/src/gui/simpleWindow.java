package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*
 * Ailsa Mensinger
 * 12-17-18
 */

public class simpleWindow implements ActionListener{

	public static void main(String[] args) {

		new simpleWindow();
		
		
		}
	public simpleWindow() {
		JFrame frame = new JFrame();
		FlowLayout layout = new FlowLayout();
		
		frame.setLayout(layout);
		frame.setTitle("simple window");
		frame.setSize(400,200);
		frame.setLocation(200,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JLabel label = new JLabel("This is my label!");
		frame.add(label);
		
		JButton button = new JButton("click me");
		button.addActionListener(this);
		frame.add(button);
		
		
		JButton button1 = new JButton("Hello there!");
		frame.add(button1);
		
		
		JButton button2 = new JButton(":)");
		frame.add(button2);
		
		JButton button3 = new JButton("God save the queen");
		frame.add(button3);
		
		
		JButton button4 = new JButton("Tangerine dream");
		frame.add(button4);
	
		
		JButton button5 = new JButton("Spam");
		frame.add(button5);
		
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "Hey that tickles!");
		
		
	}

}
