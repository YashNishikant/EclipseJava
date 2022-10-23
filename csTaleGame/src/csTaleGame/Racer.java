package csTaleGame;

public class Racer {

	private int speed;
	private int position;
	private String name;
	
	public Racer(int x) {
		speed = x;
	}

	public int getPosition() {
		return position;
	}

	public int move() {
		return position += speed;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String x) {
		name = x;
	}
}
