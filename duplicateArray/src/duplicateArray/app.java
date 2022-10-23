package duplicateArray;

import java.util.ArrayList;
import java.util.Scanner;

public class app {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter letters: ");
		String value = input.nextLine();

		String[] splitStr = value.split(",", -1);
		ArrayList<String> myArrL = new ArrayList<String>();

		for (int i = 0; i < splitStr.length; i++) {

			if (myArrL.contains(splitStr[i]) == false) {
				myArrL.add(splitStr[i]);
			}
			
			else {
				System.out.println("Duplicate");
				return;
			}
		}
	System.out.println("Unique");
	}
}
