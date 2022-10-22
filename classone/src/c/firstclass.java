package c;
import java.awt.event.*; 
import javax.swing.Timer;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Color;

public class firstclass extends JPanel implements ActionListener{
	
	//Timer Created
	Timer time = new Timer(5, this);
	
	public firstclass(){
		//Starts a timer so our actionPerformed method can run continuously
		time.start();
	}

	public void actionPerformed(ActionEvent e) {
		//Constantly redraws the screen
		repaint();
	}

	public void paintComponent(Graphics g) {
		//We call the paintcomponent method from the JPanel class (the superclass)
		super.paintComponent(g);
		
		g.fillOval(50, 50, 100, 100);
		
	}
	
	public static void main(String[] args) {
		//Create the frame
		JFrame frame = new JFrame();
		
		firstclass f = new firstclass();
		
		//Adding Panel to the frame
		//“this” refers to our current class.
		frame.add(f);

		//Set frame dimensions
		frame.setSize(800, 800);

		//Sets frame visibility
		frame.setVisible(true);
		//Need this method in order for keyboard input and more
		frame.setFocusable(true);
		
		//Code to terminate our program when we close the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


