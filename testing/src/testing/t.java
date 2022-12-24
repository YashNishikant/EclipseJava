
package testing;
import java.util.ArrayList;

public class t {

	public t() {
		System.out.println(twicelin(20));
	}
	
	int twicelin(int n){

	    ArrayList<Integer> u = new ArrayList<>();
	    u.add(1);
	   
	    int a = 0;
	    
	    while (u.size() <= n + 1) {
	        int x = 2 * u.get(a) + 1;
	        int y = 3 * u.get(a) + 1;

	        sort(u);
	        
	        System.out.println(2 + " * " + u.get(a) + " + " + 1);
	        
	        a++;
	        
	        u.add(x);
	        u.add(y);
	    }


        System.out.println(u);
	    return u.get(n);
	    
	}
	
	void sort(ArrayList<Integer> u) {
		
        for (int i = 0; i < u.size(); i++)
        {
            int min_idx = i;
            for (int j = i+1; j < u.size(); j++)
                if (u.get(j) < u.get(min_idx))
                    min_idx = j;

            int temp = u.get(min_idx);
            u.set(min_idx, u.get(i));
            u.set(i, temp);
            
        }
		
	}
	
	public static void main(String[] args) {
		new t();
	}
	
}
