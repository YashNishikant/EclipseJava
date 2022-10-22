import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GuitarHero {

	public GuitarHero() {
	
		int[][] positions = {
							
							{29,24,19,14,10,5},
							{28,23,18,13,9 ,4},
							{27,22,17,12,8 ,3},
							{26,21,16,11,7 ,2},
							{25,20,15,10,6 ,1},

							};
		
		File f = new File("C:\\Users\\yash0\\eclipse-workspace\\Tasks\\src\\Guitar Song.txt");

		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
			String temp;
			while ((temp = reader.readLine()) != null) {
				String[] pieces = temp.split(",");
				try {

					System.out.println(pieces[0]);
					
				} catch (NumberFormatException ee) {
					System.out.println(ee);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		new GuitarHero();
	}
	
}
