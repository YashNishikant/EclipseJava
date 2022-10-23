
public class Cheese extends Dairy {

	private int pieces;

	public Cheese(String name, int calories, boolean solid, int pieces) {
		super(name, calories, solid);
		this.pieces = pieces;
	}

	public int getPieces() {
		return pieces;
	}

}
