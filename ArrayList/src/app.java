import java.util.ArrayList;

public class app {
	public static void main(String[] args) {

		ArrayList<String> myArrL = new ArrayList<String>();	
		
		System.out.println("Size of myArrL: " + myArrL.size());
	
		 myArrL.add("A");
	     myArrL.add("B");
	     myArrL.add("C");
	     myArrL.add("D");
	     myArrL.add("E");
	     myArrL.add("F");
	
	     System.out.println("Size of myArrL after additions: " + myArrL.size());
	     System.out.println("What myArrL has: " + myArrL);
	
	     myArrL.remove("E");
	     myArrL.remove("F");
	
	     System.out.println("Size of myArrL after removing F and E: " + myArrL.size());
	     System.out.println("After removing F and E from myArrL: " + myArrL);
	
	     //New array for family names
	     
	     ArrayList<String> myArrL2 = new ArrayList<String>();	
	     
	     myArrL2.add("Yash, Neha, Nishikant, Supriya");
	     
	     System.out.println("Family names: " + myArrL2);
	}
}
