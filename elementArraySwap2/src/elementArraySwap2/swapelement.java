
package elementArraySwap2;

public class swapelement {
	public static void main(String[] args) {

		int myvar = 0;

		int[] myArr = new int[] { 1, 2, 3 };
		int[] myArr2 = new int[] { 0, 0, 0 };

		for (int i = myArr.length - 1; i >= 0; i--) {

			myArr2[myvar] = myArr[i];
			myvar++;

		}
		for (int i = 0; i < myArr2.length; i++) {

			if (i == myArr2.length - 1) {
				System.out.print(myArr2[i]);

			}
			else {
				System.out.print(myArr2[i] + ", ");
			}
		}
	}
}
