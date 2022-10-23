import java.util.Scanner;

public class absoluteval {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		while (true) {
			
			System.out.print("Enter a number: ");
			System.out.println("(Enter 0 to exit)");
			int value = input.nextInt();
			
			if(value == 0) {
				System.out.println("Bye!");
					break;	
				}
			
			int myInt = Math.abs(value);

			System.out.println("Absolute value: " + myInt);

			
		}
	}
}
