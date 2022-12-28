package chatgpt;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameScreen extends JPanel implements KeyListener {

	// constants for the screen size and block size
	public static final int SCREEN_WIDTH = 640;
	public static final int SCREEN_HEIGHT = 480;
	public static final int BLOCK_SIZE = 32;

	// constants for the player character
	public static final int PLAYER_WIDTH = 32;
	public static final int PLAYER_HEIGHT = 32;
	public static final int PLAYER_SPEED = 5;

	// properties for the player character
	private int playerX;
	private int playerY;
	private int playerVelocityX;
	private int playerVelocityY;
	private Image playerImage;

	// 2D array to represent the level layout
	private int[][] level = { 
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
			{ 1, 0, 1, 0, 0, 1, 0, 0, 0, 1 }, 
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 1, 0, 0, 1, 0, 0, 0, 1 }, 
			{ 1, 0, 1, 1, 1, 1, 0, 0, 0, 1 }, 
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, };

	public GameScreen() {
		// load the player image
		playerImage = new ImageIcon("player.png").getImage();

		// set the initial player position
		playerX = SCREEN_WIDTH / 2 - PLAYER_WIDTH / 2;
		playerY = SCREEN_HEIGHT - PLAYER_HEIGHT - BLOCK_SIZE;

		// add the key listener to receive input
		addKeyListener(this);
	}

	@Override
	public void paintComponent(Graphics g) {
		// clear the screen
		g.clearRect(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);

		// draw the level
		for (int y = 0; y < level.length; y++) {
			for (int x = 0; x < level[y].length; x++) {
				if (level[y][x] == 1) {
					// draw a solid block
					g.fillRect(x * BLOCK_SIZE, y * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
				}
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		Container contentpane = frame.getContentPane();
		GameScreen sPanel = new GameScreen();

		frame.setSize(800, 800);
		contentpane.add(sPanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}