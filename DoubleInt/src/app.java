
import java.util.Scanner;

public class app {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter a number:");
		double value = input.nextDouble();

		if ((value == Math.floor(value))) {
			System.out.println("This number is an int");
		}

		else {
			System.out.println("This is a double");
		}
	}
}
