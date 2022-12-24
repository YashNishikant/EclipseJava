
package testing;

import java.util.TreeSet;

public class t2 {

	public t2() {
		System.out.println(twicelin(20));
	}
	
	int twicelin(int n){
		TreeSet<Integer> u = new TreeSet<>();
	    u.add(1);
		for(int i = 0; i < n; i++) {
			u.add(2 * u.first() + 1);
			u.add(3 * u.first() + 1);
			u.remove(u.first());
		}
		return u.first();
	}
	
	public static void main(String[] args) {
		new t2();
	}
	
}
