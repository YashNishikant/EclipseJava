package testing;

import java.util.TreeSet;
import java.util.Set;

public class t4 {

	public t4() {

		int[] lst = new int[] {107, 158, 204, 100, 118, 123, 126, 110, 116, 100};
		System.out.println(sumOfDivided(lst));

	}

	public static String sumOfDivided(int[] l) {
		String ans = "";
		Set<Integer> s = new TreeSet<Integer>();
		for (int i = 0; i < l.length; i++) {
			int val = l[i];
			if (val < 0)
				val *= -1;

			int div = 2;

			while (val > 1) {

				if (val % div == 0) {
					s.add(div);
					val /= div;
				} else {
					div++;
				}
			}

		}

		for (int i : s) {
			int sum = 0;
			for (int j = 0; j < l.length; j++) {
				if (l[j] % i == 0) {
					sum += l[j];
				}
			}
			ans += "(" + i + " " + sum + ")";
		}

		return ans;
	}

	public static void main(String[] args) {
		new t4();
	}

}
