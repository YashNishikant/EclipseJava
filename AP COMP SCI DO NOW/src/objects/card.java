package objects;

public class card {

	private int value;
	private String suit;
	private String color;
	
	private String Ace =  "Ace of ";
	private String Jack =  "Jack of ";
	private String Queen =  "Queen of ";
	private String King =  "King of ";

	public card(int v, String s) {

		value = v + 1;
		suit = s;

		if (suit.equals("Hearts") || suit.equalsIgnoreCase("Diamonds")) {
			color = "Red";
		} else {
			color = "Black";
		}
	}

	public String toString1() {
		return value + " of " + suit;
	}

	public int getValue() {
		return value;
	}

	public String getSuit() {
		return suit;
	}

	public String getColor() {
		return color;
	}
	
	public String toString() {
		switch (value) {
		case 1:
			return Ace + suit;
		case 11:
			return Jack + suit;
		case 12:
			return Queen + suit;
		case 13:
			return King + suit;
		}
		return value + " of " + suit;
	}
}
