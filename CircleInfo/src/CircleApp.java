import java.util.Scanner;

public class CircleApp {
	private static Scanner input;

	public static void main(String[] args) {

		double Pi = 3.14;
		
		int myInt = 2;
		
		input = new Scanner(System.in);
		
		System.out.println("Radius:");
		
		int value = input.nextInt();
		
		
		System.out.println("Circumference:     ");
		System.out.println(myInt * Pi * value);
		System.out.println("Area:    ");
		System.out.println(Pi * value * value);
	}
}
