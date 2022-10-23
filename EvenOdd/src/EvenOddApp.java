import java.util.Scanner;

public class EvenOddApp {

public static void main(String[] args) {

		int x;
		System.out.println("Enter an integer: ");
		Scanner input = new Scanner (System.in);
		x = input.nextInt();
		
		if ((x % 2 == 0)) 
	    {
	        System.out.println("Even");
	    }
	    else
	    {
	        System.out.println("Odd");
	    } 
		
		input.close();
	}
	
}
