import java.util.Scanner;

public class classwork4 {

	public static void main(String[] args) {

//		String s = "I can't get no satisfaction";
//
//		int count = 0;
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
//				count++;
//			}
//		}
//		System.out.println(count);
//		while (s.indexOf(' ') >= 0) {
//			int i = s.indexOf(' ');
//			s = s.substring(0, (i)) + s.substring(i + 1);
//		}
//
//		System.out.println(s);
//		s = s.replace('s', 'z');
//		System.out.println(s);
//
//		for (int i = 0; i < s.length() - 1; i += 2) {
//			s = s.substring(0, i) + s.substring(i, i + 1).toUpperCase() + s.substring(i + 1);
//		}
//		System.out.println(s + "\n\n\n\n");

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a string");
//		String string = scan.nextLine();
//
//		String temp = "";
//		System.out.print("REVERSED: ");
//		for (int i = string.length(); i > 0; i--) {
//			
//			System.out.print(string.substring(i-1,i));
//		}
//		
//		System.out.println("\n\nEnter another string");
//		String string2 = scan.nextLine();
//
//		for (int i = 0; i < string2.length(); i++) {
//
//			if (string2.charAt(i) == 'a' || string2.charAt(i) == 'A') {
//				string2 = string2.replace(string2.charAt(i), (char) ((char) (Math.random() * 42) + 80));
//			}
//			if (string2.charAt(i) == 'e' || string2.charAt(i) == 'E') {
//				string2 = string2.replace(string2.charAt(i), (char) ((char) (Math.random() * 42) + 80));
//			}
//			if (string2.charAt(i) == 'i' || string2.charAt(i) == 'I') {
//				string2 = string2.replace(string2.charAt(i), (char) ((char) (Math.random() * 42) + 80));
//			}
//			if (string2.charAt(i) == 'o' || string2.charAt(i) == 'O') {
//				string2 = string2.replace(string2.charAt(i), (char) ((char) (Math.random() * 42) + 80));
//			}
//			if (string2.charAt(i) == 'u' || string2.charAt(i) == 'U') {
//				string2 = string2.replace(string2.charAt(i), (char) ((char) (Math.random() * 42) + 80));
//			}
//		}
//		System.out.println(string2);

		int count = 0;
		String str = "c";

		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equalsIgnoreCase("c") && i < str.length()) {
				if (str.substring(i+1, i + 2).equalsIgnoreCase("o") && (i+2) < str.length()) {
					if (str.substring(i+3, i + 4).equalsIgnoreCase("e") && (i+4) < str.length()) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
