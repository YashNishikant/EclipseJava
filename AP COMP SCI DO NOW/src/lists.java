import java.util.ArrayList;

public class lists {

	public lists() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int random = (int)(Math.random()*101)+1;
		for(int i = 0; i < 40; i++) {
			list.add(random);
			random = (int)(Math.random()*101)+1;
		}
		System.out.println(list);
		divide();
	
		int first = list.get(0);
		list.remove(0);
		list.add(list.size(), first);
		
		System.out.println(list);
		divide();
	
		for(int i = 0; i < list.size(); i++) {

			if(list.get(i) % 2 == 0) {
				list.remove(i);
				i--;
			}
		}
	
		System.out.println(list);
		divide();
		
		for(int i = list.size()-1; i > 0; i--) {

			if(i % 2 == 1) {
				list.remove(i);
			}
		}
		System.out.println(list);
		divide();
	
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		int random2 = (int)(Math.random()*101)+1;
		for(int i = 0; i < 40; i++) {
			list2.add(random2);
			random2 = (int)(Math.random()*101)+1;
		}
		System.out.println("New list: " + list2);
		divide();
		
		for(int i = 0; i < list2.size(); i++) { 

			if(list2.get(i) % 2 == 0) {
				list2.set(i, (list2.get(i)*1000));
			}
		}
		System.out.println(list2);
		divide();
	
		for(int i = 0; i < list2.size(); i++) {
			if(list2.get(i) % 2 == 1) {
				list2.set(i, (list2.get(i)%10));
			}
		}
		System.out.println(list2);
		divide();
		
		for(int i = 0; i < 40; i++) {
			if(list2.get(i) % 2 == 0) {
				list2.add(list2.size(), (list2.get(i)));
			}
		}
		System.out.println(list2);
		divide();
	

		
	}
	
	public static void main(String[]args) {
		lists app = new lists();
	}
	
	public void divide() {
		System.out.println("___________________________________________________________________________________________________________________________________________________________________________________");
	}
}
