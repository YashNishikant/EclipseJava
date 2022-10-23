import java.util.Scanner;

public class addnumApp {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int value = input.nextInt();

		System.out.println("Enter another number: ");
		int value2 = input.nextInt();

		
		
		for (int i = 0; i < value2; i++) {
			value++;
			
		}
		System.out.println(value);
	}
}
