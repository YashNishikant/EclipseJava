
import java.util.Scanner;

public class roundApp {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter a number:");
		double value = input.nextDouble();

		System.out.println("Enter another number:");
		double value2 = input.nextDouble();

		double value3 = value / value2;

		System.out.println("Quotient of both numbers: " + value3);

		System.out.println("Rounded to the nearest int: " + Math.round(value3));
	}
}
