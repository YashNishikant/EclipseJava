import java.util.Scanner;

public class app {
	private static Scanner input;

	public static void main(String[] args) {

		int myInt = 0;

		input = new Scanner(System.in);

		System.out.println("Enter a number:");
		String value = input.nextLine();

		for (int i = 0; i < value.length(); i++) {

			if (Character.isDigit(value.charAt(i))) {
				myInt = myInt + Integer.parseInt(Character.toString(value.charAt(i)));

			}

		}
		System.out.println("Sum of digits: " + myInt);
	}
}
