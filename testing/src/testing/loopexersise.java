package testing;

import java.util.Scanner;

public class loopexersise {

	public static void main(String[] args) {

//START

		int outstandingCounter = 0;

		int satisfactoryCounter = 0;

		int unsatisfactoryCounter = 0;

		int retake = 3;

		System.out.println("How many scores would you like to input?        |Number of retakes: " + retake + "|");

		Scanner reader = new Scanner(System.in);

		int NumberOfScores = reader.nextInt();

//for
		for (int i = 1; i <= NumberOfScores; i++) {

			System.out.println("___________________________________________________________________\nPlease enter Test # " + i);
			int actualScore = reader.nextInt();

//Retake
			if (actualScore < 75) {
				System.out.println("Would you like to retake this? (Y or N)");

				reader.nextLine();
				String RetakeChoice = reader.nextLine();

				// yes
				if (RetakeChoice.equalsIgnoreCase("Y")) {
					
					if(retake > 0) {
					
					retake--;	
						
					System.out.println("Enter in your new score: ");
					int NewScore = reader.nextInt();
					actualScore = NewScore;
					System.out.println("Number of retakes: " + (retake));
					}
					
					else {
					
					System.out.println("Sorry, there are no more retakes.\n___________________________________________________________________");	
						
					}
				}

				// no
				if (RetakeChoice.equalsIgnoreCase("N")) {
					System.out.println("Ok then");
				}

			}
//Outstanding
			if (actualScore >= 90 && actualScore <= 100) {
				outstandingCounter++;
			}

//Satisfactory
			if (actualScore >= 70 && actualScore <= 89) {
				satisfactoryCounter++;
			}

//Unsatisfactory
			if (actualScore >= 1 && actualScore <= 69) {
				unsatisfactoryCounter++;
			}

		}

		System.out.println("Number of outstanding scores: " + outstandingCounter);

		System.out.println("Number of satisfactory scores: " + satisfactoryCounter);

		System.out.println("Number of unsatisfactory scores: " + unsatisfactoryCounter);

	}
}



