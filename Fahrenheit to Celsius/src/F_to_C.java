import java.util.Scanner;

public class F_to_C {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter a degree in Fahrenheit: ");
		int fah = input.nextInt();
		
		System.out.print("Degrees in Celsius: ");
		System.out.print((fah - 32) * 0.555555556);
	}
}
