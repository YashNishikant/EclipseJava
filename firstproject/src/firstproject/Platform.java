package firstproject;
import java.awt.Color;  
import java.awt.Graphics;

import java.awt.Rectangle;

public class Platform {

	public double width;
	public double height;
	private double y;
	private double fallingSpeed;
	private boolean gravityInverseActivate = true;
	private double gravity = 0.5;
	private double x;
	private boolean forceL;
	private boolean forceR;
	private int speed = 10;
	private boolean jump;
	private boolean ApplyInitialForce;
	private double force;
	private double DOWNWARD_FORCE;
	
	
	public Platform() {
		width = 1000;
		height = 500;
		setXPos(200);
		setYPos(800);
	}

	public void forceLeft() {
		forceL = true;
		forceR = false;
	}
	public void STOP() {
		forceL = false;
		forceR = false;
	}
		
	public void forceRight() {
		forceL = false;
		forceR = true;	
	}	
	
	public void Update() {
		//Gravity
			y -= fallingSpeed;
			fallingSpeed += gravity;
	
		//horizontal movement
			if(forceL) {
				x+=speed;
			}
			if(forceR) {
				x-=speed;
			}
			
			if (jump) {
				if (ApplyInitialForce) {
					fallingSpeed = 0;
					force = 15;
					ApplyInitialForce = false;
				}
							
				y += force;
				force -= DOWNWARD_FORCE;
				gravityInverseActivate = false;
			}
			if (force <= 0) {
				jump = false;
				gravityInverseActivate = true;
			}
	}
	public void FreezeVertical() {
		fallingSpeed = 0;
	}

	public double xPos() {
		return x;
	}
	public double yPos() {
		return y;
	}
	public void setXPos(double newpos) {
		x = newpos;
	}
	public void setYPos(double newpos) {
		y = newpos;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect((int) xPos(), (int) yPos(), (int) (width), (int) (height));
		
	}

	public Rectangle bounds() {
		return (new Rectangle((int) xPos(), (int) yPos(), (int) (width), (int) (height)));
	}
	
}

