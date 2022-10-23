import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Stroke;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import javax.swing.JPanel;

public class ShapePanel extends JPanel {

	boolean myBool = true;
	boolean myBool2 = true;
	boolean myBool3 = true;

	@Override
	public void paintComponent(Graphics g) {

		
		
		g.fillOval(50, 100, 65, 95);
		g.fillOval(225, 100, 65, 95);
		g.fillOval(400, 100, 65, 95);
		// Light One
		
		if (myBool) {
			g.setColor(Color.red);
			myBool = false;
		} else {
			g.setColor(Color.green);
			myBool = true;
		}
		g.fillOval(65, 120, 40, 60);

		// Light Two

		if (myBool2) {
			g.setColor(Color.cyan);
			myBool2 = false;
		} else {
			g.setColor(Color.orange);
			myBool2 = true;
		}

		g.fillOval(240, 120, 40, 60);

		// Light Three
		
		if (myBool3) {
			g.setColor(Color.yellow);
			myBool3 = false;
		} else {
			g.setColor(Color.pink);
			myBool3 = true;
		}

		g.fillOval(415, 120, 40, 60);

		g.setColor(Color.black);
		g.drawLine(415, 120, -120, 100);
		g.drawLine(815, 180, 240, 110);
	}
}
