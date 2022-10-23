import java.util.Scanner;

public class InAndM {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter a number in inches ");
		int in = input.nextInt();

		System.out.println("Meters: " + in * 0.0254);
	}
}
