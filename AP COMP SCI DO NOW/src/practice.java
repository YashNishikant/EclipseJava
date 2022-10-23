
public class practice {

	public practice() {
		System.out.println(4*pi(1));
	}
	public static void main(String[]args) {
	
		practice app = new practice();
		
	}	

	public double pi(double n) {
		
		if(n > 10000) {
			return 0;
		}
		return -pi(n+2) + 1/n;
	}
	
}
