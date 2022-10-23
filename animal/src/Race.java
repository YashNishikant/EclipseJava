import java.util.ArrayList;

public class Race {
	
	private int raceNum = 100;
	
	public Race() {

		Racer t = new Tortoise();
		Racer h = new Hare();
		ArrayList<Racer> racers = new ArrayList<Racer>();
		racers.add(t);
		racers.add(h);

		boolean race = true;
		System.out.println("Race to " + raceNum + "!");
		divide();
		while (race) {
			for (Racer r : racers) {
				r.move();
				System.out.println(r.getClass().getName() + ": " + r.getPos());
				r.getPos();
				if (r.getPos() == raceNum) {
					race = false;
				}
			}
			divide();
		}
		if (t.getPos() == 100)
			System.out.println("THE TORTOISE WINS");
		if (h.getPos() == 100)
			System.out.println("THE HARE WINS");

	}

	public void divide() {
		System.out.println("________________________________");
	}
	
}
