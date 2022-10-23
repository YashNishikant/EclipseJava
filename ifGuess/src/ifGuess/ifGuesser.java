package ifGuess;

import java.util.Scanner;

public class ifGuesser {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(
				"Guess from: Diamond ore, Emerald ore, Gold ingot, Coal, Lever, Wood Plank, Door, Stone Stairs.\n\n\n\n");

		System.out.println("Can your item be placed down? (Y)es or (N)o");
		String ANS1 = scan.nextLine();

		if (ANS1.equalsIgnoreCase("N")) {

			System.out.println("Is your item an ore?");

			String ANS2 = scan.nextLine();

			if (ANS2.equalsIgnoreCase("N")) {
				System.out.println("That's impossible");
			}

			if (ANS2.equalsIgnoreCase("Y")) {

				System.out.println("Can this ore be crafted into armor?");
				String ANS3 = scan.nextLine();

				if (ANS3.equalsIgnoreCase("N")) {

					System.out.println("Is this ore green?");
					String ANS4 = scan.nextLine();

					if (ANS4.equalsIgnoreCase("Y")) {

						System.out.println("ANSWER: EMERALD ORE");

					}

					if (ANS4.equalsIgnoreCase("N")) {

						System.out.println("ANSWER: COAL");

					}
				}
					if (ANS3.equalsIgnoreCase("Y")) {

						System.out.println("Is the ore yellow?");
						String ANS5 = scan.nextLine();

						if (ANS5.equalsIgnoreCase("Y")) {
							System.out.println("ANSWER: GOLD INGOT");
						}

						if (ANS5.equalsIgnoreCase("N")) {
							System.out.println("ANSWER: DIAMOND ORE");
						}

					}

				}
			
		}
			if (ANS1.equalsIgnoreCase("Y")) {

				System.out.println("Is your item a block? (Doors and Levers are blocks)");
				String ANS6 = scan.nextLine();

				if (ANS6.equalsIgnoreCase("N")) {

					System.out.println("That's impossible");

				}

				if (ANS6.equalsIgnoreCase("Y")) {

					System.out.println("Is your item an interactive item?");

					String ANS7 = scan.nextLine();

					if (ANS7.equalsIgnoreCase("N")) {

						System.out.println("Is this made out of wood?");
						String ANS8 = scan.nextLine();

						if (ANS8.equalsIgnoreCase("Y"))

							System.out.println("ANSWER: WOOD PLANK");

						if (ANS8.equalsIgnoreCase("N"))
							System.out.println("ANSWER: STONE STAIRS");
					}

					if (ANS7.equalsIgnoreCase("Y")) {

						System.out.println("Can this item send a signal through redstone?");
						String ANS8 = scan.nextLine();

						if (ANS8.equalsIgnoreCase("N")) {
							System.out.println("ANSWER: DOOR");

						}

						if (ANS8.equalsIgnoreCase("Y")) {
							System.out.println("ANSWER: LEVER");

						}

					}

				}

			}

		}

	}

