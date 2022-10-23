
public class GamingEquipment implements Comparable<GamingEquipment> {

	private String keyboard;
	private String mouse;
	private int price;
	
	public GamingEquipment(String k, String m, int p) {
		keyboard = k;
		mouse = m;
		price = p;
	}

	public int compareTo(GamingEquipment otherstuff) {
	
		if (this.getKeyboard().compareTo(otherstuff.getKeyboard()) != 0) {
			return this.getKeyboard().compareTo(otherstuff.getKeyboard());
		}
		
		if (this.getMouse().compareTo(otherstuff.getMouse()) != 0) {
			return this.getMouse().compareTo(otherstuff.getMouse());
		}

		return this.getPrice() - otherstuff.getPrice();
	}

	public String getKeyboard() {
		return keyboard;
	}

	public String getMouse() {
		return mouse;
	}

	public int getPrice() {
		return price;
	}
	
	
	public String toString() {
		return "Keyboard: " + keyboard + "\t Mouse: " + mouse + "\t  Price: $" + price ;
	}

}
