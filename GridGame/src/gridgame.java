
import java.awt.event.*;
import javax.swing.Timer;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Container;

public class gridgame extends JPanel implements KeyListener, ActionListener, MouseListener, MouseMotionListener {

	Timer time = new Timer(3, this);
	mouseclicker c = new mouseclicker(5, 5);
	boolean dragged = false;

	int w = 47;
	int h = 77;
	int x = 0;
	int y = 0;
	int whcell = 20;
	int updatedelay = 0;

	Cell[][] cellarr = new Cell[w][h];
	Cell[][] cellarr2 = new Cell[w][h];

	boolean start = false;
	int neighbors = 0;

	public gridgame() {

		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				cellarr[i][j] = new Cell(x, y, whcell, whcell);
				x += whcell + 5;
			}
			y += whcell + 2;
			x = 0;
		}

		x = 0;
		y = 0;
		
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				cellarr2[i][j] = new Cell(x, y, whcell, whcell);
				x += whcell + 5;
			}
			y += whcell + 2;
			x = 0;
		}
		setFocusable(true);
		addKeyListener(this);
		setFocusTraversalKeysEnabled(false);
		addMouseListener(this);
		addMouseMotionListener(this);
		time.start();

	}


	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, 2000, 1400);
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				cellarr[i][j].draw(g);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {

		updatedelay++;

		if (start) {
			if (updatedelay % 10 == 0) {
				updategrid();
			}
		}

		if (updatedelay >= 999999999) {
			updatedelay = 0;
		}

		Collision();
		repaint();
	}
	
	public void updategrid() {

		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {

				neighbors = countneighbors(cellarr, i, j);
				
				if (cellarr[i][j].getAlive() && (neighbors == 3 || neighbors == 2)) {
					cellarr2[i][j].setAlive(true);
				}
				if (!cellarr[i][j].getAlive() && (neighbors == 3)) {
					cellarr2[i][j].setAlive(true);
				}
				if (cellarr[i][j].getAlive() && (neighbors > 3 || neighbors < 2)) {
					cellarr2[i][j].setAlive(false);
				}
			
			
				if(cellarr[i][j].getAlive() && neighbors == 3) {
					cellarr2[i][j].setAlive(true);
				}
				else if(cellarr[i][j].getAlive() && (neighbors < 2 || neighbors > 3)) {
					cellarr2[i][j].setAlive(false);	
				}
				else {
					cellarr2[i][j].setAlive(cellarr[i][j].getAlive());	
				}
			}
		}
	
		cellarr = cellarr2;
		
	}

	public int countneighbors(Cell[][] arr, int i, int j) {

		int neighbors = 0;

		if (i + 1 < w && arr[i + 1][j].getAlive()) {
			neighbors++;
		}

		if (i - 1 >= 0 && arr[i - 1][j].getAlive()) {
			neighbors++;
		}

		if (j + 1 < h && arr[i][j + 1].getAlive()) {
			neighbors++;
		}

		if (j - 1 >= 0 && arr[i][j - 1].getAlive()) {
			neighbors++;
		}

		if (i + 1 < w && j + 1 < h && arr[i + 1][j + 1].getAlive()) {
			neighbors++;
		}

		if (i - 1 >= 0 && j - 1 >= 0 && arr[i - 1][j - 1].getAlive()) {
			neighbors++;
		}

		if (j - 1 >= 0 && i + 1 < w && arr[i + 1][j - 1].getAlive()) {
			neighbors++;
		}

		if (i - 1 >= 0 && j + 1 < h && arr[i - 1][j + 1].getAlive()) {
			neighbors++;
		}

		return neighbors;

	}

	public void gridvertical(int x) {
		for (int k = 0; k < w; k++) {
			for (int j = 0; j < h; j++) {
				cellarr[k][j].moveVertical(x);
			}
		}
	}

	public void gridhorizontal(int x) {
		for (int k = 0; k < w; k++) {
			for (int j = 0; j < h; j++) {
				cellarr[k][j].moveHorizontal(x);
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int i = e.getKeyCode();

		if (i == KeyEvent.VK_1) {
			start = true;
		}
		if (i == KeyEvent.VK_2) {
			start = false;
		}

//		if (i == KeyEvent.VK_W) {
//			for (int k = 0; k < w; k++) {
//				for (int j = 0; j < h; j++) {
//					cellarr[k][j].setVelV(20);
//				}
//			}
//		}
//		if (i == KeyEvent.VK_S) {
//			for (int k = 0; k < w; k++) {
//				for (int j = 0; j < h; j++) {
//					cellarr[k][j].setVelV(-20);
//				}
//			}
//		}
//
//		if (i == KeyEvent.VK_A) {
//			for (int k = 0; k < w; k++) {
//				for (int j = 0; j < h; j++) {
//					cellarr[k][j].setVelH(20);
//				}
//			}
//		}
//		if (i == KeyEvent.VK_D) {
//			for (int k = 0; k < w; k++) {
//				for (int j = 0; j < h; j++) {
//					cellarr[k][j].setVelH(-20);
//				}
//			}
//		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		int i = e.getKeyCode();

//		if (i == KeyEvent.VK_W) {
//			for (int k = 0; k < w; k++) {
//				for (int j = 0; j < h; j++) {
//					cellarr[k][j].setVelV(0);
//				}
//			}
//		}
//		if (i == KeyEvent.VK_S) {
//			for (int k = 0; k < w; k++) {
//				for (int j = 0; j < h; j++) {
//					cellarr[k][j].setVelV(0);
//				}
//			}
//		}
//
//		if (i == KeyEvent.VK_A) {
//			for (int k = 0; k < w; k++) {
//				for (int j = 0; j < h; j++) {
//					cellarr[k][j].setVelH(0);
//				}
//			}
//		}
//		if (i == KeyEvent.VK_D) {
//			for (int k = 0; k < w; k++) {
//				for (int j = 0; j < h; j++) {
//					cellarr[k][j].setVelH(0);
//				}
//			}
//		}

	}

	public void Collision() {
		Rectangle mouserec = c.bounds();

		for (int k = 0; k < w; k++) {
			for (int j = 0; j < h; j++) {
				Rectangle cellrec = cellarr[k][j].bounds();
				cellarr[k][j].setConf(false);
				if (mouserec.intersects(cellrec)) {
					cellarr[k][j].setConf(true);
				}

				if (mouserec.intersects(cellrec) && dragged) {
					cellarr[k][j].setAlive(true);
				}

			}
		}

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Container contentpane = frame.getContentPane();
		gridgame p = new gridgame();
		Dimension preferredSize = new Dimension();
		preferredSize.setSize(800, 800);
		frame.setSize(preferredSize);
		contentpane.add(p);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		c.x = e.getX() + 2;
		c.y = e.getY() + 2;

		dragged = true;

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		c.x = e.getX() + 2;
		c.y = e.getY() + 2;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		for (int k = 0; k < w; k++) {
			for (int j = 0; j < h; j++) {
				if (cellarr[k][j].getConf()) {
					cellarr[k][j].setAlive(true);
				}
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		dragged = false;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
