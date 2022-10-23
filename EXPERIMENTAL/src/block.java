
public class block {

	double width;
	double height;
	double x;
	double y;
	int speed;
	int tempSpeed = 2;
	double scale = 1;
	int speedSide;
	double endptX;
	double endptY;
	int speedLines;
	int speedLinesSides;
	
	public block() {
		width = 100;
		height = 200;
		x = 1000;
		y = 700;
		speed = 0;
		tempSpeed = 2;
		endptX = x-width;
		endptY = y;
	}

	public void move() {
		x += speed;
		y += speed;
	}
	public void moveSide() {
		x += speedSide;
	}	

	public void moveLines() {
		endptX+=speedLines;
		endptY+=speedLines;
	}
	public void moveLinesSide() {
		endptX+=speedLinesSides;
	}
}
