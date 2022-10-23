
import java.util.Scanner;

public class app {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		String value = input.nextLine();

		String[] myArr = new String[] { value };
		int result = Integer.parseInt(value);
		String[] arrOfStr = value.split(" ", -1); 
		
		System.out.println("Enter a number: ");
		String value2 = input.nextLine();

		String[] myArr2 = new String[] { value2 };
		int result2 = Integer.parseInt(value2);
		String[] arrOfStr2 = value2.split(" ", -1); 
	}
}