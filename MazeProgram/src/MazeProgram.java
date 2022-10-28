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

public class MazeProgram extends JPanel implements KeyListener, ActionListener {
	Timer t = new Timer(5, this);
	JFrame frame;
	String[][] maze;
	String[][] minimap;

	ArrayList<Wall> walllist;
	ArrayList<Wall> trailList;
	int index = 0;
	ArrayList<Character> directions;
	boolean in2d = true;
	boolean winscreen = false;
	boolean flashlight = false;
	boolean startscreen = true;
	boolean key = false;
	boolean message = false;
	boolean message2 = false;
	boolean message3 = false;
	Player p;

	int resizeX = 250;
	int shrink = 50;
	int moves = 0;
	int platformX;
	int platformY;
	int darkness = 1;
	int time = 0;
	int time2 = 0;
	int time3 = 0;

	double FL_lvl = 190;
	boolean charged = true;

	public MazeProgram() {

		t.start();

		directions = new ArrayList<Character>();
		directions.add('N');
		directions.add('E');
		directions.add('S');
		directions.add('W');

		frame = new JFrame();
		frame.add(this);
		frame.setSize(1000, 600);
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setMaze();
		hidePlatform();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}

	public void paintComponent(Graphics g2) {
		super.paintComponent(g2);

		Graphics2D g = (Graphics2D) g2;
		if (!startscreen) {
			if (in2d) {
				g.setColor(new Color(74, 163, 87));
				g.fillRect(0, 0, frame.getWidth(), frame.getHeight());
				drawMaze(0, 0, g, 3);

			} else if (!winscreen) {
				g.setColor(new Color(74, 163, 87));
				g.fillRect(0, 0, frame.getWidth(), frame.getHeight());
				drawMinimap(750, 100, p.getR(), p.getC(), g, 15);

				for (Wall w : walllist) {
					if (w.getType().equals("Win")) {
						g.setPaint(w.getPaint(darkness, true));
						g.fillPolygon(w.getPoly());
						g.setColor(Color.BLACK);
						g.drawPolygon(w.getPoly());
					} else if (w.getType().equals("Platform") && flashlight) {
						g.setPaint(w.getPaintFloor(0, 155, 155));
						g.fillPolygon(w.getPoly());
						g.setColor(Color.BLACK);
						g.drawPolygon(w.getPoly());
					} else {
						g.setPaint(w.getPaint(darkness, false));
						g.fillPolygon(w.getPoly());
						g.setColor(Color.BLACK);
						g.drawPolygon(w.getPoly());
					}
				}

				g.setColor(Color.BLACK);
				g.setFont(new Font("default", Font.BOLD, 30));
				g.drawString("Moves: " + moves, 750, 50);

			}

			if(!in2d) {
				
				if (message && time < 200) {
					g.setColor(Color.BLACK);
					g.setFont(new Font("default", Font.BOLD, 30));
					g.drawString("Find the key platform first...", 159, 539);
					time++;
				} else if (time >= 200) {
					message = false;
					time = 0;
				}
				
				if (message2 && time2 < 200) {
					g.setColor(Color.BLACK);
					g.setFont(new Font("default", Font.BOLD, 30));
					g.drawString("KEY FOUND", 159, 539);
					time2++;
				} else if (time2 >= 200) {
					message2 = false;
					time2 = 0;
				}

				if (message3 && time3 < 200 && flashlight) {
					g.setColor(Color.BLACK);
					g.setFont(new Font("default", Font.BOLD, 30));
					g.drawString("PRESS E", 159, 539);
					time3++;
				} else if (time3 >= 200) {
					message3 = false;
					time3 = 0;
				}
			}
			
			if (p != null) {
				if (p.getR() == 33 && p.getC() == 58 && key) {
					winscreen = true;
				} else if (p.getR() == 32 && p.getC() == 58 && !key) {
					message = true;
					p.setR(p.getR() - 1);
				}

			}

			if (winscreen) {
				g.setColor(new Color(0, 155, 155));
				g.fillRect(0, 0, frame.getWidth(), frame.getHeight());

				g.setColor(Color.BLACK);
				g.setFont(new Font("default", Font.BOLD, 30));
				g.drawString("GG. You solved the maze in " + moves + " moves...", frame.getWidth() / 3,
						frame.getHeight() / 3);
				message2 = false;
				message3 = false;
			}

			if (!winscreen && !in2d)
				flashlightbar(g);

		}
		else {
			g.setColor(new Color(157, 224, 238));
			g.fillRect(0, 0, frame.getWidth(), frame.getHeight());
			g.setColor(new Color(0,94,255));
			g.setFont(new Font("default", Font.BOLD, 50));
			g.drawString("Welcome To The Maze", frame.getWidth() / 3 - 100, frame.getHeight() / 3 - 100);
			g.setFont(new Font("default", Font.ITALIC, 20));
			g.setColor(Color.BLACK);
			g.drawString("-You have a flashlight with limited battery. Use it to see the hidden blue platform key somewhere in the maze.", frame.getWidth() / 3 - 100, frame.getHeight() / 3 + 30);
			g.drawString("-The platform key cannot be seen on the 2D map, but you can see it on the minimap if your flashlight is on.", frame.getWidth() / 3 - 100, frame.getHeight() / 3 + 60);
			g.drawString("-Once you collect the blue platform key, you can escape the maze.", frame.getWidth() / 3 - 100, frame.getHeight() / 3 + 90);
			g.drawString("-(E) to collect platform key.", frame.getWidth() / 3 - 100, frame.getHeight() / 3 + 120);
			g.drawString("-(F) to toggle flashlight.", frame.getWidth() / 3 - 100, frame.getHeight() / 3 + 150);
			g.drawString("-(RIGHT) and (LEFT) arrow keys to change direction.", frame.getWidth() / 3 - 100, frame.getHeight() / 3 + 180);
			g.drawString("-(UP) to move forward.", frame.getWidth() / 3 - 100, frame.getHeight() / 3 + 210);
			g.drawString("-(SPACE) to toggle perspectives.", frame.getWidth() / 3 - 100, frame.getHeight() / 3 + 240);
			

			g.setFont(new Font("default", Font.BOLD, 30));
			g.drawString("(P) To Play", frame.getWidth() / 3 - 100, frame.getHeight() / 3 + 400);
		}
	}

