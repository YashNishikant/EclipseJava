package staticsandstuff;

public class Collectible {

	private static int totalvalue;
	private int value;
	private String name;
	public static final double COMMISSION = 0.5;
	
	public Collectible(String n, int v) {
		name = n;
		value = v;
		totalvalue += v;
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}

	public static int getTotalValue() {
		return totalvalue;	
	}
	
	public String toString() {
		return name + " - Value: " + value + ", Total Value: " + totalvalue;
	}
}
