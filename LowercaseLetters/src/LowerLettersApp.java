import java.util.Scanner;
public class LowerLettersApp {	
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter a string...");
		
		String value = myScanner.nextLine();
		
		//String result;
		//result = value.toLowerCase();

		System.out.println(value.toLowerCase());
		myScanner.close();
	}
}
