import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public Main() {

	}

	public static void main(String[] args) {
		Books b1 = new Books("George", "Orwell", "1984", 400);
		Books b2 = new Books("Toni", "Morrison", "Beloved", 275);
		Books b3 = new Books("Amy", "Tan", "The Joy Luck Club", 325);
		Books b4 = new Books("Andrew", "Morrison", "Friends", 190);
		Books b5 = new Books("Toni", "Morrison", "The Bluest Eye", 400);
		Books b6 = new Books("George", "Orwell", "1984", 300);
		
		ArrayList<Books> booklist = new ArrayList<Books>();
		
		booklist.add(b1);
		booklist.add(b2);
		booklist.add(b3);
		booklist.add(b4);
		booklist.add(b5);
		booklist.add(b6);
		
		Collections.sort(booklist);
		for (Books b : booklist) {
			System.out.println(b);
		}
	
		
		
	}
}