	public void flashlightbar(Graphics g) {
		if (flashlight) {
			g.setColor(Color.BLACK);
			g.fillRect(750, 350, 200, 25);
			g.fillRect(755, 355, 200, 15);
			g.setColor(Color.YELLOW);
			g.fillRect(755, 355, (int) FL_lvl, 15);

			if (FL_lvl > 0) {
				FL_lvl -= 0.05;
			} else {
				flashlight = false;
				charged = false;
				darkness = 1;
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

				if (minimap[i][j].equals("#") && flashlight) {
					g.setColor(Color.YELLOW);
					g.fillRect(drawX + j * 12, drawY + i * 12, 10, 10);
				}

				g.setColor(Color.RED);
				g.fillOval(drawX + mid * 12, drawY + mid * 12, 10, 10);

			}
		}
	}

	public void drawMaze(int x, int y, Graphics g, int scale) {
		if (maze != null) {
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
	}

	public void set3D() {

		walllist = new ArrayList<Wall>();
		int row = p.getR();
		int col = p.getC();

		for (int a = 4; a > 0; a--) {
			leftWall(a);
			rightWall(a);
			leftPath(a);
			rightPath(a);
			ceiling(a);

		}

		for (int a = 4; a > 0; a--) {
			try {
				switch (p.getDir()) {
				case 'E':
					if (maze[row][col + a].equals(" "))
						floor(a, "Floor");
					if (maze[row][col + a].equals("#"))
						floor(a, "Platform");
					if (maze[row - 1][col + a].equals("*")) {
						leftWall(a);
					}
					if (maze[row + 1][col + a].equals("*")) {
						rightWall(a);
					}
					if (maze[row][col + a].equals("*")) {
						frontwall(a, "Front");
					}
					break;
				case 'S':

					if (maze[row + a][col].equals(" "))
						floor(a, "Floor");
					if (maze[row + a][col].equals("#"))
						floor(a, "Platform");
					if (maze[row + a][col + 1].equals("*")) {
						leftWall(a);
					}
					if (maze[row + a][col - 1].equals("*")) {
						rightWall(a);
					}
					if (maze[row + a][col].equals("*")) {
						frontwall(a, "Front");
					}
					if (maze[row + a][col].equals("!")) {
						frontwall(a, "Win");
					}
					break;
				case 'W':
					if (maze[row][col - a].equals(" "))
						floor(a, "Floor");
					if (maze[row][col - a].equals("#"))
						floor(a, "Platform");
					if (maze[row + 1][col - a].equals("*")) {
						leftWall(a);
					}
					if (maze[row - 1][col - a].equals("*")) {
						rightWall(a);
					}
					if (maze[row][col - a].equals("*")) {
						frontwall(a, "Front");
					}
					break;
				case 'N':
					if (maze[row - a][col].equals(" "))
						floor(a, "Floor");
					if (maze[row - a][col].equals("#"))
						floor(a, "Platform");
					if (maze[row - a][col - 1].equals("*")) {
						leftWall(a);
					}
					if (maze[row - a][col + 1].equals("*")) {
						rightWall(a);
					}
					if (maze[row - a][col].equals("*")) {
						frontwall(a, "Front");
					}

					break;
				}

			} catch (ArrayIndexOutOfBoundsException e) {
			}
		}

	}

	public void floor(int a, String type) {

		int[] x = { 150 + 50 * a, 850 - 50 * a - resizeX, 900 - 50 * a - resizeX, 100 + 50 * a };
		int[] y = { 500 - 50 * a, 500 - 50 * a, 550 - 50 * a, 550 - 50 * a };
		walllist.add(new Wall(x, y, 255 - shrink * a, 255 - shrink * a, 255 - shrink * a, type, shrink, null));
	}

	public void ceiling(int a) {

		int[] x = { 150 + 50 * a, 850 - 50 * a - resizeX, 900 - 50 * a - resizeX, 100 + 50 * a };
		int[] y = { 100 + 50 * a, 100 + 50 * a, 50 + 50 * a, 50 + 50 * a };
		walllist.add(new Wall(x, y, 255 - shrink * a, 255 - shrink * a, 255 - shrink * a, "Ceil", shrink, null));
	}

	public void frontwall(int a, String type) {
		int[] x = { 100 + 50 * a, 900 - 50 * a - resizeX, 900 - 50 * a - resizeX, 100 + 50 * a };
		int[] y = { 50 + 50 * a, 50 + 50 * a, 550 - 50 * a, 550 - 50 * a };
		walllist.add(new Wall(x, y, 255 - shrink * a, 255 - shrink * a, 255 - shrink * a, type, shrink, null));
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

	public void hidePlatform() {

		int rand = (int) (Math.random() * 441) + 10;
		int count = 0;

		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if (maze[i][j].equals(" ")) {
					count++;

					if (count == rand) {
						maze[i][j] = "#";
						platformX = i;
						platformY = j;
					}

				}
			}
		}
	}

