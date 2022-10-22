
import java.awt.Graphics;
import java.awt.Color;

public class Planet {
	
	private int radius;
	private boolean hasLife;
	private String color;
	
	private int x;
	private int y;
	
	public Planet(int x, int y, int r, boolean l, String c) {
		radius = r;
		hasLife = l;
		color = c;
		this.x = x;
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public boolean isHasLife() {
		return hasLife;
	}
	public void setHasLife(boolean hasLife) {
		this.hasLife = hasLife;
	}
	public boolean getLife() {
		return hasLife;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public void Draw(Graphics g) {
		if(color.equalsIgnoreCase("RED")) {
			g.setColor(new Color(181, 51, 51));
		}
		if(color.equalsIgnoreCase("BLUE")) {
			g.setColor(new Color(51, 107, 181));
		}
		if(color.equalsIgnoreCase("GREEN")) {
			g.setColor(new Color(71, 155, 65));
		}
		g.fillOval(x, y, radius/50000, radius/50000);
	
		g.setColor(Color.WHITE);
		g.fillOval(x-8,y-8,30,30);
		if(hasLife) {
			g.setColor(Color.GREEN);
		}
		else {
			g.setColor(Color.RED);
		}
		g.fillOval(x,y,15,15);
		
	}
	
}
