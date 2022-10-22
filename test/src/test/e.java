package test;

import java.awt.event.* ;     
import java.awt.image.BufferedImage;
import java.awt.Cursor;
import java.awt.Toolkit;
import javax.swing.Timer;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.geom.Line2D;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Container;

public class e extends Textures implements KeyListener, ActionListener, MouseMotionListener {

	//		C:\Users\yash0\eclipse-workspace\test\src\assets
	
	Timer time = new Timer(5, this);
	
	int numberParticles = 200;
	int speed;
	int bottombound = 870;
	int rightbound = 1920;
	
	int randombg;
	
	attractionCenter AC = new attractionCenter(0, 0, 144, 120, 5000);
	robot r = new robot(50, 600, 190, 280);
	
	particle[] arr = new particle[numberParticles];
	
	public e() {
		
		randombg = (int)(Math.random()*3)+1;
		
		for(int i = 0; i < numberParticles; i++) {
			speed = (int)(Math.random()*20)+10;
			arr[i] = (new particle((int)(Math.random()*2000), (int)(Math.random()*870), speed/5, 10, 10, bottombound, rightbound, 1));
		}
		
		setFocusable(true);
		addKeyListener(this);
		addMouseMotionListener(this);
		setFocusTraversalKeysEnabled(false);
		time.start();
	}

	public void actionPerformed(ActionEvent e) {
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].Update(AC.getXPos(), AC.getYPos(), AC.getMass());
		}
		r.Update();
		if(AC.attract) {
			Collision();
		}
		repaint();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(randombg == 1) {
			addImage(g, "ForestBG.png", 0, 0);
		}
		if(randombg == 2) {
			addImage(g, "FallBG.png", 0, 0);
		}
		if(randombg == 3) {
			addImage(g, "GrassyBG.png", 0, 0);
		}
//		g.setColor(new Color(179,113,0));
//		g.fillRect(0, 870, 2500, 600);
//		g.setColor(Color.GRAY);
//		g.fillRect(0, 870, 2500, 10);
		
		g.setColor(Color.BLACK);		
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(10));
        g2.draw(new Line2D.Float((int)AC.getXPos() + (int)AC.getWidth()/2, (int)AC.getYPos() + (int)AC.getHeight()/2, (int)r.getXPos() + 151, (int)r.getYPos() + 174));
		
		AC.draw(g);
		r.draw(g);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].draw(g);
		}
	
	}
	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_1) {
			AC.attract = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_2) {
			AC.attract = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_D) {
			r.moveRight();
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			r.moveLeft();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_D) {
			r.STOP();
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			r.STOP();
		}
		if(e.getKeyCode() == KeyEvent.VK_R) {
			reset();
		}
	}
	
	public void Collision() {
		
		Rectangle attrac = AC.bounds();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].bounds().intersects(attrac)) {
				arr[i].delete();
			}
			if(arr[i].killParticle()) {
				arr[i].delete();
			}
		}
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Container contentpane = frame.getContentPane();
		e sPanel = new e();
		Dimension preferredSize = new Dimension();
		preferredSize.setSize(1920, 1080);
		frame.setSize(preferredSize);
		contentpane.add(sPanel);
		frame.setVisible(true);

		BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
		Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(
		    cursorImg, new Point(0, 0), "blank cursor");
		frame.getContentPane().setCursor(blankCursor);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void reset() {
		for(int i = 0; i < numberParticles; i++) {
			speed = (int)(Math.random()*2)+1;
			arr[i] = (new particle((int)(Math.random()*2000), (int)(Math.random()*870), speed, 10, 10, bottombound, rightbound, 1));
		}
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		AC.setX(e.getX() - AC.getWidth()/2);
		AC.setY(e.getY() - AC.getHeight()/2);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		AC.setX(e.getX() - AC.getWidth()/2);
		AC.setY(e.getY() - AC.getHeight()/2);
	}

}