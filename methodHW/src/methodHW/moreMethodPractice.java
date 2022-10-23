package methodHW;

import java.util.Scanner;
public class moreMethodPractice
{
	public static void main(String[]args)
	{
	
		Scanner slopeScan = new Scanner(System.in);
	
		System.out.println("(Name):\n");	
		
		System.out.println(name("Yash", "Nishikant"));


			System.out.println("______________________________________");
	
			System.out.println("\n(Coordinates):\n");
	
			System.out.println("X Coordinate 1: ");
			int xcoord1 = slopeScan.nextInt();

			System.out.println("Y Coordinate 1: ");
			int ycoord1 = slopeScan.nextInt();

			System.out.println("X Coordinate 2: ");
			int xcoord2 = slopeScan.nextInt();

			System.out.println("Y Coordinate 2: ");
			int ycoord2 = slopeScan.nextInt();

			System.out.println ("Slope: " + (slope(xcoord1, xcoord2, ycoord1, ycoord2)));
			
			
			
			
			System.out.println("______________________________________");
			
			System.out.println("\n(Averages):\n");

			System.out.println("First int: ");
			int firstint = slopeScan.nextInt();

			System.out.println("Second int: ");
			int secondint = slopeScan.nextInt();

			System.out.println("Third int: ");
			int thirdint = slopeScan.nextInt();

			System.out.println ("Average: " + (avg(firstint, secondint, thirdint)));
			
			System.out.println("______________________________________");
			
			
			
			
			System.out.println("\n(Trapezoid --> THE HW):\n");
			
			System.out.println("Type length of base 1");
			int b1 = slopeScan.nextInt();
			
			System.out.println("Type length of base 2");
			int b2 = slopeScan.nextInt();
			
			System.out.println("Type length of the height");
			int h = slopeScan.nextInt();
			
			System.out.println("Area of trapezoid: " + 0.5*(b1 + b2)*h);
	}

	public static String name(String FName, String LName)
	{
		return FName + " " + LName;
	}

	public static double slope(int x1, int x2, int y1, int y2)
	{
		return ((double)(y2-y1)/(double)(x2-x1));
	}

	public static double avg(int int1, int int2, int int3)
	{
			return ((int1 + int2 + int3)/3.0);
	}

	public static double trapezoid(int base1, int base2, int height)
	{
			return (0.5*(base1 + base2)*height);
	}
	
}
