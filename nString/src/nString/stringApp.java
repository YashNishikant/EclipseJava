package nString;

import java.util.Scanner;

public class stringApp {
	public static void main(String[] args) {
		int n;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input number: ");
		n = input.nextInt();
		System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);

		input.close();
	}
}
