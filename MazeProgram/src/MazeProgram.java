import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.Timer;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class MazeProgram extends JPanel implements KeyListener {
	JFrame frame;
	String[][] maze;
	String[][] minimap;

	ArrayList<Wall> walllist;
	boolean in2d = true;
	Player p;

	int resizeX = 200;
	int resizeY = 200;

	int shrink = 50;

	public MazeProgram() {

		frame = new JFrame();
		frame.add(this);
		frame.setSize(1000, 600);
		frame.setVisible(true);
		frame.addKeyListener(this);

		setMaze();

	}

	public void paintComponent(Graphics g2) {
		super.paintComponent(g2);

		Graphics2D g = (Graphics2D) g2;

		g.setColor(new Color(74, 163, 87));
		g.fillRect(0, 0, frame.getWidth(), frame.getHeight());

		if (in2d) {
			drawMaze(0, 0, g, 3);
		} else {

			drawMinimap(750, 100, p.getR(), p.getC(), g, 15);

			for (Wall w : walllist) {
				g.setPaint(w.getPaint());
				g.fillPolygon(w.getPoly());
				g.setColor(Color.BLACK);
				g.drawPolygon(w.getPoly());
			}

		}

	}

	public void drawMinimap(int drawX, int drawY, int xpos, int ypos, Graphics g, int size) {

		minimap = new String[size][size];

		int mid = size / 2;

		for (int i = 0; i < minimap.length; i++) {
			for (int j = 0; j < minimap[0].length; j++) {

				try {
					minimap[i][j] = maze[xpos - mid + i][ypos - mid + j];
				} catch (ArrayIndexOutOfBoundsException e) {
					minimap[i][j] = " ";
				}
			}
		}
		
		for (int i = 0; i < minimap.length; i++) {
			for (int j = 0; j < minimap[0].length; j++) {
				g.setColor(Color.BLACK);
				if (minimap[i][j].equals("*"))
					g.fillRect(drawX + j * 12, drawY + i * 12, 10, 10);


				g.setColor(Color.RED);
				g.fillOval(drawX + mid * 12, drawY + mid * 12, 10, 10);
				
			}
		}
	}

	public void drawMaze(int x, int y, Graphics g, int scale) {
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {

				g.setColor(Color.BLACK);
				if (maze[i][j].equals("*"))
					g.fillRect(x + j * 5 * scale, y + i * 5 * scale, 4 * scale, 4 * scale);

				g.setColor(Color.RED);
				g.fillOval(x + p.getC() * 5 * scale, y + p.getR() * 5 * scale, 4 * scale, 4 * scale);

			}
		}
	}

	public void set3D() {

		walllist = new ArrayList<Wall>();

		for (int a = 4; a > 0; a--) {
			leftWall(a);
			rightWall(a);
			leftPath(a);
			rightPath(a);

			ceiling(a);
			floor(a);

		}
		int row = p.getR();
		int col = p.getC();

		for (int a = 4; a > 0; a--) {
			try {
				switch (p.getDir()) {
				case 'E':

					if (maze[row - 1][col + a].equals("*")) {
						leftWall(a);
					}
					if (maze[row + 1][col + a].equals("*")) {
						rightWall(a);
					}
					if (maze[row][col + a].equals("*")) {
						frontwall(a);
					}
					break;
				case 'S':

					if (maze[row + a][col + 1].equals("*")) {
						leftWall(a);
					}
					if (maze[row + a][col - 1].equals("*")) {
						rightWall(a);
					}
					if (maze[row + a][col].equals("*")) {
						frontwall(a);
					}
					break;
				case 'W':
					if (maze[row + 1][col - a].equals("*")) {
						leftWall(a);
					}
					if (maze[row - 1][col - a].equals("*")) {
						rightWall(a);
					}
					if (maze[row][col - a].equals("*")) {
						frontwall(a);
					}
					break;
				case 'N':
					if (maze[row - a][col - 1].equals("*")) {
						leftWall(a);
					}
					if (maze[row - a][col + 1].equals("*")) {
						rightWall(a);
					}
					if (maze[row - a][col].equals("*")) {
						frontwall(a);
					}
					break;
				}

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Out Of Bounds");
			}
		}

	}

	public void floor(int a) {

		int[] x = { 150 + 50 * a, 850 - 50 * a - resizeX, 900 - 50 * a - resizeX, 100 + 50 * a };
		int[] y = { 500 - 50 * a, 500 - 50 * a, 550 - 50 * a, 550 - 50 * a };
		walllist.add(new Wall(x, y, 255 - shrink * a, 255 - shrink * a, 255 - shrink * a, "Floor", shrink, null));
	}

	public void ceiling(int a) {

		int[] x = { 150 + 50 * a, 850 - 50 * a - resizeX, 900 - 50 * a - resizeX, 100 + 50 * a };
		int[] y = { 100 + 50 * a, 100 + 50 * a, 50 + 50 * a, 50 + 50 * a };
		walllist.add(new Wall(x, y, 255 - shrink * a, 255 - shrink * a, 255 - shrink * a, "Ceil", shrink, null));
	}

	public void frontwall(int a) {
		int[] x = { 100 + 50 * a, 900 - 50 * a - resizeX, 900 - 50 * a - resizeX, 100 + 50 * a };
		int[] y = { 50 + 50 * a, 50 + 50 * a, 550 - 50 * a, 550 - 50 * a };
		walllist.add(new Wall(x, y, 255 - shrink * a, 255 - shrink * a, 255 - shrink * a, "Front", shrink, null));
	}

	public void leftPath(int a) {
		int[] x = { 100 + 50 * a, 150 + 50 * a, 150 + 50 * a, 100 + 50 * a };
		int[] y = { 100 + 50 * a, 100 + 50 * a, 500 - 50 * a, 500 - 50 * a };
		walllist.add(new Wall(x, y, 255 - shrink * a, 255 - shrink * a, 255 - shrink * a, "LeftPath", shrink, null));
	}

	public void leftWall(int a) {
		int[] x = { 100 + 50 * a, 150 + 50 * a, 150 + 50 * a, 100 + 50 * a };
		int[] y = { 50 + 50 * a, 100 + 50 * a, 500 - 50 * a, 550 - 50 * a };
		walllist.add(new Wall(x, y, 255 - shrink * a, 255 - shrink * a, 255 - shrink * a, "Left", shrink, null));
	}

	public void rightPath(int a) {
		int[] x = { 900 - 50 * a - resizeX, 850 - 50 * a - resizeX, 850 - 50 * a - resizeX, 900 - 50 * a - resizeX };
		int[] y = { 100 + 50 * a, 100 + 50 * a, 500 - 50 * a, 500 - 50 * a };
		walllist.add(new Wall(x, y, 255 - shrink * a, 255 - shrink * a, 255 - shrink * a, "RightPath", shrink, null));
	}

	public void rightWall(int a) {
		int[] x = { 900 - 50 * a - resizeX, 850 - 50 * a - resizeX, 850 - 50 * a - resizeX, 900 - 50 * a - resizeX };
		int[] y = { 50 + 50 * a, 100 + 50 * a, 500 - 50 * a, 550 - 50 * a };
		walllist.add(new Wall(x, y, 255 - shrink * a, 255 - shrink * a, 255 - shrink * a, "Right", shrink, null));
	}

	public void setMaze() {

		maze = new String[34][0];

		File file = new File("C:\\Users\\yash0\\eclipse-workspace\\MazeProgram\\mazefile");

		try {
			String text;
			BufferedReader input = new BufferedReader(new FileReader(file));
			int r = 0;
			boolean first = true;
			while ((text = input.readLine()) != null) {
				if (first) {
					String[] pieces = text.split(" ");
					int row = Integer.parseInt(pieces[0]);
					int col = Integer.parseInt(pieces[1]);
					char dir = pieces[2].charAt(0);
					int endRow = Integer.parseInt(pieces[3]);
					int endCol = Integer.parseInt(pieces[4]);

					p = new Player(row, col, dir);
					first = false;
				} else {
					String[] pieces = text.split("");
					maze[r] = pieces;
					r++;
				}
			}

		} catch (IOException e) {
			System.out.println("File not found");
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_E) {
			in2d = !in2d;
		}

		p.move(e.getKeyCode());

		if (!in2d)
			set3D();
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	public static void main(String[] args) {
		new MazeProgram();
	}

	public class Wall {

		int r = 100, g = 100, b = 100;
		int[] x, y;
		String type;
		Color c;
		int d;

		public Wall(int[] x, int[] y, int r, int g, int b, String type, int d, Color c) {
			this.x = x;
			this.y = y;
			this.c = c;
			this.r = r;
			this.b = b;
			this.g = g;
			this.d = d;
			this.type = type;
		}

		public Polygon getPoly() {
			return new Polygon(x, y, 4);
		}

		public String getType() {
			return type;
		}

		public void setColor(Color c) {
			this.c = c;
		}

		public GradientPaint getPaint() {

			int endR = r - 50, endB = b - 50, endG = g - 50;
			if (r < 0) {
				r = 0;
			}
			if (g < 0) {
				g = 0;
			}
			if (b < 0) {
				b = 0;
			}
			if (endR < 0) {
				endR = 0;
			}
			if (endB < 0) {
				endB = 0;
			}
			if (endG < 0) {
				endG = 0;
			}

			Color startColor = new Color(r, g, b);
			Color endColor = new Color(endR, endG, endB);

			switch (type) {
			case "Right":
			case "Left":
				return new GradientPaint(x[0], y[0], startColor, x[1], y[0], endColor);
			}
			return new GradientPaint(x[0], y[0], endColor, x[0], y[2], startColor);
		}

	}

	public class Player {

		private int r;
		private int c;
		private char dir;

		public Player(int r, int c, char dir) {
			this.r = r;
			this.c = c;
			this.dir = dir;
		}

		public int getR() {
			return r;
		}

		public void setR(int r) {
			this.r = r;
		}

		public char getDir() {
			return dir;
		}

		public void setDir(char dir) {
			this.dir = dir;
		}

		public int getC() {
			return c;
		}

		public void setColor(int c) {
			this.c = c;
		}

		public void move(int code) {

			if (code == 87) {
				dir = 'N';
			}

			if (code == 65) {
				dir = 'W';
			}

			if (code == 83) {
				dir = 'S';
			}

			if (code == 68) {
				dir = 'E';
			}

			if (code == KeyEvent.VK_SPACE) {
				if (dir == 'N') {
					if (!maze[r - 1][c].equals("*"))
						r--;
				}
				if (dir == 'E') {
					if (!maze[r][c + 1].equals("*"))
						c++;
				}
				if (dir == 'S') {
					if (!maze[r + 1][c].equals("*"))
						r++;
				}
				if (dir == 'W') {
					if (!maze[r][c - 1].equals("*"))
						c--;
				}

			}

		}

	}

}
