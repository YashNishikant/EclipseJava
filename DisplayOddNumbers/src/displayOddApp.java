
public class displayOddApp {
	public static void main(String[] args) {

		int start = 1;
		int end = 100;

		for (int value = start; value < end; value++) {

			if (value % 2 != 0) 
			{
				System.out.println(value);
			}

		}

	}

}
