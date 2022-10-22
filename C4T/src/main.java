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

public class main extends JPanel implements KeyListener, ActionListener {

	ArrayList<Planet> pList = new ArrayList<Planet>();
	String c;
	boolean l;
	Timer t = new Timer(5, this);

	int x = 0;

	public main() {

		GeneratePlanets();

		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		t.start();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 20000, 20000);

		for (int i = 0; i < pList.size(); i++) {
			pList.get(i).Draw(g);
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
			GeneratePlanets();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	public void GeneratePlanets() {
		pList.clear();

		for (int i = 0; i < 10; i++) {

			int color = (int) (Math.random() * 3) + 1;
			if (color == 1) {
				c = "Red";
			}
			if (color == 2) {
				c = "Blue";
			}
			if (color == 3) {
				c = "Green";
			}

			int life = (int) (Math.random() * 2) + 1;
			if (life == 1) {
				l = true;
			} else {
				l = false;
			}

			pList.add(new Planet((int) (Math.random() * 1800 + 1), (int) (Math.random() * 800 + 1),
					(int) (Math.random() * 8400000) + 4_000_000, l, c));
		}
	
		pList.add(new Gas_Giant((int) (Math.random() * 1800 + 1), (int) (Math.random() * 800 + 1),
				(int) (Math.random() * 8400000) + 4_000_000, false, "RED"));
		
		System.out.println(pList.get(pList.size()-1).getLife());
		System.out.println(pList.get(pList.size()-1).getRadius());
		
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
