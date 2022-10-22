package firstproject_solution;

import java.awt.Color;   
import java.awt.Graphics;

import java.awt.Rectangle;

public class Platform {

	public double width;
	public double height;
	private double y;
	private double fallingSpeed;
	private double gravity = 0.5;
	private double x;
	private boolean forceL;
	private boolean forceR;
	private int speed = 20;
	
	private boolean jump;
	private boolean initialforce;
	private double verticalvelocity;
	private boolean gravityactivate = true;
	private double DOWNWARDFORCE = 0.6;
	
	public Platform(int x) {
		width = 1000;
		height = 50;
		setXPos(x);
		setYPos(800);
	}

	public void Update() {

			y -= fallingSpeed;
			fallingSpeed += gravity;
	
			if(forceR) {
				x-=speed;
			}
			if(forceL) {
				x+=speed;
			}
	
			if (jump) {
				
				gravityactivate = false;
				
				if (initialforce) {
					fallingSpeed = 0;
					verticalvelocity = 20;
					initialforce = false;
				}
				y += verticalvelocity;
				verticalvelocity -= DOWNWARDFORCE;
				
			}
			if (verticalvelocity <= 0) {
				gravityactivate = true;
				jump = false;
			}			
			
			
	}
	
	
	public void jump() {
		jump = true;
		initialforce = true;
	}
	public void forceright() {
		forceR = true;
		forceL = false;
	}
	public void forceleft() {
		forceL = true;
		forceR = false;
	}
	public void STOP() {
		forceL = false;
		forceR = false;
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