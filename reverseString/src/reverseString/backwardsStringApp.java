
package reverseString;

import java.util.Scanner;

public class backwardsStringApp {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Enter in a string to reverse!");
		String strInput = input.nextLine();

		StringBuilder input1 = new StringBuilder(strInput);

		input1 = input1.reverse();
		System.out.println("The reverse version of what you entered:" + input1);
	}
}
