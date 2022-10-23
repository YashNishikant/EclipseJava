
import java.util.Scanner;

public class df {
	private static Scanner input;

	public static void main(String[] args) {

		char oldchar = 'd';
		char newchar = 'c';

		input = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str = input.nextLine();

		StringBuilder word = new StringBuilder(str);

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == oldchar) {
				// found a
				// now replace
				word.setCharAt(i, newchar);
			}

		}
		System.out.println(word);
	}
}
