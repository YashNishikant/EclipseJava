import java.util.ArrayList;

public class assignment3 {

	public assignment3() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//TASK 1
		int random;
		for(int i = 0; i < 15; i++) {
			random = (int)(Math.random()*51)+5;
			list.add(i, random);
		}
		task(1);
		System.out.println(list);
		divide();
		
		//TASK 2
		task(2);
		System.out.println(removeEven(list));
		divide();
		
		//TASK 3
		task(3);
		System.out.println(duplicate7(list));
		divide();
	}
	
	public static void main(String[] args) {
		assignment3 app = new assignment3();
	}
	
	public ArrayList<Integer> duplicate7(ArrayList<Integer> list){
		
		for(int i = list.size()-1; i >= 0; i--) {
			if(list.get(i) % 7 == 0) {
				list.add(list.size(), list.get(i));
			}
		}
		
		return list;
		
	}
	
	public ArrayList<Integer> removeEven(ArrayList<Integer> list){
		
		for(int i = list.size()-1; i >= 0; i--) {
			if(list.get(i) % 2 == 0) {
				list.remove(i);
			}
		}
		return list;
	}
	
	public void task(int number) {
		System.out.println("Task " + number);
	}
	
	public void divide() {
		System.out.println("____________________________________________________________________________________________________________________________________");
	}
}
