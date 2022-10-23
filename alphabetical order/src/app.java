
import java.util.Scanner;

public class app {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		String currentName;

		String names = "";

		System.out.println("Enter in all the names you want. Enter END to quit");
		
		while (true) {

			currentName = input.nextLine();

			if (currentName.equals("END")) {
				break;
			}

			if (names.equals("")) {
				names = currentName;
			}

			else {
				names = names + "," + currentName;
			}

		}

		String[] ArrNames = names.split(",", -1);
		
		System.out.println("Here is your names in alphabetical order: " + names);

	}
}
