
import java.util.Scanner;

public class app {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter a few names (more than three): \nSeparate them by commas and no spaces.");

		String str = input.nextLine();

		String[] arrOfStr = str.split(",", -1);

		System.out.println("Now, enter a number and that number will display that name.");
		int i = input.nextInt();

		if (i > arrOfStr.length) {

			System.out.println("There is no " + i + "th element");
			return;
		}

		System.out.println(arrOfStr[i - 1]);
	}
}
