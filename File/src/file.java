
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file {
	public static void main(String[] args) throws FileNotFoundException {
	
		File file = new File("C:\\Users\\yash0\\EclipseFiles\\new.txt");
		Scanner sc = new Scanner(file);

		sc.useDelimiter("\\Z");

		File file2 = new File("C:\\Users\\yash0\\EclipseFiles\\new2.txt");
		Scanner sc2 = new Scanner(file2);

		sc.useDelimiter("\\Z");

		System.out.println(sc2.nextLine());
		System.out.println(sc.next());
		sc.close();
		sc2.close();
	}
}
