import java.util.Scanner;

public class rowNumberIncrease {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter in the number of rows there should be: ");
		int rows = input.nextInt();

		for (int i = 1; i <= rows; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}
			System.out.println("");
		}
	}
}
