import java.util.Scanner;

public class NewApp {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		
		System.out.println("Enter in a number");
		
		int value = input.nextInt();
		
		System.out.println("Enter another number");
		
		int value2 = input.nextInt();
		 
		System.out.println("Enter another number");
		
		int value3 = input.nextInt();
		
		System.out.println("Enter one more number");
		
		int value4 = input.nextInt();
		
		System.out.println("Sum of all numbers:"); 
		System.out.print(value + value2 + value3 + value4);
	}
}
