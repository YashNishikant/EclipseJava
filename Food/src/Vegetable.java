
public class Vegetable extends Food{

	private boolean grownInSoil;
	
	public Vegetable(String name, int calories, boolean grownInSoil) {
		super(name, calories);
		this.grownInSoil = grownInSoil;
	}

	public boolean grownInSoil() {
		return grownInSoil;
	}
	
}
