
public class spinners {

	public spinners() {
		System.out.print("First ");
		if (spin(2) % 2 == 0) {
			EvenSpinner();
		} else {
			OddSpinner();
		}
	}

	public static void main(String[] args) {
		spinners Spinner = new spinners();
	}
	
	public void OddSpinner() {
		int spinner5_1;
		int spinner5_2;
		int spinner5_3;
		int spinner10;
		int maximum = Integer.MIN_VALUE;
		int max2 = 0;
		int remaining = 0;
		divider();
		spinner5_1 = spin(5);
		spinner5_2 = spin(5);
		spinner5_3 = spin(5);
		spinner10 = spin(10);
		divider();

		if (spinner5_1 > maximum) {
			maximum = spinner5_1;

			if (spinner5_2 > spinner5_3) {
				remaining = spinner5_3;
				max2 = spinner5_2;
			}
			if (spinner5_3 > spinner5_2) {
				remaining = spinner5_2;
				max2 = spinner5_3;
			}
			if (spinner5_3 == spinner5_2) {
				remaining = spinner5_3;
				max2 = spinner5_2;
			}
		}
		
		if (spinner5_2 > maximum) {
			maximum = spinner5_2;

			if (spinner5_1 > spinner5_3) {
				remaining = spinner5_3;
				max2 = spinner5_1;
			}
			if (spinner5_3 > spinner5_1) {
				remaining = spinner5_1;
				max2 = spinner5_3;
			}
			if (spinner5_3 == spinner5_1) {
				remaining = spinner5_1;
				max2 = spinner5_1;
			}
		}

		if (spinner5_3 > maximum) {
			maximum = spinner5_3;

			if (spinner5_1 > spinner5_2) {
				remaining = spinner5_2;
				max2 = spinner5_1;
			}
			if (spinner5_2 > spinner5_1) {
				remaining = spinner5_1;
				max2 = spinner5_2;
			}
			if (spinner5_2 == spinner5_1) {
				remaining = spinner5_2;
				max2 = spinner5_1;
			}
		}
		if ((maximum * max2) >= (remaining * spinner10)) {
			System.out.println((maximum + " * " + max2) + " >= " + (remaining * spinner10) + "\nYOU WIN!");
		} else {
			System.out.println((maximum + " * " + max2) + " < " + (remaining * spinner10) + "\nYOU LOSE!");
		}
	}

	public void EvenSpinner() {

		int spinner4_1;
		int spinner4_2;
		int spinner5_1;
		int spinner5_2;

		int lowest4 = 0;
		int lowest5 = 0;
		int comparison5;

		divider();
		spinner4_1 = spin(4);
		spinner4_2 = spin(4);
		spinner5_1 = spin(5);
		spinner5_2 = spin(5);
		divider();

		if (spinner4_1 > spinner4_2) {
			lowest4 = spinner4_2;
		} else {
			lowest4 = spinner4_1;
		}

		if (spinner5_1 > spinner5_2) {
			lowest5 = spinner5_2;
			comparison5 = spinner5_1;
		} else {
			lowest5 = spinner5_1;
			comparison5 = spinner5_2;
		}

		System.out.println("Lowest Number 4 Section Spinner: " + lowest4);
		System.out.println("Lowest Number 5 Section Spinner: " + lowest5);
		divider();

		if ((lowest5 * lowest4) >= (comparison5 * comparison5)) {
			System.out.println(lowest5 + " * " + lowest4 + " >= " + (comparison5 * comparison5) + "\nYOU WIN!");
		} else {
			System.out.println(lowest5 + " * " + lowest4 + " < " + (comparison5 * comparison5) + "\nYOU LOSE!");
		}

	}

	public void divider() {
		System.out.println("_________________________________");
	}

	public int spin(int x) {
		int result = randomNumber(1, x);
		System.out.println("Spinner: " + result);
		return result;
	}

	public int randomNumber(int a, int b) {
		int x = (int) ((Math.random() * (b - a + 1)) + a);
		return x;
	}
}
