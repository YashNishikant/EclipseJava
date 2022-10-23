import java.util.Scanner;

public class UpDownApp {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter in a number: ");
		int value = input.nextInt();

		System.out.println("Enter in another number: ");
		int value2 = input.nextInt();

		System.out.println("Enter in one more number: ");
		int value3 = input.nextInt();

		int[] myArr = new int[] { value, value2, value3 };

		for (int i = 0; i < myArr.length; i++) {

			if (value + value2 == value3) {
				System.out.println("o");
			}
		}
	}
}
