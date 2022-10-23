import java.util.ArrayList;

public class arrayList {

	public arrayList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
//1
		divide(1);
		for (int i = 0; i < 50; i++) {
			int ran = (int) (Math.random() * 101) + 1;

			list.add(ran);
		}
		System.out.println(list);
//2		
		divide(2);
		System.out.println(task2(list));
//3		
		divide(3);
		System.out.println(task3(5));
//4
		divide(4);
		System.out.println(task4(list));
//5
		divide(5);
		int random = (int) (Math.random() * 100) + 101;
		System.out.println("List Size: " + list.size());
		if (list.size() % 2 == 1) {

			for (int i = 0; i < 5; i++) {
				random = (int) (Math.random() * 100) + 101;
				list.add(i, random);
			}
		}
		System.out.println(list);

//6		
		divide(6);
		int random2 = (int) (Math.random() * 100) + 101;
		int randomIndex = (int)(Math.random()*list.size());
		System.out.println("List Size: " + list.size());

		if (list.size() % 2 == 0) {

			for (int i = 0; i < 10; i++) {
				random2 = (int) (Math.random() * 100) + 101;
			
				while(randomIndex % 2 == 0) {
					list.add(randomIndex, random2);
					random2 = (int) (Math.random() * 100) + 101;
				}
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		arrayList app = new arrayList();
	}

	public void divide(int number) {
		System.out.println(
				"_____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println(number);
	}

	public ArrayList<Integer> task2(ArrayList<Integer> list) {

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) % 3 == 0) {
				list.remove(i);
				i--;
			}
		}
		return list;
	}

	public boolean task3(int x) {
		return (x % 2 == 1);
	}

	public ArrayList<Integer> task4(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) % 2 == 1) {
				list.set(i, list.get(i + 1));
			}
			if (list.get(list.size() - 1) % 2 == 1) {
				list.set(i, list.get(0));
			}

		}

		return list;

	}

}
