import java.util.Scanner;

public class application {
	private static Scanner input;

	public static void main(String[] args) {

		boolean bool = false;

		input = new Scanner(System.in);

		System.out.println("Enter a string...");
		String myStr = input.nextLine();

		System.out.println("Enter another string...");
		String myStr2 = input.nextLine();

		if (myStr.equals(myStr2)) {
			bool = true;
			System.out.println(bool);
		} else {
			bool = false;
			System.out.println(bool);
		}

	}
}
