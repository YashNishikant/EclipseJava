import java.util.Scanner;

public class plusminusApp {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter a number:");
		int value = input.nextInt();
		
		if (value > 0) {
			System.out.println("Number is positive");
		}
	
		else {
			System.out.println("Number is negative");
		}
	}
}
