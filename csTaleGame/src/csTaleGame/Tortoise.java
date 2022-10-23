package csTaleGame;

public class Tortoise extends Racer {

	public Tortoise() {
		super((int) (Math.random() * 3) + 2);
		super.setName("Tortoise");
	}

}
