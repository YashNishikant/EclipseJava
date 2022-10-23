package addingarray;

import java.util.Scanner;

public class AddingArrayElements 
	{

		public static void main(String[] args) 
		{
			
			Scanner input = new Scanner (System.in);
			System.out.println("How many numbers do you want to add?");
			int howMany = input.nextInt();
			
			int sum = 0; 
			for(int num = 1; num <= howMany; num++)
			{
				System.out.println("Enter your number");
				int myNum = input.nextInt();
				sum = sum + myNum;
			}
			
			System.out.println("The Awnser is.."+ sum);
		
		input.close();
	}		
	
}