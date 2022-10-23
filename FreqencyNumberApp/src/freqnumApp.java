import java.util.Scanner;

public class freqnumApp {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter a number that is in the array...");

		int value = input.nextInt();

		int value2 = 0;

		int[] myArr = new int[] { 12, 3, 4, 5, 56, 23, 5, 23, 5, 5, 25, 3, 63, };

		for (int i = 0; i < myArr.length; i++) {
			if (value == myArr[i]) {
				value2++;
			}
		}

		if (value2 == 0) {
			System.out.println("This number is not in the array...");
		} else {
			System.out.println("Frequency of your number in this array: " + value2 + " Times");
		}
	}
}
