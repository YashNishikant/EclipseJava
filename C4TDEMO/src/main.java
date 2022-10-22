import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class main extends JPanel implements KeyListener, ActionListener{

	Timer t = new Timer (5, this);
	
	String c;
	boolean l;
	
	int posX = 10;
	
	ArrayList<Planet> pList = new ArrayList<Planet>();
	
	public main() {
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		t.start();
		
		generatePlanets();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		repaint();
		
	}

	public void paintComponent(Graphics g) { 
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(0,0,20000,20000);
		
		for(int i = 0; i < pList.size(); i++) {
			pList.get(i).Draw(g);
		}
		
	}
	
	public void generatePlanets() {
		
		pList.clear();
		posX = 10;
		for(int i = 0; i < 10; i++) {
			
			int color = (int)(Math.random()*3)+1;
			if(color == 1) {
				c = "Orange";
			}
			if(color == 2) {
				c = "Purple";
			}
			if(color == 3) {
				c = "Green";
			}
			
			int life = (int)(Math.random()*2)+1;
			if(life == 1) {
				l = true;
			}
			else {
				l = false;
			}
			
			pList.add(new Planet(posX, (int)(Math.random()*8400000)+1000000, l, c));
			
			posX += 170;
			
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_P) {
			generatePlanets();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {

		JFrame frame = new JFrame();

		Container contentpane = frame.getContentPane();
		main m = new main();

		Dimension preferredSize = new Dimension();
		preferredSize.setSize(800, 800);

		frame.setSize(preferredSize);
		contentpane.add(m);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
}
