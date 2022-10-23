package staticsandstuff;

public class Main {
	
	public static void main(String[] args) {
		Collectible c = new Collectible("$19 Fortnite Card", 19);
		Collectible c2 = new Collectible("Poop", 5);
		Collectible c3 = new Collectible("Tejjjy", 5);
		Collectible c4 = new Collectible("zood", 15);
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c4);
		System.out.println("Sell " + c3.getName() + " for $" + c3.getValue()*Collectible.COMMISSION);
	}
	
}
