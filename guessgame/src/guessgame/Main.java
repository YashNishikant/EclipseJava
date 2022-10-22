package guessgame;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		boolean gameEnd = false;
		boolean foundchar = false;
		boolean alreadyGuessed = false;

		Scanner reader = new Scanner(System.in);
		int randomNumber = (int) (Math.random() * 9) + 0;

		String[] words = { "trash", "foyar", "shown", "month", "comma", "allow", "shall", "chant", "slump", "spill" };
		ArrayList<String> guessedchars = new ArrayList();

		String selectedWord = words[randomNumber];
		selectedWord = "trash";
		int stringLength = selectedWord.length();


		for (int i = 0; i < stringLength; i++) {
			System.out.print("_ ");
		}
		
		System.out.println();
		System.out.println("Word Size: " + stringLength);

		while (!gameEnd) {

			alreadyGuessed = false;
			System.out.println("Enter A Guess:");
			String a = reader.nextLine();
			
			for (int i = 0; i < guessedchars.size(); i++) {
				if (a.equals(guessedchars.get(i))) {
					System.out.println("Letter already guessed, guess a new letter.");
					alreadyGuessed = true;
				}
			}
			if (alreadyGuessed) {
				System.out.print("##################\n");
				continue;
			}

				guessedchars.add(a);

				for (int i = 0; i < selectedWord.length(); i++) {
					foundchar = false;
					for (int j = 0; j < guessedchars.size(); j++) {
						if (guessedchars.get(j).equals(selectedWord.substring(i, i + 1))) {
							System.out.print(guessedchars.get(j));
							foundchar = true;
						}
					}

					if (!foundchar) {
						System.out.print("_ ");
					}
				}
				System.out.print("\n##################\n");
		}
	}

}