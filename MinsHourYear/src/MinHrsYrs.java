import java.util.Scanner;

public class MinHrsYrs {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter in the number of minutes: ");
		int min = in.nextInt();

		int years = (min / 525600);
		int hours = (min % 525600) / 60;
		int minutes = (min % 525600) % 60;
	
		System.out.println("Years: " + years);
		System.out.println("Hours: " + hours);
		System.out.println("Mins: " + minutes);
		
		in.close();
	}
}
