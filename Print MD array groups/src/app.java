import java.util.Scanner;

public class app {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Enter: ");
		int value = input.nextInt();

		int[][] grid = {

				// a
				{ 1, 2, 3, 4 },
				// b
				{ 4, 23, 56, 9 },
				// c
				{ 34, 5, 1, 7 }

		};

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {

				if (value == grid[i][j]) {

					System.out.println("Found it in row: " + (i + 1));
					return;

				}
			}
		}
		System.out.println("Didn't find it...");
	}
}
