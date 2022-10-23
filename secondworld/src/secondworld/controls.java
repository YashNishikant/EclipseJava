package secondworld;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class controls {
	
	int ammo;	
	int hitcount;
	
	public controls() {
		
		hitcount = 0;
		ammo = 100;	
		
	}
	
	public void naturaldrawings(Graphics g) {
		
		// Sky
		g.setColor(Color.cyan);
		g.fillRect(0, 0, 2000, 2000);
		// Ground
		g.setColor(Color.gray);
		g.fillRect(0, 950, 2000, 2000);
		
	}
	
	public void draw(Graphics g) {
		
		g.setColor(Color.BLACK);
		g.fillRect(6, 22, 22, 22);
		g.setColor(Color.CYAN);
		g.fillRect(8, 24, 18, 18);
		g.setColor(Color.BLACK);
		g.setFont(new Font("default", Font.BOLD, 20));
		g.drawString("V Equip Armor", 10, 40);
		
		g.setColor(Color.BLACK);
		g.fillRect(6, 72, 22, 22);
		g.setColor(Color.CYAN);
		g.fillRect(8, 74, 18, 18);
		g.setColor(Color.BLACK);
		g.setFont(new Font("default", Font.BOLD, 20));
		g.drawString("W Jump", 7, 90);
		
	}
	
	public void drawArmor(Graphics g) {
		
		g.setColor(Color.BLACK);
		g.fillRect(20, 182, 22, 22);
		g.setColor(Color.CYAN);
		g.fillRect(22, 184, 18, 18);
		g.setColor(Color.BLACK);
		g.setFont(new Font("default", Font.BOLD, 20));
		g.drawString("F Ready Blaster", 24, 200);
		
		g.setColor(Color.BLACK);
		g.fillRect(20, 232, 22, 22);
		g.setColor(Color.CYAN);
		g.fillRect(22, 234, 18, 18);
		g.setColor(Color.BLACK);
		g.setFont(new Font("default", Font.BOLD, 20));
		g.drawString("R Fire Bullets", 24, 250);
		
		g.setColor(Color.BLACK);
		g.fillRect(20, 282, 22, 22);
		g.setColor(Color.CYAN);
		g.fillRect(22, 284, 18, 18);
		g.setColor(Color.BLACK);
		g.setFont(new Font("default", Font.BOLD, 20));
		g.drawString("C Exit Suit", 24, 300);
		
		g.setColor(Color.BLACK);
		g.fillRect(20, 332, 22, 22);
		g.setColor(Color.CYAN);
		g.fillRect(22, 334, 18, 18);
		g.setColor(Color.BLACK);
		g.setFont(new Font("default", Font.BOLD, 20));
		g.drawString("G Unready Blaster", 24, 350);

		g.setColor(Color.BLACK);
		g.setFont(new Font("default", Font.BOLD, 25));
		g.drawString("Ammo: " + ammo, 20, 50);
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("default", Font.BOLD, 25));
		g.drawString("Target Hits: " + hitcount, 20, 100);
		
	}
	
}
