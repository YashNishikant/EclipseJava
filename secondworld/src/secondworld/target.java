package secondworld;

import java.awt.Rectangle;

public class target {

	int targetx;
	int targety;
	int speed = (int)(Math.random()*4)+1;
	boolean letDestroy = false;
	boolean move = false;
	
	public target(int x, int y) {
		targetx = x;
		targety = y;
	}

	public void move() {
		if(move)
		targetx -= 4;
	}

	public void destroy() {

		if (letDestroy) {
			targetx = 2900;
			targety = 9000;
			speed = 0;
		}

	}

	public Rectangle bounds() {

		return (new Rectangle(targetx, targety, 30, 30));

	}
}
