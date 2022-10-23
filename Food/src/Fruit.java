
public class Fruit extends Food {

	private boolean edibleSkin;

	public Fruit(String name, int calories, boolean edibleSkin) {
		super(name, calories);
		this.edibleSkin = edibleSkin;
	}

	public boolean hasEdibleSkin() {
		return edibleSkin;
	}
}
