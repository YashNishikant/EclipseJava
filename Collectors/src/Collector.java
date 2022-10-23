import java.util.ArrayList;

public class Collector {
	private ArrayList<Collectible> collectibles;
	private double balance;

//complete the constructor so the collector begins with an empty arraylist and a balance of $1000.00
	public Collector() {
		balance = 1000;
	}

//the collector will pay the price of the collectible to obtain it both balance and collectibles will be modified as a result
	public void obtainCollectible(Collectible c) {
		balance -= c.getValue();
		collectibles.add(c);
	}

//the collector will sell the oldest item in his/her collection both balance and collectibles will be modified as a result
	public void sellCollectible() {
		balance += collectibles.get(0).getValue();
		collectibles.remove(0);
	}
//Complete the class for Collector by writing accessor methods for the two instance variables.

	public double getBalance() {
		return balance;
	}

	public ArrayList<Collectible> getCollectibles() {
		return collectibles;
	}
	
	public String toString() {
		return "Balance: $" + balance + ", Items Bought: " + collectibles;
	}
	
}
