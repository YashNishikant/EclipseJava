package firstproblem;

	import java.util.Scanner;
	
	public class FirstProblem {

	public static void main (String []args) {

	Scanner input = new Scanner (System.in);
	String text ="";
		
	System.out.println("What is your shape?");
	text = input.nextLine();
		
	
	switch (text) { 
	
	case "Rectangle": 
			System.out.println("Enter the length of the rectangle");
		double lengthRect = input.nextDouble();
		
		System.out.println("Enter the width of the rectangle");
		double widthRect = input.nextDouble();
		
		double areaRect = lengthRect * widthRect;
		
		System.out.println("The area of the rectangle is... " + areaRect);
			break;
	
	
	case "Triangle":
			System.out.println("Enter the length of the triangle");
		double length = input.nextDouble();
		
		System.out.println("Enter the width of the triangle");
		double width = input.nextDouble();

		double area = length * width * 1/2;
		
		System.out.println("The area of the triangle is... " + area);
			
			break;
	
	
	
	default:
		System.out.println("That Is An Invalid Shape");
		break;
		}		
		input.close();
	}
}