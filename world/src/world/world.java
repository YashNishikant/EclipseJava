package world;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import javax.swing.JFrame;
import java.util.concurrent.TimeUnit;


public class world {
		
	static GraphicsConfiguration gc;

	public static void main(String[] args) throws InterruptedException {

		JFrame frame = new JFrame(gc);
			
		Container contentpane = frame.getContentPane();
		worldPanel WPanel = new worldPanel();
			
		Dimension preferredSize = new Dimension();
		preferredSize.setSize(600, 600);

		frame.setSize(preferredSize);
		contentpane.add(WPanel);
		
		frame.setVisible(true);
			
	}
}