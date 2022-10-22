package firstproject_solution;

import java.awt.event.*;
import javax.swing.Timer;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Container;

public class firstclass extends JPanel implements KeyListener, ActionListener {

	Player p = new Player();
	Platform[] block = new Platform[10];

	Timer time = new Timer(5, this);

	int x_position = 500;

	public firstclass() {

		for (int i = 0; i < block.length; i++) {
			block[i] = new Platform(x_position);
			x_position += 1500;
		}

		setFocusable(true);
		addKeyListener(this);
		setFocusTraversalKeysEnabled(false);
		time.start();

	}

	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < block.length; i++) {
			block[i].Update();
		}
		cameraPosition();
		Collision();
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		p.draw(g);
		for (int i = 0; i < block.length; i++) {
			block[i].draw(g);
		}
	}


	public void cameraPosition() {
		if ((int) p.yPos() > 500) {
			for (int i = 0; i < block.length; i++) {
				block[i].setYPos(block[i].yPos() - 3);
			}
			p.setYPos(p.yPos() - 3);
		}
		if ((int) p.yPos() < 500) {

			for (int i = 0; i < block.length; i++) {
				block[i].setYPos(block[i].yPos() + 3);
			}
			p.setYPos(p.yPos() + 3);
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_D) {
			for (int i = 0; i < block.length; i++) {
				block[i].forceright();
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			for (int i = 0; i < block.length; i++) {
				block[i].forceleft();
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_W) {
			for (int i = 0; i < block.length; i++) {
				block[i].jump();
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_D) {
			for (int i = 0; i < block.length; i++) {
				block[i].STOP();
			}
			if (e.getKeyCode() == KeyEvent.VK_A) {
				for (int i = 0; i < block.length; i++) {
					block[i].STOP();
				}
			}
		}
	}

	public void Collision() {

		Rectangle player = p.bounds();
		for (int i = 0; i < block.length; i++) {
			Rectangle platform = block[i].bounds();

			if (player.intersects(platform)) {

				for (int j = 0; j < block.length; j++) {
					block[j].FreezeVertical();
					p.setYPos(block[j].yPos() - p.playerHeight() + 1);
				}
			}
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
