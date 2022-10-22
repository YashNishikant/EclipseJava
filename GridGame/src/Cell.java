
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

public class Cell {

	private int x;
	private int y;
	private boolean alive;
	private int velocityV = 0;
	private int velocityH = 0;
	private int w;
	private int h;
	private boolean confirmed;
	
	public Cell(int x, int y, int w, int h) {

		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		alive = false;
		confirmed = false;
	}

	public void draw(Graphics g) {
		if(alive)
			g.setColor(Color.WHITE);
		else
			g.setColor(Color.BLACK);
		
		g.fillRect(x,y,w,h);
	}
	
	public boolean getConf() {
		return confirmed;
	}
	
	public void setConf(boolean b) {
		confirmed = b;
	}
	
	public int getWidth() {
		return w;
	}
	
	public int getHeight() {
		return h;
	}
	
	public int getVelV() {
		return velocityV;
	}
	
	public void setVelV(int v) {
		velocityV = v;
	}
	
	public int getVelH() {
		return velocityH;
	}
	
	public void setVelH(int v) {
		velocityH = v;
	}
	
	public void moveHorizontal(int move) {
		x += move;
	}
	
	public void moveVertical(int move) {
		y += move;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean getAlive() {
		return alive;	
	}
	
	public void setAlive(boolean x) {
		alive = x;
	}

	public Rectangle bounds() {
		return (new Rectangle(x,y,w,h));
	}
	
}
