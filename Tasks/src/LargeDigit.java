import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class LargeDigit {

	public LargeDigit() {

		BigInteger ba;
		BigInteger ex;
		
		File file = new File("C:\\Users\\yash0\\eclipse-workspace\\Tasks\\src\\LargeNumberPracticeSet.txt");

		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String temp;
			while ((temp = reader.readLine()) != null) {
				
				String[] pieces = temp.split(" ");

				ba = new BigInteger(pieces[0]);
				ex = new BigInteger(pieces[1]);

				if (ba.equals(new BigInteger("0"))) {
					System.out.println(0);
					continue;
				}

				if (ex.equals(new BigInteger("0"))) {
					System.out.println(1);
					continue;
				}

				System.out.println(result(ba, ex));
			}

		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public BigInteger result(BigInteger ba, BigInteger ex) {
		int n1 = lastDigit(ba).intValue();
		int n2 = lastDigit(ex).intValue();
		double pow = Math.pow(n1, n2);
		
		BigInteger result = new BigInteger(""+(int)pow);
		
		return lastDigit(result);
		
	}

	
	public BigInteger lastDigit(BigInteger x) {

		BigInteger step1 = x.divide(new BigInteger("10"));
		BigInteger step2 = step1.multiply(new BigInteger("10"));
		BigInteger step3 = x.subtract(step2);

		return step3;
	}

	public static void main(String[] args) {
		new LargeDigit();
	}

}
