package stringTasks;

public class string {

	// This sets the string to a value that will not change so it can be used
	// repeatedly
	final static String orig = "The five boxing wizards jump quickly";

	public static void main(String[] args) {

		// 1
		System.out.println("#1 Backwards void:");
		backwards1(orig); // calls void method to print

		// 2
		System.out.println("\n#2 Backwards String: " + "\n" + backwards2(orig));

		// 3
		System.out.println("\n#3 Capital String: " + "\n" + capitalize(orig));

		// 4
		System.out.println("\n#4 Replace Vowel String: " + "\n" + replaceVowels(orig));

		// 5
		System.out.println("\n#5 Every Other String: " + "\n" + everyOther(orig));

		// 6
		System.out.println("\n#6 Word Count String: " + "\n" + wordCount(orig) + " words");

		// 7
		System.out.println("\n#7 Character count String: " + "\n" + charCount(orig));

		// 8
		System.out.println("\n#8 Backwards String: " + "\n" + backWords(orig));

	}

	// _______________________________________________________________
	public static void backwards1(String str) {

		String newStr = ""; //blank string that will be filled in soon
		for (int i = str.length() - 1; i >= 0; i--) { //loop that runs through the string, but it runs through it backwards

			char current = str.charAt(i); // current stores the current character 

			newStr += current; //each character, (starting with the end) adds to empty string

		}
		System.out.println(newStr); //print filled in string
	}

	// _______________________________________________________________
	public static String backwards2(String str) {
		String newStr = ""; //blank string
		for (int i = str.length() - 1; i >= 0; i--) { //loop runs through string backwards
			char current = str.charAt(i); //character stores current character it is on
			newStr += current; //each character, (starting with the end) adds to empty string
		}

		return newStr; //instead of printing, it returns the string value
	}

	// _______________________________________________________________
	public static String capitalize(String str) {
		str = str.toUpperCase();// just capitalizes the string as a whole

		return str; //returns string 

	}

	// _______________________________________________________________
	public static String replaceVowels(String str) {
		String newStrW = ""; //blank string
		
		for (int i = 0; i < str.length(); i++) { //runs through string
			char current = str.charAt(i); //stores character it is currently on in loop

			if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') { //if that character is one of these characters, (a, e, i, o, u)
				newStrW += "W"; // if it's those characters, add a W in that blank string 
			} else {
				newStrW += current; //if not, just add whatever letter comes next in the string
			}
		}

		return newStrW; //return new string 
	}

	// _______________________________________________________________
	public static String everyOther(String str) { 
		String strDeleted = ""; //new blank string
		for (int i = 0; i < str.length(); i++) { //loop runs though string
			char current = str.charAt(i); //stores current character

			if (i % 2 == 0) { //if "i" is an even number, (meaning if it is on every other character) 
				strDeleted += ""; //then replace it with nothing. Basically delete it that character
			} else {
				strDeleted += current; //if it is on the other characters, just add that letter in the blank string 
			}
		}
		return strDeleted; //return string
	}

	// _______________________________________________________________
	public static int wordCount(String str) {
		int wordCount = 1; //int to start counting words. Start with one since the method needs spaces to count words. There is no space after the last word, so it won't count it. If we start from one, we count that last word too.

		for (int i = 0; i < str.length(); i++) { //loop runs through string
			char currentLetter = str.charAt(i); //stores current character

			if (currentLetter == ' ') { //if there is a space
				wordCount++; //count that as a word
			}
		}

		return (wordCount); //return amount of words
	}

	// _______________________________________________________________
	public static double charCount(String str) {
		double answer = 0; //we need this for later (the answer to this problem)
		int words = 1; //int to start counting words. Again, we should start with one since this method can't count the last word.
		int characters = 0; //amount of characters

		for (int i = 0; i < str.length(); i++) { //loop through string
			char currentLetter = str.charAt(i);//store current character

			if (currentLetter == ' ') {//if there is a space
				words++; //count that as a word (the word before will be counted)
			} else {
				characters++;//if there is no space, count that as a character in a word, and add that to the character variable
			}

			answer = ((double) (characters) / words);//calculate average characters per word

		}

		return answer; //return value
	}

	public static String backWords(String str) {
		String[] arr = str.split(" "); //store each word in an array. Finds words to store by splitting the words by the space
		String newstr = ""; //blank string to fill in later

		for (int i = arr.length - 1; i >= 0; i--) { //loop through the array full of the words, but backwards 
			newstr += (arr[i] + " "); //blank string will be filled with each word, starting with the last one. Add spaces in between to make the backwards sentence.
		}
		return newstr; //return value
	}
}
