package test;
import java.awt.Graphics;
import java.awt.Color; 

public class robot extends Textures{

	private double x;
	private double y;
	private int width;
	private int height;
	private boolean right;
	private boolean STOP;
	
	public robot (double x, double y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		STOP = true;
	}
	
	public void Update() {
		if(right && !STOP) {
			x+=5;
		}
		else if(!STOP){
			x-=5;	
		}
		
	}
	
	public void moveLeft() {
		right = false;
		STOP = false;
	}
	
	public void moveRight() {
		right = true;
		STOP = false;
	}

	public void STOP() {
		STOP = true;
	}
	
	public void draw(Graphics g) {
		addImage(g, "robot.png", x, (int)y);
	}
	
	public void setX(double newx) {
		x = newx;
	}
	
	public void setY(double newy) {
		y = newy;	
	}
	
	public double getXPos() {
		return x;
	}
	
	public double getYPos() {
		return y;	
	}
	
}
