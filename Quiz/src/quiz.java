import java.util.Scanner;
/*  Below each prompt, write a Java command which asatisfies the given conditions */

public class quiz{
	public static void main(String[]args){
		
		
		/* #1 Initialize a new scanner named reader that uses System input  */
		
		Scanner reader = new Scanner(System.in);
		
		/* #2 Write a prompt for name.  Read it with the scanner, then output "Your name is [name]" */
		
		System.out.println("What is your name?");
		String name = reader.nextLine();
		System.out.println("Your name is " + name);
		
		/* #3  Prompt for an integer between 1 - 20, then output the result of raising it to the 4th power  */
		
		System.out.println("Type an int between 1-20");
		int oneToTwenty = reader.nextInt();
		System.out.println("Your number to the 4th power is " + oneToTwenty * oneToTwenty * oneToTwenty * oneToTwenty);
		
		/* #4  Prompt for a double radius value between 0 - 5, and use it to estimate circumference by multiplying by 2 * 3.14 */
		
		System.out.println("Type a double radius between 0-5");
		double radius = reader.nextDouble();
		System.out.println("The circumference is: " + 2 * radius * 3.14);
		
		/* #5  Use the Math class to output a random integer between 10 and 15 (inclusive) */
		
		int randomInt = (int)(Math.random() * 6) + 10;
		System.out.println("Random integer: " + randomInt);
		
		/* #6  Use the Math class to output a random double with 1 digit right of the decimal between 50 and 100 inclusive (e.g. 78.3) */
		
		double randomDouble = (Math.random() * 51) + 50;
		double resultOne = (randomDouble * 10);
		
		int resultTwo = (int)resultOne;
		
		System.out.println((resultTwo/10.0));
		
		//////
		
		
		System.out.println(((int)(((Math.random() * 51) + 50) * 10)/10.0));
		
		////
		
		
		/* #7  Write a few lines of code that uses reader to get three doubles, then output their average        */
		
		System.out.println("Type in three doubles");
		
		double one = reader.nextDouble();
		double two = reader.nextDouble();
		double three = reader.nextDouble();
		
		System.out.println("Average: " + (one + two + three)/3);
		
		/* #8  Write a line that prompts for an integer from 1 - 5 and multiplies by a random integer from 1 - 10. Then output "The product of your selected number [selected] times random [random] is [product]    */

		System.out.println("Type an int from 1-5");
		
		int oneToFive = reader.nextInt();
		int anotherRandomInt= (int)(Math.random() * 10) + 1;
		System.out.println("The product of your selected number " + oneToFive + " times random " + anotherRandomInt + " is " + anotherRandomInt * oneToFive);
		
		/* #9  Prompt for a string asking your school name then output "My school is <school name>"  */

		reader.nextLine();
		
		System.out.println("School name: ");
		String school = reader.nextLine();

		System.out.println("My school is " + school);
		
		/* #10 Use the Math class to output a random double rounded to 1 digit right of the decimal between 50 and 100 inclusive (e.g. 78.3) */
		    
		double roundingDouble = (Math.random() * 51) + 50;
		
		System.out.println((double)((int)(roundingDouble * 10 + 0.5)) / 10);
		
		/* #11  prompt individually for int a, string b, double c, string d, int e and string f. Then input those values and printout a+b+c+d+(d+e)+f to print out 344567.545.617.54345        */

		System.out.println("Imput values to get 344567.545.617.54345 (Enter numbers )");
		
		//
		//
		//
		//
		//
		//
		
		int a = reader.nextInt();
		reader.nextLine();
		String b = reader.nextLine();
		double c = reader.nextDouble();
		reader.nextLine();
		String d = reader.nextLine();
		int e = reader.nextInt();
		reader.nextLine();
		String f = reader.nextLine();
		
		System.out.println(a+b+c+d+(d+e)+f);
		
		/* #12  Use Math class to output a random double with 55 and 100 and round it to hundredths       */

		System.out.println("Random # rounded to hundredths");
		
		double roundingDoubleHundreths = (Math.random() * 46) + 55;
		
		System.out.println((double)((int)(roundingDouble * 100 + 0.5)) / 100);
		
		/* #13  Use Math class to output a random int with 1001 and 2400 and round it to tens*/
		
		System.out.println("Random # rounded to tens");
		
		int roundingIntTenths= (int)(Math.random() * 1400) + 1001;
		System.out.println(((int)(roundingIntTenths / 10 + 0.5)) * 10);
		
		/* #14  Use Math class to output a random int with 99 and 365 */

		int oneMoreRandom = (int)(Math.random() * 267) + 99;
		
		System.out.println(oneMoreRandom);
		
	}
}