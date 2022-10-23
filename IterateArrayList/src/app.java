import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		String saveStr = "";
		
		while (true) {

			System.out.println("Enter names here (Type END to quit): ");
			String myStr = input.nextLine();

			if (myStr.equals("END")) {
				break;
			}
			
			if (myStr.equals("")) {
				myStr = saveStr;
			}

			else {
				saveStr = saveStr + " " + myStr;
			}
			
			List<String> myList = new ArrayList<String>();

			myList.add(saveStr);

		}
		System.out.println(saveStr);
	}
}
