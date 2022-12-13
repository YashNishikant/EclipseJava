
public class mainclass {
	public mainclass() {
		SuperList<Integer> list = new SuperList<Integer>();

		for (int i = 0; i < 30; i++) {
			list.add((int) (Math.random() * 1000) + 1);
		}
		System.out.println(list.toString());
		System.out.println("\n" + list.size());

		SuperList<Integer> liststack = new SuperList<Integer>();

		for (int i = list.size() - 1; i >= 0; i--) {
			liststack.push(list.get(i));
			list.remove(i);
		}

		SuperList<Integer> listqueue = new SuperList<Integer>();

		System.out.print("\nStack: ");
		int count = liststack.size();
		for (int i = 0; i < count; i++) {
			int val = liststack.pop();
			System.out.print(val + ", ");
			listqueue.add(val);
		}

		System.out.print("\nQueue: ");
		int count2 = listqueue.size();
		for (int i = 0; i < count2; i++) {
			int val = listqueue.poll();
			int rand = (int) (Math.random() * list.size);
			list.add(rand, val);
			System.out.print(val + ", ");
		}

		System.out.println("\nList: " + list.toString());

		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println("\nSum: " + sum);
		sum = 0;

		for (int i = 0; i < list.size(); i++) {
			if (i % 2 == 0)
				sum += list.get(i);
			else
				sum2 += list.get(i);
		}
		System.out.println("\nSum Even Indexes: " + sum);
		System.out.println("Sum Odd Indexes: " + sum2);

		int count3 = list.size();
		for (int i = 0; i < count3; i++) {
			if (list.get(i) % 2 == 0)
				list.add(list.get(i));
		}

		System.out.println("\nAdded Evens: " + list.toString());

		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i) % 3 == 0)
				list.remove(i);
		}

		System.out.println("Removed Numbers Divisible By 3: " + list.toString());

		list.add(4, 55555);
		System.out.println("Inserted 55555: " + list.toString());

		for (int i = 0; i < list.size() - 1; i++) {
			int index = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j) > list.get(index)) {
					index = j;
				}
			}
			int temp = list.get(index);
			list.set(index, list.get(i));
			list.set(i, temp);
		}
		System.out.println("Descending Order: " + list.toString());

		if (list.size() % 2 == 0) {
			System.out.println("\nMedian: " + (list.get(list.size() / 2) + (list.get(list.size() / 2 - 1))) / 2);
			System.out.print("All Before: ");

			for (int i = 0; i < list.size() / 2; i++) {
				System.out.print(list.get(i) + " ");
			}
			System.out.print("\nAll After: ");
			for (int i = list.size() / 2; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}

		} else {
			System.out.println("\nMedian: " + list.get(list.size() / 2));

			System.out.print("All Before: ");

			for (int i = 0; i < list.size() / 2; i++) {
				System.out.print(list.get(i) + " ");
			}
			System.out.print("\nAll After: ");
			for (int i = list.size() / 2 + 1; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
			System.out.println("\n");

		}

		SuperList<String> wordlist = new SuperList<String>();
		String sentence = "the quick brown fox jumped over the lazy dog";
		String word = "";
		for (int i = 0; i < sentence.length(); i++) {
			word += sentence.charAt(i);
			if (sentence.charAt(i) == ' ' || i == sentence.length() - 1) {
				word = word.trim();
				wordlist.add(word);
				word = "";
			}
		}
		System.out.println("\n\nWord List: " + wordlist.toString());

		for (int i = wordlist.size() - 1; i >= 0; i--) {
			if (wordlist.get(i).length() <= 3) {
				wordlist.remove(i);
			}
		}
		System.out.println("Revised Word List: " + wordlist.toString());

		for (int i = 1; i < wordlist.size(); ++i) {
			int j = i - 1;
			String tmp = wordlist.get(i);
			int key = wordlist.get(i).length();
			while (j >= 0 && wordlist.get(j).length() > key) {
				wordlist.set(j + 1, wordlist.get(j));
				j = j - 1;
			}
			wordlist.set(j + 1, tmp);
		}

		System.out.println("Sorted: " + wordlist.toString());

		int charcount = 0;
		for (int i = 0; i < wordlist.size(); i++) {
			for (int j = 0; j < wordlist.get(i).length(); j++) {
				if (!(wordlist.get(i).charAt(i) == ' ')) {
					charcount++;
				}
			}
		}

		System.out.println("Average Word Length: " + (double) charcount / wordlist.size());

	}

	public static void main(String[] args) {
		mainclass app = new mainclass();
	}
}
