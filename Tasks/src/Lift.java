import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lift {

	ArrayList<Integer> answer, liftSpace;
	ArrayList<ArrayList<Integer>> apartment;
	int currFloor, capacity, floors;
	boolean inc, visited;

	public Lift() {

		capacity = -1;
		floors = 0;
		inc = true;
		visited = false;
		currFloor = 0;
		liftSpace = new ArrayList<Integer>();
		apartment = new ArrayList<ArrayList<Integer>>();
		answer = new ArrayList<Integer>();

		File file = new File("C:\\Users\\yash0\\eclipse-workspace\\Tasks\\src\\TheLiftFile.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String temp;
			while ((temp = reader.readLine()) != null) {

				String[] pieces = temp.split(" ");
				if (pieces[0].equals("Floors:")) {
					floors = Integer.parseInt(pieces[1]);
					answer.clear();
					liftSpace.clear();
					apartment.clear();
					currFloor = 0;
				} else if (!pieces[0].equals("Floors:") && !pieces[0].equals("Capacity:")) {
					String[] peoplearray = temp.split(",");

					ArrayList<Integer> peopletoint = new ArrayList<Integer>();
					for (int i = 0; i < peoplearray.length; i++) {
						if (!peoplearray[i].isEmpty())
							peopletoint.add(Integer.parseInt(peoplearray[i]));
					}
					apartment.add(peopletoint);

				}
				if (pieces[0].equals("Capacity:")) {

					capacity = Integer.parseInt(pieces[1]);

					while (!sorted(apartment)) {

						if ((currFloor == floors - 1) && inc) {
							inc = false;
						}
						if ((currFloor == 0) && !inc) {
							inc = true;
						}

						if ((currFloor < floors - 1) && inc) {
							dropoff();
							transfer();

							currFloor++;
							visited = false;
						}
						if ((currFloor <= floors) && !inc) {
							dropoff();
							transfer();

							currFloor--;
							visited = false;
						}

					}
					if (answer.get(0) != 0) {
						answer.add(0, 0);
					}
					if (answer.get(answer.size() - 1) != 0) {
						answer.add(answer.size(), 0);
					}

					System.out.println(answer.toString());
				}
			}

		} catch (IOException e) {
			System.out.println("not found");
		}
	}

	public boolean sorted(ArrayList<ArrayList<Integer>> a) {

		if (!liftSpace.isEmpty()) {
			return false;
		}

		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < a.get(i).size(); j++) {
				if (!(a.get(i).get(j) == i) && !a.get(i).isEmpty()) {
					return false;
				}
			}
		}
		return true;
	}

	public void dropoff() {

		for (int i = 0; i < liftSpace.size(); i++) {

			if (liftSpace.get(i) == currFloor) {
				apartment.get(currFloor).add(liftSpace.get(i));
				liftSpace.remove(i);
				i--;
				if (!visited) {
					answer.add(currFloor);
					visited = true;
				}
			}
		}
	}

	public void transfer() {

		for (int i = 0; i < apartment.get(currFloor).size(); i++) {

			if ((apartment.get(currFloor).get(i) < currFloor && !inc)
					|| (apartment.get(currFloor).get(i) > currFloor && inc)) {

				if (liftSpace.size() < capacity) {

					liftSpace.add(apartment.get(currFloor).get(i));
					apartment.get(currFloor).remove(i);

					i--;

				}

				if (!visited) {
					answer.add(currFloor);
					visited = true;
				}
			}
		}
	}


	public static void main(String[] args) {
		new Lift();
	}

}
