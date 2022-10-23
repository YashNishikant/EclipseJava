package array;

import java.util.Scanner;
public class ArrayWS{

	public static void main(String[]args){
		
	//1	
	
	System.out.print("Program Example 1:\nRandom Numbers: ");
	int arr[] = new int[6];
	
	for(int i = 0; i < 6; i++) {

		arr[i] = (int)(Math.random()*20) + 1;
		
		if(i < 5) {
		System.out.print(arr[i] + ", ");			
		}
		
		if(i == 5) {
		System.out.print(arr[i]);			
		}

		}
	System.out.println();
	seperate();
	
	//2
	
	String arrString[] = new String[6];
	Scanner read = new Scanner(System.in); 
	
	System.out.println("\nProgram Example 2:\nEnter six names:");
	for(int i = 0; i < 6; i++) {	
		String names = read.nextLine();
	
		arrString[i] = names;
	}
	
	System.out.println("The names entered: "); 
	
	for(int i = 0; i < arrString.length; i++) {

		System.out.print(arrString[i] + " ");

		}
	System.out.println();
	seperate();
	
	//3

	int largest = 0;
	int smallest = 0;
	int sum = 0;
	
	int arrayRandom[] = new int[5];

	System.out.println("\nProgram Example 3:\n");
	
	for(int i = 0; i < 5; i++) {
		
		arrayRandom[i] = (int)(Math.random()*100) + 1;
		System.out.println("Random number " + (i+1) + ": " + arrayRandom[i]);
		sum += arrayRandom[i];	
		
		if(i == 0) {
		smallest = arrayRandom[0];
		largest = arrayRandom[0];
		}
		
		if(smallest > arrayRandom[i]) {
			
			smallest = arrayRandom[i];
				
		}

		if(largest < arrayRandom[i]) {
			
		largest = arrayRandom[i];	
			
		}
		
		
	}
		System.out.println("\nTotal sum of all random numbers: " + sum);
		System.out.println("Smallest number: " + smallest);
		System.out.println("Largest number: " + largest);
		
		seperate();
	
	}

public static void seperate() {
	
System.out.println("______________________________________________________________");	
	
}
	
	
}
