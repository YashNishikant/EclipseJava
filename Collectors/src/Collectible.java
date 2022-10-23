
public class Collectible {
	private double value;
	private String name;

	public Collectible() {
		this(0.01, "Worthless Garbage");
	}

	public Collectible(double v, String n) {
		value = v;
		name = n;
	}

	public double getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}

	public String toString() {
		return name + ", Value: $ " + value;
	}
}
