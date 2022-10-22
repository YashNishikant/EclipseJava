package ttt;

public class c {

	public c() {
		NumberPattern2();
	}

	public static void main(String[] args) {
		new c();
	}

	public void NumberPattern2() {
		int n = 1;
		int midnum = 1;
		int x = 0;

		for (int i = 0; i < 5; i++) {
			n = 1;
			for (int j = 0; j < i+x; j++) {
				midnum = (int) Math.pow(2, ((i+x)/2));
				System.out.print(n + " ");
				
				if(n < midnum && (j < (i+x)/2)) {
					n *= 2;
				}
				else {
					n /= 2;
				}

			}
			x++;
			System.out.println(n);
		}
	}

}
