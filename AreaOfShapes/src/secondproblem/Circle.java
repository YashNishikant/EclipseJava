package secondproblem;

import java.util.Scanner;

public class Circle {

	public static void main(String []args) {

		
		Scanner input = new Scanner (System.in);
		String text ="Circle";
		
		switch (text) { 
		
		case "Circle": 
				System.out.println("Enter the radius of the circle. It will be squared and multiplied by pi to give you your answer.");
			double RadCirSq = input.nextDouble();
			
			
			double areaCir = RadCirSq * RadCirSq * 3.14;
			
			System.out.println("The area of the circle is (about)... " + areaCir);
				break;
		}
			input.close();
		
	}
}










































