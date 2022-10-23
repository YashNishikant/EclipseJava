package csTaleGame;

import java.util.ArrayList;

public class Race {

	public Race() {

		ArrayList<Racer> racers = new ArrayList<Racer>();

		int finalPlace = 50;

		Tortoise t = new Tortoise();
		Hare h = new Hare();

		racers.add(t);
		racers.add(h);

		System.out.println("Race to " + finalPlace + "!");
		divide();
		while (t.getPosition() < finalPlace && h.getPosition() < finalPlace) {
			for (Racer animal : racers) {
				System.out.println(animal.getName() + "'s turn to move");
				animal.move();
				System.out.println(animal.getName() + " Place: " + animal.getPosition());				
			}
			divide();
		}
		if(t.getPosition() >= 50 && h.getPosition() < 50) {
			System.out.println("TORTOISE WINS" + "\n");
			System.out.println("Final Positions \n" + "Tortoise: " + t.getPosition() + "\n" + "Hare: " + h.getPosition());
		}
		if(h.getPosition() >= 50 && t.getPosition() < 50) {
			System.out.println("HARE WINS" + "\n");
			System.out.println("Final Positions \n" + "Tortoise: " + t.getPosition() + "\n" + "Hare: " + h.getPosition());
		}
		if(h.getPosition() >= 50 && t.getPosition() >= 50) {
			System.out.println("TIE!");
			System.out.println("Final Positions \n" + "Tortoise: " + t.getPosition() + "\n" + "Hare: " + h.getPosition());
		}
	}

	public void divide() {
		System.out.println("_______________________");
	}

}
