import java.util.Scanner;

public class cbNumb {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter a value:");
		int value = input.nextInt();

		for (int i = 0; i <= value; i++) {
			System.out.println("Number is: " + i + " and cube of " + i + " is " + (i * i * i));
		}
	}
}
