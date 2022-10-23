import java.util.Scanner;

public class Application {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		
		System.out.println("Enter in something!");
		int value = input.nextInt();
		
		System.out.println("Enter in something!");
		int value2 = input.nextInt();

		System.out.println("You entered: " + value + " and " + value2);
	}
}
