import java.util.Scanner;

public class digitsNumberApp {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter a number that is less than 10 billion: ");
		int value = input.nextInt();

		int lengthValue = (int) (Math.log10(value) + 1);

		System.out.println("Number of digits in the number: " + lengthValue + " digits");
		
		String strval = Integer.toString(value);
		System.out.println("Number of digits: " + strval.length());
	}
}
