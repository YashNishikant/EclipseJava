public class Hare extends Racer {

	private int x;

	public Hare() {

	}

	public void move() {
		int t = (int) (Math.random() * 3);
		if (t == 0) {
			setPos(x);
			x += 10;
		}
	}
}
