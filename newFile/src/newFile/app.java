package newFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class app {
	private static Scanner input;

	public static void main(String[] args) throws IOException {

		input = new Scanner(System.in);

		System.out.println("What would you like your new file to be named? \n(Make sure you write .txt)");
		String myStr = input.nextLine();

		try {
			File file = new File("C:\\\\Users\\\\yash0\\\\EclipseFiles\\\\" + myStr);

			if (file.createNewFile())
				System.out.println("File has been created!");

			else
				System.out.println("Cannot create file.");

			System.out.println("Write something in your text file!");
			String anotherStr = input.nextLine();

			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(anotherStr);
			
			fileWriter.flush();
			fileWriter.close();
		}

		catch (IOException ioe) {
			ioe.printStackTrace();

		}
	}
}
