package gamekinda;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class code extends JPanel  implements ActionListener, KeyListener{

	boolean right2 = true;
	boolean right = true;
	
	int x = 210, speedX = 0, y = 885, speedY = 0, a = 100, b = 700, c = 5, d = 25, e = 1100, f = 885;
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	
	g.setColor(Color.black);
	
	g.fillRect(x + 5, y + 16, 5, 5);
	
	g.setColor(Color.black);
	
	g.fillRect(x + 20, y + 16, 5, 5);
	
	g.setColor(Color.gray);
	
	g.fillRect(x + 5, y + 61, 5, 25);
	
	g.setColor(Color.gray);
	
	g.fillRect(x + 19, y + 61, 5, 25);
	
	//left arm
	g.setColor(Color.gray);
	
	g.fillRect(x + 26, y - 30 + 60, c, d);
	
	//right arm
	g.setColor(Color.gray);
	
	g.fillRect(x - 2, y - 30 + 60, 5, 25);
	
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	


}