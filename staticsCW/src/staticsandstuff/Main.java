package staticsandstuff;

public class Main {
	
	public static void main(String[] args) {
		Diamond d1 = new Diamond("Blue", 1, "triangular");
		Diamond d2 = new Diamond("Blue", 4, "triangular" );
		Diamond d3 = new Diamond("Blue", 7,  "triangular");
		Diamond d4 = new Diamond("Blue", 3,  "triangular");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d4);
		System.out.println("Sell Diamond for $" + Diamond.PRICE);
	}
	
}
