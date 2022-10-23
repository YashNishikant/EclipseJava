package objects;

import java.util.Scanner;

public class cardRunner {

	public cardRunner() {
		Scanner scan = new Scanner(System.in);
		Deck deck = new Deck();
		deck.shuffle();

		hand hand1 = new hand(2);
		hand dealer = new hand(2);

		for (int i = 0; i < 2; i++) {
			hand1.addCard(deck.deal());
			dealer.addCard(deck.deal());
		}

		divide();
		while(true) {
		System.out.println("You have:\t" + hand1 );
		System.out.println("Final Value:\t" + hand1.getTotalValue());
		
		System.out.println("What would you like to do next? (Hit, Stay)");
		String answer = scan.nextLine();

		if (answer.equalsIgnoreCase("hit")) {
			hand1.addCard(deck.deal());
			System.out.println("You have:\t" + hand1);
		}
		if (answer.equalsIgnoreCase("stay")) {
			System.out.println("You have:\t" + hand1);
		}
		divide();
	}
	}
	public void divide() {
		System.out.println("______________________________________________________");
	}
	
}
