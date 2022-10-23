package greatestNumber;

import java.util.Scanner;

public class biggestnum {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter a number:");
		int value = input.nextInt();
		
		System.out.println("Enter a different number:");
		int value2 = input.nextInt();
		
		System.out.println("Enter one more number:");
		int value3 = input.nextInt();
		
		int[] myArr = new int[] { value, value2, value3, };

		int largest = myArr[0];

		for (int i = 0; i < myArr.length; i++) {

			if (myArr[i] > largest) {
				largest = myArr[i];
			}
		}
		System.out.println("The largest number is: " + largest);
	}
}
