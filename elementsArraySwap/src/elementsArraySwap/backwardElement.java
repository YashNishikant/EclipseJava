package elementsArraySwap;

public class backwardElement {
	public static void main(String[] args) {

		int[] myArr = new int[] { 12, 3, 4, 5, 56, 23, 5, 23, 5, 5, 25, 3, 63 };

		int myInt = myArr[0];

		System.out.println("My Array");
		for (int i = 0; i < myArr.length; i++) {
			System.out.print(myArr[i] + ", ");
		}

		myArr[0] = myArr[myArr.length - 1];

		System.out.println("\nPut last in first");

		for (int i = 0; i < myArr.length; i++) {
			System.out.print(myArr[i] + ", ");
		}

		System.out.println("\nPut first to last");

		myArr[myArr.length - 1] = myInt;

		for (int i = 0; i < myArr.length; i++) {
			System.out.print(myArr[i] + ", ");
		}
	}
}
