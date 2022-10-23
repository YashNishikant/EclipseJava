
public class DoNow {

	public static void main(String[] args) {
		double sum = 0;
		int x = 0;

		for (int i = 2; i < 101; i += 2) {
			sum += i;
		}
		System.out.println(sum / 50);

		System.out.println("\n\n");
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("\n\n");
		for (int i = 1; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(j);
			}
			if (i % 2 == 0) {
				System.out.println();
			} else {
				System.out.println("*");
			}
		}

		System.out.println("\n\n");
		for (int i = 0; i < 15; i++) {
			x = (int) (Math.random() * 15) + 1;
			for (int j = 0; j < x; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("\n\n");
		int track = 1;
		int temp = 1;

		for (int i = 1; i < 5; i++) {

			for (int j = 1; j < (track * 2); j *= 2) {
				if (i == 1) {
					j = 1;
					System.out.println(j);
				}
				System.out.print(j + " ");
			}

			for (int j = (track * 2); j > 0; j /= 2) {
				System.out.print(j + " ");
			}

			System.out.println();
			track *= 2;
		}


		System.out.println("\n\n");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < (i-1)/2; j++) {
				System.out.print("*");
			}
			System.out.println(i/2);
		}

		System.out.println("\n\n");
		int number = 0;
		int additions = 0;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(number+ ", ");
				additions++; 
				number += additions;
			}
			System.out.println();
			additions = 0;
			number = 10;
		}
		
		System.out.println("\n\n");
		for(int i = 81284; i > 0; i-=20020) {
			
			if(i != 1204) {
				System.out.println(i);
			}
			else {
				System.out.print(0 + "" + i);
			}
		}
		
		System.out.println("\n\n");
		
		
//		for (int i = 6; i > 0; i--) {
//			if (i % 2 == 0) {
//				for (int j = 1; j < i; j += 2) {
//					System.out.print(j);
//				}
//				System.out.println("&");
//			}
//			if (i % 2 != 0) {
//				for (int j = 2; j < i; j += 2) {
//					System.out.print(j);
//				}
//				System.out.println("*");
//			}
//		}
//

//		
//		
//		
//		for (int i = 1; i < 6; i++) {
//			for (int j = 1; j < i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//
//		System.out.println("\n\n");
//
//		for (int i = 0; i < 3; i++) {
//			for (int j = 1; j < 5; j++) {
//				System.out.print(i + j);
//			}
//			System.out.println();
//		}
//
//		System.out.println("\n\n");
//
//		int y = 10;
//
//		System.out.println("DO NOW");
//
//		for (int i = 0; i < 4; i++) {
//			for (int j = 7; j < y; j++) {
//				System.out.print(j);
//			}
//			System.out.print("*\n");
//			y--;
//		}
//
//		System.out.println("\n\n");
//
//		int x = 0;
//
//		for (int i = 5; i < 10; i++) {
//			for (int j = x; j < 10; j++) {
//				System.out.print(j);
//			}
//			System.out.println(":" + x);
//			x += 2;
//		}
//
//		// DICE
//		int a = (int) (Math.random() * 6) + 1;
//		int b = (int) (Math.random() * 6) + 1;
//
//		System.out.println("\nDICE 1: " + a);
//		System.out.println("DICE 2: " + b);
//
//		System.out.println("SUM: " + (a + b));
//		System.out.println("PRODUCT: " + (a * b));
//
//		System.out.println("DIFFERENCE: " + Math.abs((a - b)));
//
//		// DICE GAME
//
//		System.out.println("\n\n");
//
//		// PLAYER1
//		int c = (int) (Math.random() * 6) + 1;
//		int d = (int) (Math.random() * 6) + 1;
//		// PLAYER2
//		int c2 = (int) (Math.random() * 6) + 1;
//		int d2 = (int) (Math.random() * 6) + 1;
//
//		int player1points = 0;
//		int player2points = 0;
//
//		while (player1points < 20 && player2points < 20) {
//
//			c = (int) (Math.random() * 6) + 1;
//			d = (int) (Math.random() * 6) + 1;
//
//			c2 = (int) (Math.random() * 6) + 1;
//			d2 = (int) (Math.random() * 6) + 1;
//
//			if ((c > c2) && (d > d2)) {
//				player1points += 3;
//				announcePoints(1, player1points, player2points);
//			}
//
//			if ((c < c2) && (d < d2)) {
//				player2points += 3;
//				announcePoints(2, player1points, player2points);
//			}
//
//			if (c > (d + d2)) {
//				player1points += 6;
//				announcePoints(1, player1points, player2points);
//			}
//
//			if (d > (c + c2)) {
//				player2points += 6;
//				announcePoints(2, player1points, player2points);
//			}
//
//			if ((c2 > d) && (c2 > d2)) {
//				player1points += 1;
//				announcePoints(1, player1points, player2points);
//			}
//
//			if ((d2 > c) && (d2 > c2)) {
//				player2points += 1;
//				announcePoints(2, player1points, player2points);
//			}
//
//			if (player1points >= 20 && player2points < 20) {
//				System.out.println("PLAYER 1 WINS");
//			}
//
//			if (player2points >= 20 && player1points < 20) {
//				System.out.println("PLAYER 2 WINS");
//			}
//
//			if (player2points >= 20 && player1points >= 20) {
//				System.out.println("IT'S A TIE");
//			}
//
//		}
//	}
//
//	public static void announcePoints(int x, int player1, int player2) {
//		if (x == 1) {
//			System.out.println("Player 1 has " + player1 + " points!");
//		}
//
//		if (x == 2) {
//			System.out.println("Player 2 has " + player2 + " points!");
//		}

	}

}
