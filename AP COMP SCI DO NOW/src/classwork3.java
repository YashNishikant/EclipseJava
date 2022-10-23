
public class classwork3 {

	public static void main(String[] args) {

		System.out.println("_________________________________________________________\n(1)");

		int[] array = new int[40];
		int random = (int) (Math.random() * 100) + 1;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			random = (int) (Math.random() * 100) + 1;
			array[i] = random;
			sum += array[i];
			System.out.print(array[i] + " ");

			if (array[i] > max) {
				max = array[i];
			}

			if (array[i] < min) {
				min = array[i];
			}

			if (i == 19) {
				System.out.println();
			}
		}

		System.out.println("\n\nSum: " + sum);
		System.out.println("Minimum Value: " + min);
		System.out.println("Maximum Value: " + max);

		System.out.println("\nREVERSED: ");
		int temp = 0;
		int j = (array.length - 1);
		boolean newLine = true;
		for (int i = 0; i < array.length; i++) {

			temp = array[i];
			array[i] = array[j];
			array[j] = temp;

			if (i >= 19) {

				if (newLine) {
					System.out.println();
					newLine = false;
				}

				System.out.print(array[j] + " ");
			} else {
				System.out.print(array[i] + " ");
			}
			j--;
		}

		System.out.println("\n_________________________________________________________\n(2)");

		int[][] array2 = new int[10][10];
		int sumColumn = 0;
		int sumRow = 0;
		int min2 = Integer.MAX_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for (int i = 0; i < array2.length; i++) {
			for (int k = 0; k < array2.length; k++) {

				array2[i][k] = (int) (Math.random() * 41) + 10;
				
				if(array2[i][k] > max2) {
					max2 = array2[i][k];
				}
				
				if(array2[i][k] < min2) {
					min2 = array2[i][k];
				}
				
				System.out.print(array2[i][k] + " ");
			}
			System.out.println();
		}

		System.out.println("\n");
		int min3 = Integer.MAX_VALUE;
		int max3 = Integer.MIN_VALUE;
		for (int i = 0; i < array2.length; i++) {
			for (int k = 0; k < array2.length; k++) {
				sumColumn += array2[k][i];
				sumRow += array2[i][k];
			}
			System.out.println("Sum of column " + (i + 1) + ": " + sumColumn);
			sumColumn = 0;
			System.out.println("Sum of row " + (i + 1) + ": " + sumRow);
			sumRow = 0;
			
		}
		System.out.println("\nMaximum: " + max2);
		System.out.println("Minimum " + min2);
	}
}
