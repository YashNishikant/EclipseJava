
package random;

import java.util.Random;

public class rand {
	public static void main(String[] args) {

		Random rand = new Random();

		System.out.println("Ten Random Numbers: ");
		for (int i = 0; i < 10; i++) {
			int rand_int1 = rand.nextInt(1000);
			System.out.println( + rand_int1);
		}
	}
}
