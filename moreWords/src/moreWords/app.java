package moreWords;

import java.util.Scanner;

public class app {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		// first sentence

		System.out.println("Enter a sentence: ");
		String value = input.nextLine();
		String myStr = value;
		String[] arrOfStr = value.split(" ", -1);
		
		// second sentence

		System.out.println("Enter another sentence: ");
		String value2 = input.nextLine();
		String myStr2 = value2;
		String[] arrOfStr2 = value2.split(" ", -1);
		
		// more words?
	
		if (arrOfStr.length > arrOfStr2.length) {
			System.out.println("String that has most words: " + myStr);
		} else {
			System.out.println("String that has most words: " + myStr2);
		}
	}
}
