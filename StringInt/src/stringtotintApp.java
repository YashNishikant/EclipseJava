import java.util.Scanner;

public class stringtotintApp {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Enter in a number...");
		String number = input.next();
		int result = Integer.parseInt(number);
		System.out.println("String version of the int: " + result);

	}
}
