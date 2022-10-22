package firstproject;

import java.awt.event.*; 
import javax.swing.Timer;
import javax.swing.event.MenuKeyEvent;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Container;

public class firstclass extends JPanel implements KeyListener, ActionListener {

	Player p = new Player();
	Platform block = new Platform();

	Timer time = new Timer(5, this);

	public firstclass() {

		setFocusable(true);
		addKeyListener(this);
		setFocusTraversalKeysEnabled(false);
		time.start();

	}

	public void actionPerformed(ActionEvent e) {
		block.Update();
		Collision();
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		p.draw(g);
		block.draw(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if(e.getKeyCode() == KeyEvent.VK_D) {
			block.forceright();
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			block.forceleft();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

		if(e.getKeyCode() == KeyEvent.VK_D) {
			block.STOP();
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			block.STOP();
		}
	}

	public void Collision() {
		
		Rectangle player = p.bounds();
		Rectangle platform = block.bounds();
		
		if(player.intersects(platform)) {
			block.FreezeVertical();
			p.setYPos(block.yPos() - p.playerHeight() + 1);
		}
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Container contentpane = frame.getContentPane();
		firstclass sPanel = new firstclass();
		Dimension preferredSize = new Dimension();
		preferredSize.setSize(800, 800);
		frame.setSize(preferredSize);
		contentpane.add(sPanel);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
