import java.util.Scanner;

public class trueFalseNumbersApp {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		boolean mybool = false;

		System.out.println("Enter in an addent");

		int value = input.nextInt();

		System.out.println("Enter in another addent");

		int value2 = input.nextInt();

		System.out.println("Enter in the sum. We'll find out if it's correct or not...");

		int value3 = input.nextInt();

		if (value3 == value + value2) 
		{
			mybool = true;
		}
		
		System.out.println(mybool);
	}
}
