package testing;

import java.util.PriorityQueue;

public class t3 {

	public t3() {

		String input = "6 7 4 3 5 1 2 9 8";
		String[] temp = input.split(" ");
		String res = "";
		
		PriorityQueue<word> wordqueue = new PriorityQueue<word>();
		
		for(int i = 0; i < temp.length; i++) {
			wordqueue.add(new word(temp[i]));
		}

		int n = wordqueue.size();
		for(int i = 0; i < n; i++) {
			res += wordqueue.poll().getWord() + " ";
		}
		res = res.trim();
		
		//System.out.println(res);
		
	}
	
	public static void main(String[] args) {
		new t3();
	}
	
}

class word implements Comparable<word>{
	
	private int index;
	private String word;
	
	public word(String s) {
	
		word = s;
		
		for(int i = 0; i < s.length(); i++) {
			if((int)(s.charAt(i)) >= 48 && (int)(s.charAt(i)) <= 57) {
				index = Integer.parseInt(""+s.charAt(i));
			}
		}
	}
	
	public String getWord() {
		return word;
	}
	
	public int getIndex() {
		return index;
	}

	@Override
	public int compareTo(word o) {
		return new Integer(o.getIndex()).compareTo(index)*-1;
	}
	
}