import java.time.YearMonth;
import java.util.Scanner;

public class dayMonth {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		
		System.out.println("Enter the year: ");
		int value = input.nextInt();
		
		System.out.println("Enter the month number: ");
		int value2 = input.nextInt();
		
		YearMonth yearMonthObject = YearMonth.of(value, value2);
		int daysInMonth = yearMonthObject.lengthOfMonth();

		System.out.println(daysInMonth + " days in this month");
	}
}
