package firstproject;

import java.awt.event.*; 
import javax.swing.Timer;
import javax.swing.colorchooser.ColorChooserComponentFactory;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.Color;

public class firstclass extends JPanel implements KeyListener, ActionListener {

	Timer time = new Timer(5, this);

	int x = 100;
	int y = 100;
	
	Player p = new Player();
	Platform platform = new Platform();
	
	public firstclass() {
		setFocusable(true);
		addKeyListener(this);
		setFocusTraversalKeysEnabled(false);
		time.start();
	}

	public void actionPerformed(ActionEvent e) {
		
		platform.Update();
		collision();
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		p.draw(g);
		platform.draw(g);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if(e.getKeyCode() == KeyEvent.VK_A) {
			platform.forceLeft();
		}
		if(e.getKeyCode() == KeyEvent.VK_D) {
			platform.forceRight();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_A) {
			platform.STOP();
		}
		if(e.getKeyCode() == KeyEvent.VK_D) {
			platform.STOP();
		}
		
		
	}

	public void collision() {
		Rectangle playerbounds = p.bounds();
		Rectangle platformbounds = platform.bounds();
	
		if(playerbounds.intersects(platformbounds)) {
			platform.FreezeVertical();
			platform.setYPos(p.yPos() + p.playerHeight());
		}
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Container contentpane = frame.getContentPane();
		firstclass sPanel = new firstclass();
		Dimension preferredSize = new Dimension();
		preferredSize.setSize(1000, 1000);
		frame.setSize(preferredSize);
		contentpane.add(sPanel);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}