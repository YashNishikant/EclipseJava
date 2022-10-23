package objects;

import java.util.ArrayList;

public class hand {

	private int maxCards;
	private ArrayList<card> cards;
	private int totalValue = 0;
	
	public hand(int m) {
		
		cards = new ArrayList<card>(maxCards);
		maxCards = m;
		getCards();
		getMaxCards(maxCards);
	}

	public String toString() {
		String temp = "";
		for (int i = 0; i < cards.size(); i++) {
			temp += cards.get(i).toString() + "\t";
			
			if((cards.get(i).getValue() > 10)){
				totalValue += 10;
			}
			
			if((cards.get(i).getValue() == 1)){
				totalValue += 11;
			}
			if((!(cards.get(i).getValue() == 1)) && (!(cards.get(i).getValue() > 10))) {
				totalValue += cards.get(i).getValue();
			}
		}
		return temp;
	}

	public int getTotalValue() {
		return totalValue;
	}
	
	public ArrayList<card> getCards() {
		return cards;
	}

	public int getMaxCards(int max) {
		return max;
	}

	public void addCard(card c) {
		cards.add(c);
	}
}
