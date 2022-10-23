
package mousemovements;
import java.awt.Container; 
import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

public class code{

	public static void main() {
		
		JFrame frame = new JFrame();

		Container contentpane = frame.getContentPane();
		code Panel = new code();

		Dimension preferredSize = new Dimension();
		preferredSize.setSize(600, 600);

		frame.setSize(preferredSize);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			Panel.repaint();
			TimeUnit.MILLISECONDS.sleep(1);
		}
	}
}
