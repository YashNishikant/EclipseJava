package combineArray;

import java.util.Arrays;

public class combarr {

	public static void main(String[] args) {

		int[] myArr = new int[] { 1, 2, 3 };
		int[] myArr2 = new int[] { 4, 5, 6 };

		int arr1 = myArr.length;
		int arr2 = myArr2.length;
		int[] result = new int[arr1 + arr2];

		System.arraycopy(myArr, 0, result, 0, arr1);
		System.arraycopy(myArr2, 0, result, arr1, arr2);

		System.out.println(Arrays.toString(result));
	}
}
