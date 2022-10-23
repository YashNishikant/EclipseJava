import java.util.Scanner;

public class lcmNumb {
	private static Scanner input;

	public static void main(String[] args) {

		int myInt = 1;

		input = new Scanner(System.in);

		// user input
		System.out.println("Enter a number: ");
		int lcm1 = input.nextInt();

		System.out.println("Enter another number: ");
		int lcm2 = input.nextInt();

		/*
		 * while (true) { int mult = largest * myInt;
		 * 
		 * if (mult % smallest == 0) { // found multiple of smallest and largest //this
		 * is our LCM. print out and exit System.out.println("The lcm is: " + mult);
		 * 
		 * break; } //we haven't found lcm yet. So increment myInt to check for next
		 * multiple myInt++;
		 */

		while (true) {

			if (myInt % lcm1 == 0 && myInt % lcm2== 0) {
				System.out.println("The LCM of the two numbers are: " + myInt);
				break;
			}
			myInt++;		
		}
	}
}
