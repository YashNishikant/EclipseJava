import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class mainclass {

	public static void main(String[] args) {

		  try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\yash0\\eclipse-workspace\\Threadpractice\\src\\text.txt"))) {

			   String strCurrentLine;

			   while ((strCurrentLine = br.readLine()) != null) {
			    System.out.println(strCurrentLine);
			   }

			  } catch (IOException e) {
			   e.printStackTrace();
			  }
	}

}