	public void setMaze() {

		maze = new String[34][0];

		File file = new File("C:\\Users\\yash0\\eclipse-workspace\\MazeProgram\\mazeFile.txt");

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

					p = new Player(row, col, dir);
					first = false;
				} else {
					try {
						String[] pieces = text.split("");
						maze[r] = pieces;
						r++;
					} catch (ArrayIndexOutOfBoundsException e) {

					}
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

		if (e.getKeyCode() == KeyEvent.VK_P) {
			startscreen = false;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			in2d = !in2d;
		}

		if (e.getKeyCode() == KeyEvent.VK_F && charged && !in2d) {

			flashlight = !flashlight;

			if (flashlight)
				darkness = 0;
			else
				darkness = 1;
		}

		p.move(e.getKeyCode());

		if (!in2d)
			set3D();

		try {
			if (p.getR() == platformX && p.getC() == platformY && maze[platformX][platformY].equals("#")) {
				message3 = true;
				if (e.getKeyCode() == KeyEvent.VK_E) {
					message2 = true;
					message3 = false;
					key = true;
					maze[platformX][platformY] = " ";
				}
			} else {
				message3 = false;
			}
		} catch (NullPointerException e2) {

		}

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

		public GradientPaint getPaintFloor(int r, int g, int b) {

			Color color = new Color(r, g, b);
			return new GradientPaint(x[0], y[0], color, x[0], y[2], color);

		}

		public GradientPaint getPaint(int darkness, boolean win) {

			if (win) {
				Color color = new Color(0, 155, 155);
				return new GradientPaint(x[0], y[0], color, x[0], y[2], color);
			} else {
				darkness *= 50;

				int endR = r - darkness - 50, endB = b - darkness - 50, endG = g - darkness - 50;
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

				Color startColor = new Color(r - darkness, g - darkness, b - darkness);
				Color endColor = new Color(endR, endG, endB);

				switch (type) {
				case "Right":
				case "Left":
					return new GradientPaint(x[0], y[0], startColor, x[1], y[0], endColor);
				}
				return new GradientPaint(x[0], y[0], endColor, x[0], y[2], startColor);
			}
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

		public void dirCheck() {
			if (index == directions.size()) {
				index = 0;
			}
			if (index < 0) {
				index = directions.size() - 1;
			}
		}

		public void move(int code) {

			if (code == KeyEvent.VK_RIGHT) {
				index++;
				dirCheck();
				dir = directions.get(index);
			}

			if (code == KeyEvent.VK_LEFT) {
				index--;
				dirCheck();
				dir = directions.get(index);
			}

			try {

				if (code == KeyEvent.VK_UP) {

					if (dir == 'N') {
						if (!maze[r - 1][c].equals("*")) {
							r--;
							moves++;
						}
					}
					if (dir == 'E') {
						if (!maze[r][c + 1].equals("*")) {
							c++;
							moves++;
						}
					}
					if (dir == 'S') {
						if (!maze[r + 1][c].equals("*")) {
							r++;
							moves++;
						}
					}
					if (dir == 'W') {
						if (!maze[r][c - 1].equals("*")) {
							c--;
							moves++;
						}
					}

				}
			} catch (ArrayIndexOutOfBoundsException e) {

			}
		}

	}

}
