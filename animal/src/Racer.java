public abstract class Racer {
	
	private int pos = 0;
	private int speed = 0;
	
	public Racer() {

	}
	
	public int getPos() {
		return pos;
	}
	public void setPos(int x) {
		pos = x;
	}
	public abstract void move();
	
}