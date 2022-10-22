
import java.awt.Graphics;
import java.awt.Color;

public class Planet {
	
	private int radius;
	private boolean hasLife;
	private String color;
	private int x;
	
	public Planet(int x, int r, boolean l, String c) {
		radius = r;
		hasLife = l;
		color = c;
		this.x = x;
	}

	public void Draw(Graphics g) {
		
		if(color.equalsIgnoreCase("Orange")) {
			g.setColor(new Color(245,175,95));
		}
		if(color.equalsIgnoreCase("Purple")) {
			g.setColor(new Color(153,153,225));
		}
		if(color.equalsIgnoreCase("Green")) {
			g.setColor(new Color(119,199,133));
		}
		g.fillOval(x, 500, radius/100000, radius/100000);
		
		if(hasLife) {
			g.setColor(Color.GREEN);
		}
		else {
			g.setColor(Color.RED);
		}
		g.fillRect(x , 470, 50, 5);
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

	
}
