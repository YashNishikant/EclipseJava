import java.util.Scanner;

public class NewApp {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Greeting: ");
		String line = myScanner.nextLine();

		System.out.println("Hello " + line +"!");
	
		myScanner.close();
	}
}
