public class Tortoise extends Racer {

	private int speed;

	public Tortoise() {
		speed = (int) (Math.random() * 5) + 1;
	}

	public void move() {

		speed += (int) (Math.random() * 5) + 1;

		setPos(speed);
		if (getPos() > 100) {
			setPos(100);
		}
	}
}
