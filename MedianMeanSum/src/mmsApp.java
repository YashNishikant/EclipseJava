
public class mmsApp {

	public static void main(String[] args) {

		int sum1 = 0;

		int[] intArr = new int[] { 32, 35, 4, 5, 563, 45, 56, 234, 5, 2, 5, 234, 56, 25, 38, 63, 6 };

		for (int i = 0; i < intArr.length; i++) {
			sum1 += intArr[i];
		}

		System.out.println("The sum of the numbers in this array is: " + sum1);
		System.out.println("The mean of the numbers in this array is: " + (sum1 / 17.0));
	}

}
