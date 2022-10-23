package staticsandstuff;

public class Diamond {

	private static int rarity;
	private String color;
	private String shape;
	public static final double PRICE = 2000000;
	
	public Diamond(String c, int r, String s) {
		color = c;
		rarity += r;
		shape = s;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getShape() {
		return shape;
	}

	public static int getRarity() {
		return rarity;	
	}
	
	public String toString() {
		return "Diamond - Color: " + color + ", Shape: " + shape + ", Rarity: " + rarity;
	}
}
