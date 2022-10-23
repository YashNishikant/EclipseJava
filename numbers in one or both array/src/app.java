
import java.util.Scanner;

public class app {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter in comma separated numbers:");
		String value = input.nextLine();
		String[] arrOfStr = value.split(",", -1);

		System.out.println("Enter another line of comma separated numbers:");
		String value2 = input.nextLine();
		String[] arrOfStr2 = value2.split(",", -1);

		for (int i = 0; i < arrOfStr2.length; i++) {
			// get each element from the second array
			boolean bFound = false;
			for (int j = 0; j < arrOfStr.length; j++) {

				// check it with each element of first array
				if (arrOfStr2[i].contains(arrOfStr[j])) {
					// found it so we are safe
					bFound = true;
					break;

				}
			}
			if (bFound == false) {
				System.out.println("False");
				return;
			}
		}
	System.out.println("True");
	}
}
