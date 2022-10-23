import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class age {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		// Day you were born:
		
		System.out.println("Enter the year you were born: ");
		int value1 = input.nextInt();
		System.out.println("Enter the month you were born: ");
		int value2 = input.nextInt();
		System.out.println("Enter the day you were born: ");
		int value3 = input.nextInt();
		// Checks date and calculates your age
		
		LocalDate start = LocalDate.of(value1, value2, value3);
		LocalDate end = LocalDate.of(LocalDateTime.now().getYear(), LocalDateTime.now().getMonth(),
		LocalDateTime.now().getDayOfMonth());
		long years = ChronoUnit.YEARS.between(start, end);
		System.out.println("You are " + years + " years old.");
		
		// Is it your BDay today?
		if (LocalDateTime.now().getMonth().ordinal() + 1 == value2 && LocalDateTime.now().getDayOfMonth() == value3) {
			System.out.println("Happy Birthday, WOO!");
		}
	}
}
