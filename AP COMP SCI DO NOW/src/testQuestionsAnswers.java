import java.util.ArrayList;

public class testQuestionsAnswers {
	
	public static void main(String[] args) {
		
		
		// 1 #########################################################################################################
//		
//		int[] arr1 = { 11, 32, 13, 74, 45, 96, 87, 38, 19, 6, 3, 87, 37, 32, 45, 58, 57, 99, 33, 24, 72, 95, 56, 67, 48,
//				34, 29, 18, 13, 14, 36 };
//
//		int count = 0;
//		int amount = 0;
//		for (int i = 0; i < arr1.length; i++) {
//			count++;
//			if (arr1[i] % 2 == 0) {
//				amount += arr1[i];
//			}
//		}
//		System.out.println("Average: " + (double) (amount) / count);
//
//		System.out.println("\n");
		// 2 #########################################################################################################
//
//		int starSize = 10;
//		
//		for (int i = starSize; i >= 1; i--) {
//			for (int j = i; j > 0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		System.out.println("\n");
		// 3 #########################################################################################################
//		int[] arr2 = { 21, 74, 37, 32, 44, 58, 57, 91, 33, 25, 72, 28, 56, 35, 45, 14, 36 };
//
//		int comp = 0;
//
//		for (int i = 0; i < arr2.length; i++) {
//			if (arr2[i] == 45) {
//				System.out.println("Found 45");
//				comp++;
//				break;
//			}
//			comp++;
//		}
//
//		System.out.println("Comparisons " + comp);
//
//		System.out.println("\n");
		// 4 #########################################################################################################

		int n = 3;
		int x = n;
		int y = n;
		int[][] twoArr = new int[x+1][y+1];
		for (int i = 1; i <= y; i++) {
			for (int j = 1; j <= x; j++) {
				twoArr[i][j] = i * j;
				System.out.print(twoArr[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("\n");
		
		// 5 #########################################################################################################
//
//        int n = 10;
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//
//        arr.add(1);
//        arr.add(1);
//        for(int i = 0; i <= n; i++) {
//            if(i >= 2) {
//                arr.add(arr.get(i-2) + arr.get(i-1));
//            }
//            System.out.print(arr.get(i) + " ");
//        }
//
//		System.out.println("\n");
		// 6 #########################################################################################################
//
//		int[] arr3 = { 33, 25, 21, 54, 20, 48, 44, 17, 16, 60, 42, 2, 38, 50, 7, 10, 2, 8, 35, 3, 7, 40 };
//
//		for(int i = 0; i < arr3.length; i++) {
//			if(arr3[i] % 5 == 0) {
//				arr3[i] = 0;
//			}
//			System.out.print(arr3[i] + " ");
//		}
//		
//		System.out.println("\n");
//		// 7 #########################################################################################################
//
//		int factorial = 10;
//		int result = 1;
//		for(int i = 1; i <= factorial; i++) {
//			result *= i;
//		}
//		System.out.println(result);
	}
}
