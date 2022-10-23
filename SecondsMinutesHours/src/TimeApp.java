import java.util.Scanner;

public class TimeApp {

	public static void main(String[] args)

	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter in the number of seconds: ");
		int sec = in.nextInt();
		
		int hours = (sec / 3600);
		int minutes = (sec % 3600) / 60;
	    int seconds = (sec % 3600) % 60;
		
	    System.out.println("Hours: " + hours);
	    System.out.println("Minutes: " + minutes);
	    System.out.println("Seconds: " + seconds);
	    in.close();
	}
}
