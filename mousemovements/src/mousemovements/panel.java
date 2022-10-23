package mousemovements;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class panel {

	static GraphicsConfiguration gc;

	public static void main(String[] args) throws InterruptedException {

		JFrame frame = new JFrame(gc);

		Container contentpane = frame.getContentPane();
		code Panel = new code();

		Dimension preferredSize = new Dimension();
		preferredSize.setSize(600, 600);

		frame.setSize(preferredSize);
		contentpane.add(Panel);
		frame.setVisible(true);

		while (true) {
			Panel.repaint();
			TimeUnit.MILLISECONDS.sleep(1);
		}
	}

}
