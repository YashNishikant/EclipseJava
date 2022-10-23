
public class Dairy extends Food{

	private boolean solid = false;
	
	public Dairy(String name, int calories, boolean solid) {
		super(name, calories);
		this.solid = solid;
	}

	public boolean isSolid() {
		return solid;
	}
	
}
