package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
 * Ailsa Mensinger
 * 12-17-18
 */

public class TwoButtons implements ActionListener {
	JButton redButton;
	JButton greenButton;
	JFrame myframe;

	public static void main(String[] args) {
		//create instance of TwoButtons to do all the work!
		new TwoButtons();
		

	}
	//constructor
	public TwoButtons() {
		//create new JFrame
				myframe = new JFrame();
				
				//set the frame title, size, and location
				myframe.setTitle("Choose Your Color");
				myframe.setSize(550,150);
				myframe.setLocation(200,300);
				
				//make sure program terminates when window is closed
				myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//assign a layout
				//FlowLayout myLayout = new FlowLayout();
				//GridLayout myLayout = new GridLayout(3,2);
				//JPanel myPanel = (JPanel)myframe.getContentPane();
				//BoxLayout myLayout = new BoxLayout(myPanel, BoxLayout.Y_AXIS);
				BorderLayout myLayout = new BorderLayout();
				myframe.setLayout(myLayout);
				
				
				//create and add buttons to the frame
				redButton = new JButton("Red");
				redButton.addActionListener(this);
				greenButton = new JButton("Green");
				greenButton.addActionListener(this);
				
				myframe.add(redButton,BorderLayout.LINE_START);
				//myframe.add(new JLabel(""));
				//myframe.add(new JLabel(""));
				//myframe.add(new JLabel(""));
				//myframe.add(new JLabel(""));
				myframe.add(greenButton,BorderLayout.LINE_END);
				
				//make the frame visible
				myframe.setVisible(true);		
				
	}
	public void actionPerformed(ActionEvent event) {
		
		Object control = event.getSource();
		
		//if redButton was clicked
		if (control == redButton) {
				myframe.getContentPane().setBackground(Color.red);
		}
		//else if greenButton was clicked
		else if (control == greenButton) {
				myframe.getContentPane().setBackground(Color.green);
		}
		
	}
	

}
