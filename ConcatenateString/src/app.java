import java.util.Scanner;

public class app {
	private static Scanner input;
	public static void main(String[] args) {
	
		input = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String str = input.nextLine();

		System.out.println("Enter another string:");
		String str2 = input.nextLine();
	
		System.out.println(str2 + str);
	}
}
