import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Command: ");
		String text = input.nextLine();

		switch (text) {
		case "Start":
			System.out.println("Machine Started");
			break;

		case "Stop":
			System.out.println("Machine Stopped");
			break;

		default:
			System.out.println("Machine Error");
		}
	
		input.close();
	}

}
