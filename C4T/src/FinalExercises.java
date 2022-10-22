import java.util.ArrayList;

public class FinalExercises {
	
	public FinalExercises() {
		grid(4,3);
		System.out.println();
		OccurenceProgram();
		System.out.println();
		System.out.println(palindrome("racecar"));
	}
	
	public void grid(int x, int y) {
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public boolean palindrome(String s) {
		boolean palindrome = true;
		
		if(s.isBlank()) {
			return false;
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				return false;
			}
		}
	
		return true;
	}
	
	public void OccurenceProgram() {
		
		boolean found = false;
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		
		for(int i = 0; i < 30; i++) {
			arrlist.add((int)(Math.random()*29)+7);
		}
		System.out.println(arrlist.toString());
		
		for(int i = 0; i < arrlist.size(); i++) {
			if(arrlist.get(i) == 18) {
				System.out.println("18 found at index " + i);
				found = true;
			}
		}
		if(!found) {
			System.out.println("No occurrence of 18 found");
		}
		
	}
	
	public static void main(String[] args) {
		new FinalExercises();
	}
}
