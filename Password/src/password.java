import java.util.Scanner;

public class password {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		// Introduction

		System.out.println("Enter in your password " + "\nREQUIREMENTS: "
				+ "\nPassword must have at least ten characters." + "\nPassword consists of letters and digits."
				+ "\nPassword must contain at least 1 upper case letter.");
		String value = input.nextLine();

		// Requirements

		// 10 char

		if (value.length() >= 10) {

		} else {
			System.out.println("Password does not meet the requirements. Less than 10 characters.");
			return;
		}

		boolean isUppercase = false;

		// At least one upper case
		for (int i = 0; i < value.length(); i++) {
			if (Character.isUpperCase(value.charAt(i))) {
				isUppercase = true;
				break;
			}
		}

		if (isUppercase == false) {
			System.out.println("Password does not meet the requirements. Does not have at least one upper case letter.");
			return;
		}

		// at least one number

		boolean num = false;

		for (int i = 0; i < value.length(); i++) {
			if (Character.isDigit(i))
				num = true;
		}
		
		if (num == false) {
			System.out.println("Password does not meet the requirements. Does not have at least one number.");
			return;
		}
		
		// at least one letter

				boolean letter = false;

				for (int i = 0; i < value.length(); i++) {
					if (Character.isLetter(i))
						letter = true;
				}
				
				if (letter == false) {
					System.out.println("Password does not meet the requirements. Does not have at least one number.");
					return;
				}
		
		// all requirements met
		System.out.println("Password correct");
	}
}
