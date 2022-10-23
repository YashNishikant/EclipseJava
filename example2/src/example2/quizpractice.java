
package example2;

	import java.util.Scanner;
	public class quizpractice {

		public static void main (String[]Args){

		int x = 0;
		int y = 0;

		int a = 1;

		Scanner read = new Scanner(System.in);

			while(a == 1) {

			System.out.println("Enter a positive integer from 1 - 1000");
			int integer = read.nextInt();
			
			for(int i = 1; i <= integer; i++) {
			
				if((double)(integer)/i == i) {
					
				y++;
					
				}
				
			}
			
			while(integer < 1 || integer > 1000) {

			System.out.println("This is invalid, enter another one:");
			int integer2 = read.nextInt();
			integer = integer2;
			
			if(integer >= 1 || integer <= 1000) {
			
				for(int i = 1; i <= integer; i++) {
				
				if((double)(integer)/i == i) {
					
				y++;

				}
				
			}
			
			}
			}
			x++;
			System.out.println("Would you like to enter another number? (Y or N)");
			read.nextLine();

			String ans = read.nextLine();

			if(ans.equalsIgnoreCase("N")) {
			a++;
			}

			}
			
			System.out.println("____________________\nYou entered " + x + " valid numbers");
			System.out.println("You entered " + y + " perfect squares\n\n");

		}

	}


