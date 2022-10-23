
import java.util.Scanner;

public class upfirstchar {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter a string:");

		String str = input.nextLine();

		String[] arrOfStr = str.split(" ", -1);

		for (int i = 0; i < arrOfStr.length; i++) {
			String currentStr = arrOfStr[i];
			String FirstLetter = Character.toString(currentStr.charAt(0));
			String restofString = currentStr.substring(1);
			FirstLetter = FirstLetter.toUpperCase();
			String wholeString = FirstLetter + restofString;
			arrOfStr[i] = wholeString;
			
		}
		for (int i = 0; i < arrOfStr.length; i++) {

			System.out.print(arrOfStr[i] + " ");
		}
	}
}
