import java.util.Scanner;

public class AreaApp {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		
		System.out.println("Enter in a height");
		
		int value = input.nextInt();
		
		System.out.println("Enter in a width");
		
		int value2 = input.nextInt();
		 
		System.out.println("Area: ");
		System.out.println(value * value2);
		System.out.println("Perimeter: ");
		System.out.println((value * 2)+(value2 * 2));
	}
}
