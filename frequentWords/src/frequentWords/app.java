package frequentWords;

import java.util.ArrayList;
import java.util.Scanner;

public class app {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter a sentence: ");
		String value = input.nextLine();

		String[] splitStr = value.split(",", -1);
		ArrayList<String> myArrL = new ArrayList<String>();

		for (int i = 0; i < splitStr.length; i++) {

			if (myArrL.contains(splitStr[i]) == false) {
				myArrL.add(splitStr[i]);

			} 
		}
	System.out.println(myArrL);
	System.out.println("There are " + myArrL.size() + " unique words.");
	}
}
