import java.util.Scanner;

public class upOrDown {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Input first number: ");
		int value = input.nextInt();
		
		System.out.println("Input second number: ");
		int value2 = input.nextInt();
		
		System.out.println("Input third number: ");
		int value3 = input.nextInt();

		if (value < value2 && value2 < value3) {
			System.out.println("Increasing Order");
		} 

		if (value > value2 && value2 > value3) {
			System.out.println("Decreasing Order");
		}

	}
}
