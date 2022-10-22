package test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class particle extends Textures{

	private double x;
	private double y;
	private double speed;
	private double attractX;
	private double attractY;
	private double mass;
	private double objmass;
	private double dirX = 1;
	private double dirY = 1;
	private double gravConstant = 20;
	private double gravDirection;

	private int width;
	private int height;
	private int boundDOWN;
	private int boundRIGHT;

	private boolean up;
	private boolean right;
	private boolean killParticle;

	public particle(int x, int y, int speed, int width, int height, int boundDOWN, int boundRIGHT, double mass) {
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.width = width;
		this.height = height;
		this.boundDOWN = boundDOWN;
		this.boundRIGHT = boundRIGHT;
		this.mass = mass;

		up = false;
		right = false;

		int H_randomdir = (int) (Math.random() * 9) + 1;
		int V_randomdir = (int) (Math.random() * 9) + 1;

		if (H_randomdir < 5) {
			right = true;
		}
		if (V_randomdir < 5) {
			up = true;
		}
	}

	public void delete() {
		speed = 0;
		x = 900000;
		y = 900000;
		killParticle = true;
	}

	public void Update(double attractX, double attractY, double objmass) {
		if (!killParticle) {
			this.attractX = attractX;
			this.attractY = attractY;
			this.objmass = objmass;

			if (up) {
				y -= dirX * speed;
			} else {
				y += dirX * speed;
			}
			if (right) {
				x += dirY * speed;
			} else {
				x -= dirY * speed;
			}

			if (x - (width / 2) < 0) {
				right = true;
			}
			if (y - (height / 2) < 0) {
				up = false;
			}
			if (x + (width / 2) > boundRIGHT) {
				right = false;
			}
			if (y + (height / 2) > boundDOWN) {
				up = true;
			}

			if (attractionCenter.attract) {

				gravDirection = (gravConstant)
						* (((objmass) * (mass)) / (Math.pow(((getDistance((int) x, (int) y, attractX, attractY))), 2)));

				if (gravDirection > 10) {
					gravDirection = 10;
				}
				
				if (x < attractX)
					x += gravDirection;
				else
					x -= gravDirection;

				if (y < attractY)
					y += gravDirection;
				else
					y -= gravDirection;
			}

		}
	}

	public double getDistance(double x1, double y1, double x2, double y2) {

		double result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		if (result < 1) {
			return 1;
		} else {
			return result;
		}

	}

	public void draw(Graphics g) {
		addImage(g, "CO2.png", x, (int)y);
	}
	
	public boolean killParticle() {
		if (killParticle) {
			return true;
		}
		return false;
	}

	public Rectangle bounds() {
		return (new Rectangle((int) x, (int) y, (int) (width), (int) (height)));
	}
}
