import java.util.Scanner;

public class membArrayApp {
	private static Scanner input;

	public static void main(String[] args) {

		boolean arrBool = false;

		input = new Scanner(System.in);

		System.out.println("Enter a number that is in the array...");

		int value = input.nextInt();

		int[] myArr = new int[] { 12, 3, 4, 5, 56, 23, 5, 23, 5, 5, 25, 3, 63, };

		for (int i = 0; i < myArr.length; i++) {

			if (value == myArr[i]) {
				arrBool = true;
	
			}
		}
		System.out.println(arrBool);
	}
}
