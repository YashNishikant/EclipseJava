import java.util.Stack;

public class Stacks {

	public Stacks() {
		
		int dec = 17;
		int i = 0;
		
		Stack<Integer> s = new Stack<Integer>();
		
		while(dec > 0) {
			int rem = dec % 2;
			dec /= 2;
			s.push(rem);
			i++;
		}
		for(int j = 0; j < i; j++) {
			System.out.print(s.pop());
		}
	}
	
	public static void main(String[] args) {
		new Stacks();
	}
	
}
