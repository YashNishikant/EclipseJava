import java.io.*;

public class Reducer {
	public Reducer() {
		File f = new File("C:\\Users\\yash0\\eclipse-workspace\\Tasks\\src\\test.txt");

		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
			String temp;
			while ((temp = reader.readLine()) != null) {
				String[] pieces = temp.split("/");
				try {
					int n = Integer.parseInt(pieces[0]);
					int d = Integer.parseInt(pieces[1]);

					System.out.println(result(n, d));

				} catch (NumberFormatException ee) {
					System.out.println(ee);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public int commonDivisor(int n, int d) {
		int finaldivisor = 1, divisor = 1;
		while (divisor <= n || divisor <= d) {
			if (n % divisor == 0 && d % divisor == 0) {
				finaldivisor = divisor;
			}
			divisor++;
		}
		return finaldivisor;
	}

	public String result(int n, int d) {
		
		if((d / commonDivisor(n, d))==1) {
			return ""+n / commonDivisor(n, d);
		}
		
		if((d / commonDivisor(n, d))==0) {
			return "undefined";
		}
		
		if((n / commonDivisor(n, d)) > (d / commonDivisor(n, d))) {
			int num = n/commonDivisor(n, d);
			int den = d / commonDivisor(n, d);
			int whole = (num/den);
			
			return whole + " " + (num - (whole*den)) + "/" + den;
		}
		
		return n / commonDivisor(n, d) + "/" + d / commonDivisor(n, d);
	}
	
	public static void main(String[] args) {
		new Reducer();
	}
}