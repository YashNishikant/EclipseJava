package ifPractice;

import java.util.Scanner;

public class IfPractice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Type a number");
		int one = scan.nextInt();

		int two = one % 2;

		if (two == 0) {
			System.out.println(one + " is an even number");
		} else {
			System.out.println(one + " is an odd number");
		}

		System.out.println("\n_____________________________\nType two numbers");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();

		if (number1 > number2) {
			System.out.println("\nYour first number: " + number1);
			System.out.println("Your second number: " + number2);

			System.out.println(number1 + " is greater than " + number2);
		}
		if (number2 > number1) {
			System.out.println("\nYour first number: " + number1);
			System.out.println("Your second number: " + number2);

			System.out.println(number2 + " is greater than " + number1);
		}

		if (number1 == number2) {

			System.out.println("\nYour first number: " + number1);
			System.out.println("Your second number: " + number2);

			System.out.println(number2 + " is equal to " + number1);

		}

		System.out.println("\n_____________________________\nType a double");
		double num = scan.nextDouble();
		System.out.println(
				"\nWhat would you like to do with it? \n(a)Add 2 to it \n(s)Subtract 2 from it\n(m)Multiply by 2\n(d)Divide by 2\n(r)Raise to 2nd power");

		scan.nextLine();
		String choice = scan.nextLine();

		if (choice.equalsIgnoreCase("a")) {

			a(num, choice);
			
		}
	
		
		if (choice.equalsIgnoreCase("s")) {

			s(num, choice);

		}

		
		if (choice.equalsIgnoreCase("m")) {

			m(num, choice);

		}

		
		if (choice.equalsIgnoreCase("d")) {

			d(num, choice);

		}

		
		if (choice.equalsIgnoreCase("r")) {

			r(num, choice);

		}
		
		
	}

	public static double a(double num, String choice) {

		System.out.println(num + 2.0);

		return (num + 2);
	}

	public static double s(double num, String choice) {

		System.out.println(num - 2.0);

		return (num - 2);
	}

	public static double m(double num, String choice) {

		System.out.println(num * 2.0);

		return (num * 2);
	}

	public static double d(double num, String choice) {

		System.out.println(num / 2.0);

		return (num / 2);
	}

	public static double r(double num, String choice) {

		System.out.println(num * num);

		return (num * num);
	}

	
}
	
