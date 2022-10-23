
import java.util.Scanner;

public class reversenumberApp {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Enter in a string to reverse!");
		int strInput = input.nextInt();

		int input1 = (strInput);

		input1 = input1.reverse();
		System.out.println("The reverse version of what you entered:" + input1);
	}
}
