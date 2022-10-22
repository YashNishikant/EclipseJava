package test;

import java.awt.Font;  
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Textures extends JPanel{

	String assetsPath;

	
	public Textures() {
		assetsPath = System.getProperty("user.dir");
		assetsPath += "\\src\\assets\\";
	}

	public void addText(Graphics g, String text, int x ,int y, int size) {

		g.setFont(new Font("default", Font.BOLD, size));
		g.drawString(text, x, y);
		
	}
	
	public void addImage(Graphics g, String s, double x, int y) {
		ImageIcon i = new ImageIcon(assetsPath + s);
		i.paintIcon(this, g, (int) x, (int) y);

	}
	
}

