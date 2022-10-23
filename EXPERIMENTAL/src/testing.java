import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class testing extends JPanel implements ActionListener, KeyListener {
	
	double x = 0;

	public testing() {

		Timer time = new Timer(5, this);
		time.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		x+=0.05;
	}

	@Override
	public void paintComponent(Graphics g) {
		//super.paintComponent(g);
		
		System.out.println();
		g.fillOval((int)(x*25), (int)(5*(Math.sin(x))*25) + 600, 15, 15);
		g.fillOval((int)(x*25)+155*3, (int)(5*(Math.sin(x))*25) + 600, 15, 15);
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int i = e.getKeyCode();
	
	}


	public static void main(String[] args) {
		JFrame frame = new JFrame();

		Container contentpane = frame.getContentPane();
		testing Panel = new testing();

		Dimension preferredSize = new Dimension();
		preferredSize.setSize(600, 600);

		frame.setSize(preferredSize);
		contentpane.add(Panel);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}