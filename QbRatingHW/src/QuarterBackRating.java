
public class QuarterBackRating {

	public static void main(String[] args) {

		//HW NOTE: These numbers are for Tom Brady. They were changed for the other players too.
		
		int Completions = 402;
		int Attempts = 624;
		int Yards = 4770;
		int Touchdowns = 36;
		int Interceptions = 7;

		double a = (((Completions / (double) Attempts) * 100) - 30) / 20;
		double b = ((Touchdowns / (double) Attempts) * 100) / 5;
		double c = (9.5 - ((Interceptions / (double) Attempts) * 100)) / 4;
		double d = ((Yards / (double) Attempts) - 3) / 4;

		System.out.print("QB rating: " + (a + b + c + d) / .06);

	}
}
