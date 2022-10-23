package compSciPhysicsHW;

import java.util.Scanner;

public class CompSciPhysicsHW {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out
				.println("Choose the conversion: (F)Force, (V)Volume, (D)Distance. (Type the corresponding character)");
		String choice = scan.nextLine();

		// THIS IS
		// FORCE________________________________________________________________________________________________________

		if (choice.equalsIgnoreCase("F")) {
			System.out.println("(1)Pounds to Newtons, or (2)Newtons to Pounds?");
			int choice2 = scan.nextInt();

			if (choice2 == 1) {
				System.out.println("Pounds to Newtons - Enter your value in pounds:");
				double dataP = scan.nextDouble();

				double resultN = dataP * 4.45;
				System.out.println("Your result in newtons: " + resultN);
			}

			else if (choice2 == 2) {

				System.out.println("Newtons to Pounds - Enter your value in Newtons:");
				double dataN = scan.nextDouble();

				double resultP = dataN / 4.45;
				System.out.println("Your result in pounds: " + resultP);
			}
			
			else {
			System.out.println("Invalid choice");			
			}
			
		}

		// THIS IS
		// VOLUME________________________________________________________________________________________________________

		else if (choice.equalsIgnoreCase("V")) {
			System.out.println("(1)Galons to Liters, or (2)Liters to Galons?");
			int choice3 = scan.nextInt();

			if (choice3 == 1) {
				System.out.println("Galons to Liters - Enter your value in galons:");
				double dataG = scan.nextDouble();

				double resultL = dataG * 3.79;
				System.out.println("Your result in liters: " + resultL);
			}

			else if (choice3 == 2) {

				System.out.println("Liters to Galons - Enter your value in liters:");
				double dataL = scan.nextDouble();

				double resultG = dataL / 3.79;
				System.out.println("Your result in galons: " + resultG);
			}
		
			else {
				System.out.println("Invalid choice");	
				}
			
		}

		// THIS IS
		// DISTANCE________________________________________________________________________________________________________

		else if (choice.equalsIgnoreCase("D")) {
			System.out.println("(1)Meters to Feet, or (2)Feet to Meters?");
			int choice4 = scan.nextInt();

			if (choice4 == 1) {
				System.out.println("Meters to Feet - Enter your value in meters:");
				double dataM = scan.nextDouble();

				double resultF = dataM * 3.28;
				System.out.println("Your result in feet: " + resultF);
			}

			else if (choice4 == 2) {

				System.out.println("Feet to Meters - Enter your value in feet:");
				double dataF = scan.nextDouble();

				double resultM = dataF / 3.28;
				System.out.println("Your result in meters: " + resultM);
			}

			else {
				System.out.println("Invalid choice");	
				}
		
		}

		else {
			System.out.println("Invalid Character");
		}
	}

}
