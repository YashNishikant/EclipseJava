import java.util.Scanner;

public class classwork {

	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(j);
			}
			if (i % 2 != 0) {
				System.out.print("@");
			}
			System.out.println();
		}

		System.out.println("\n\n");
		int computernumber = (int) (Math.random() * 25) + 1;
		int attempts = 0;
		String status = "not even close";
		Scanner scan = new Scanner(System.in);
		System.out.println("Guess the number: ");

		int guessNumber = scan.nextInt();

		while (guessNumber != computernumber) {

			if (Math.abs(guessNumber - computernumber) <= 5) {
				status = "but you were within 5 of the number";
			}

			if (Math.abs(guessNumber - computernumber) <= 10 && Math.abs(guessNumber - computernumber) > 5) {
				status = "but you were within 10 of the number";
			}

			if (Math.abs(guessNumber - computernumber) > 10) {
				status = "you weren't close to the number";
			}

			System.out.println("Incorrect, try again, " + status + ":");
			guessNumber = scan.nextInt();
			attempts++;
		}

		if (guessNumber == computernumber) {
			attempts++;
			System.out.println("Congratulations, you guessed it!");
			System.out.println("Number of attempts: " + attempts);
			attempts = 0;
		}

	}
}
