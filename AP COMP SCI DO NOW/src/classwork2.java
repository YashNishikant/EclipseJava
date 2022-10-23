
public class classwork2 {

	public static void main(String[] args) {

		int arrayDimension = 4;
		int limit = 8;
		int randomNumber = 2;
		int x[][] = new int[arrayDimension][arrayDimension];
		int one = 0;
		int two = 0;
		int random = (int) (Math.random() * randomNumber) + 1;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				random = (int) (Math.random() * randomNumber) + 1;

				if (random == 1) {
					one++;
				} else if (random == 2) {
					two++;
				}

				if (random == 1 && one == limit) {
					random = 2;
					x[i][j] = random;
				} else if (random == 2 && two == limit) {
					random = 1;
					x[i][j] = random;
				}

				x[i][j] = random;
				System.out.print(x[i][j] + " ");

			}
			System.out.println();
		}

//				int range = 9;
//				int box = 6;
//				int times = 4;
//				int[][] x = new int[box][box];
//				int[] count = new int[range];
//				for (int r = 0; r < x.length; r ++) {
//					for (int c = 0; c < x[r].length; c ++){
//						boolean done = false;
//						do{
//							int t = (int)(Math.random()*range) + 1;
//							if (count[t-1] < times) {
//								x[r][c] = t;
//								count[t-1] ++ ;
//								done = true;
//							}
//						} while (!done);
//						System.out.print(x[r][c]+"\t");
//					}
//					System.out.println();
//				}
//			
//		

	}
}
