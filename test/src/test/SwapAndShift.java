package test;

//A Java Program to illustrate Caesar Cipher Decryption Technique
public class SwapAndShift {

	public static void main(String[] args) {

		System.out.println("\nMulti-Step Subsitution:");

		String plainText = "Computer science class taught me how to encrypt messages. Obviously now, you can read it. Congratulations, you decrypted this sentence.";
		System.out.println("Starting    : " + plainText);

		String cipherText = encrypt(plainText, 14);
		System.out.println("After Shift1: " + cipherText);

		String cipherTextEveryOther = encryptEveryOther(cipherText, 7);
		System.out.println("After Shift2: " + cipherTextEveryOther);

		String swappedText = swapChars(cipherTextEveryOther, 'e', 'a');
		swappedText = swapChars(swappedText, 'i', 'u');
		System.out.println("After Swaps : " + swappedText);

		System.out.println("\nDECRYPT     : " + swappedText);
		String swappedTextD = swapChars(swappedText, 'a', 'e');
		swappedTextD = swapChars(swappedTextD, 'u', 'i');
		System.out.println("After Swaps : " + swappedTextD);

		String cipherTextEveryOtherDECRYPT = encryptEveryOther(swappedTextD, -7);
		System.out.println("After Shift2: " + cipherTextEveryOtherDECRYPT);

		String cipherTextOG = encrypt(cipherTextEveryOtherDECRYPT, -14);
		System.out.println("After Shift1: " + cipherTextOG);

	}

	public static String swapChars(String text, char a, char b) {
		char aU = Character.toLowerCase(a);
		char bU = Character.toLowerCase(b);
		text = text.replace(aU, '|');
		text = text.replace(bU, aU);
		text = text.replace('|', bU);
		return text;
	}

	public static String encrypt(String text, int s) {
		String result = "";
		char c;
		int charInt;
		if (s < 0)
			s = 26 + s;

		for (int i = 0; i < text.length(); i++) {
			c = text.charAt(i);
			charInt = (int) c;
			if (Character.isUpperCase(c)) {
				/*
				 * NOTE THE CODE BELOW COULD HAVE BEEN DONE IN LESS LINES BUT STRETCHED INTO 5
				 * LINES TO SHOW ALL STEPS
				 */
				charInt = (charInt + s); // add a shift of s
				charInt = (charInt - 65) % 26; // get the number of chars beyond 65, if beyond end of alphabet (26
												// chars) restart from 0
				charInt += 65; // move this many characters beyond A (represented by 65)
				char ch = (char) charInt; // cast the int back to a char
				result += ch; // append the char to the result String
			} else if (Character.isLowerCase(c)) {
				// You write the code to handle lowercase. Copy and modify code used for
				// uppercase
				charInt = (charInt + s); // add a shift of s
				charInt = (charInt - 97) % 26; // get the number of chars beyond 65, if beyond end of alphabet (26
												// chars) restart from 0
				charInt += 97; // move this many characters beyond A (represented by 65)
				char ch = (char) charInt; // cast the int back to a char
				result += ch; // append the char to the result String

			} else {
				result += c;
			}
		}
		return result;
	}

	public static String encryptEveryOther(String text, int s) {
		String result = "";
		char c;
		int charInt;
		if (s < 0)
			s = 26 + s;

		for (int i = 0; i < text.length(); i++) {
			c = text.charAt(i);
			charInt = (int) c;

			if (i % 2 == 0) {
				if (c == ' ') {
					result += c;
				}
				if (c == '.') {
					result += c;
				}
				
				if (Character.isUpperCase(c)) {
					/*
					 * NOTE THE CODE BELOW COULD HAVE BEEN DONE IN LESS LINES BUT STRETCHED INTO 5
					 * LINES TO SHOW ALL STEPS
					 */
					charInt = (charInt + s); // add a shift of s
					charInt = (charInt - 65) % 26; // get the number of chars beyond 65, if beyond end of alphabet (26
													// chars) restart from 0
					charInt += 65; // move this many characters beyond A (represented by 65)
					char ch = (char) charInt; // cast the int back to a char
					result += ch; // append the char to the result String
				} else if (Character.isLowerCase(c)) {
					// You write the code to handle lowercase. Copy and modify code used for
					// uppercase
					charInt = (charInt + s); // add a shift of s
					charInt = (charInt - 97) % 26; // get the number of chars beyond 65, if beyond end of alphabet (26
													// chars) restart from 0
					charInt += 97; // move this many characters beyond A (represented by 65)
					char ch = (char) charInt; // cast the int back to a char
					result += ch; // append the char to the result String

				}
			} else {
				result += c;
			}
		}
		return result;
	}

}
