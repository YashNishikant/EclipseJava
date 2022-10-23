import java.util.Scanner;

public class xNumb {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("\nEnter a value (Enter 0 to quit):");
		int myInt = input.nextInt();

		while (myInt != 0) {

			System.out.println("How many multiples do you want?");
			int mult = input.nextInt();

			System.out.println("First " + mult + " multiples of " + myInt + ": ");

			for (int i = 1; i <= mult; i++) {

				if (i < mult) {
					System.out.print(myInt * i + ", ");
				} else {
					System.out.print(myInt * i);
				}
			}

			System.out.println("\nEnter a value (Enter 0 to quit):");
			myInt = input.nextInt();
		}

		System.out.println("Bye Bye");
	}
}
