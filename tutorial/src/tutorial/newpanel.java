package tutorial;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class newpanel extends JPanel{

	public static void main(String[] args) {

		JFrame frame = new JFrame();

		Container contentpane = frame.getContentPane();
		newpanel np = new newpanel();

		Dimension preferredSize = new Dimension();
		preferredSize.setSize(800, 800);

		frame.setSize(preferredSize);
		contentpane.add(np);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
