package number;

import java.util.Scanner;
public class numbers{

public static void main(String[]args){

int smallestNum = 0;
int largestNum = 0;

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter a number (You will enter 3)");
	int num1 = scan.nextInt();
	System.out.println("Enter another number");
	int num2 = scan.nextInt();
	System.out.println("Enter one more number");
	int num3 = scan.nextInt();

	System.out.println("\n\nPick an operation \n(1)Add\n(2)Average\n(3)Product\n(4)Difference");
	int operation = scan.nextInt();

	
	switch(operation) {

	case 1 : System.out.println("Add all 3 numbers -> Answer: " + (num1 + num2 + num3));
	break;

	case 2 : System.out.println("Average all 3 numbers -> Answer: " + ((double)(num1 + num2 + num3)/3));
	break;

	case 3 : 
	
	//Smallest
		if(num1 <= num2 && num1 <= num3){
			smallestNum = num1;
		}
		if(num2 <= num1 && num2 <= num3){
			smallestNum = num2;
		}
		if(num3 <= num2 && num3 <= num1){
			smallestNum = num3;
		}

	//Largest
		if(num1 >= num2 && num1 >= num3){
			largestNum = num1;
		}
		if(num2 >= num1 && num2 >= num3){
			largestNum = num2;
		}
		if(num3 >= num2 && num3 >= num1){
			largestNum = num3;
		}
		System.out.println("Multiply the smallest and largest number -> Answer: " + (smallestNum * largestNum));
	break;

	case 4 : 
	
	//Smallest
		if(num1 <= num2 && num1 <= num3){
			smallestNum = num1;
		}
		if(num2 <= num1 && num2 <= num3){
			smallestNum = num2;
		}
		if(num3 <= num2 && num3 <= num1){
			smallestNum = num3;
		}

	//Largest
		if(num1 >= num2 && num1 >= num3){
			largestNum = num1;
		}
		if(num2 >= num1 && num2 >= num3){
			largestNum = num2;
		}
		if(num3 >= num2 && num3 >= num1){
			largestNum = num3;
		}
		System.out.println("Subtract the smallest from the largest number -> Answer: " + (largestNum - smallestNum));
	break;

	default : System.out.println("Can't be this number...");
	}


	}

}




