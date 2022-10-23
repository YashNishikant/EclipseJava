package csTaleGame;

public class Hare extends Racer {

	public Hare() {
		super(10);
		super.setName("Hare");
	}

	public int move() {
		int x = (int) (Math.random() * 3) + 1;
		if (x == 1)
			return super.move();
		else {
			return 0;
		}
	}

}
