package secondworld;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class human {

	double speedY;
	int personX;
	int personY;
	int maxheight;
	int minheight;
	int hHitBox;
	int wHitBox;
	int speedX;

	boolean jump = false;
	boolean rise = true;
	boolean insideSuit = false;
	boolean nobattery = false;
	boolean onetimejump = true;
	boolean max = false;

	public human() {
		speedX = 0;
		speedY = 0;
		personX = 810;
		personY = 870;
		maxheight = 770;
		minheight = 870;
		hHitBox = 70;
		wHitBox = 38;
	}

	public void move() {

		if (personY >= 870 && !jump && !insideSuit) {
			speedY = 0;
			personY = 870;
		}

		if (insideSuit && personY >= 871) {
			personY = 870;
		}

		personY += speedY;
		personX += speedX;
	}

	public void jump() {

		if (jump == true) {
			if (rise == true) {
				if (onetimejump) {
					speedY = -4;
					onetimejump = false;
				}
				speedY += 0.1;

				if (speedY > 0) {
					max = true;
					rise = false;
				}
			}

			if (!rise && max) {
				speedY += 0.1;
			}

			if (personY >= 870 && max) {
				speedY = 0;
				jump = false;
				onetimejump = true;
				max = false;
			}
		}
	}

	public void draw(Graphics g) {

		// User
		g.setColor(Color.red);
		g.fillRect(personX, personY + 30, 20, 30);

		// legs
		g.setColor(Color.blue);
		g.fillRect(personX + 12, personY + 61, 7, 19);
		g.fillRect(personX + 1, personY + 61, 7, 19);

		// arms
		g.setColor(Color.blue);
		g.fillRect(personX + 21, personY + 30, 7, 25);
		g.fillRect(personX - 8, personY + 30, 7, 25);

	}

	public Rectangle bounds() {

		return (new Rectangle(personX - 10, personY + 10, wHitBox, hHitBox));

	}

}
