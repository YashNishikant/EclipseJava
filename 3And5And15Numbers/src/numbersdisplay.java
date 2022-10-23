public class numbersdisplay {
	public static void main(String[] args) {

		int start = 1;
		int end = 100;

		System.out.println("Numbers divisible by 3:");

		for (int value = start; value < end; value++) {
			if (value % 3 == 0) {
				System.out.print(value + ",");
			}
		}

		System.out.println("\nNumbers divisible by 5:");

		for (int value2 = start; value2 < end; value2++) {
			if (value2 % 5 == 0) {
				System.out.print(value2 + ",");
			}
		}

		System.out.println("\nNumbers divisible by 3 and 5:");

		for (int value3 = start; value3 < end; value3++) {
			if ((value3 % 3) == 0 & (value3 % 5) == 0) {
				System.out.print(value3 + ",");
			}
		}
	}
}

