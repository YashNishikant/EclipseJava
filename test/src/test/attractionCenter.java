package test;

import java.awt.Rectangle; 
import java.awt.Graphics;
import java.awt.Color;

public class attractionCenter extends Textures{

	private double x;
	private double y;
	private int width;
	private int height;
	private double mass;
	public static boolean attract;
	
	public attractionCenter (double x, double y, int width, int height, int mass) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.mass = mass;
		attract = false;
	}
	
	public void startGrav() {
		attract = true;
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
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;	
	}
	
	public double getMass() {
		return mass;
	}
	
	public void draw(Graphics g) {
		if(attract) {
			addImage(g, "vacuum.png", x, (int)y);
		}
		else {
			addImage(g, "vacuumOff.png", x, (int)y);
		}
	}
	
	public Rectangle bounds() {
		return(new Rectangle((int)x, (int)y, width, height));
	}
	
}
