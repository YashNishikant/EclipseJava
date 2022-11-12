import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GuitarHero {
	String[] noteNames;
	String[][] musicsheet;
	boolean[] duplicateBs;
	boolean[] bNote;
	int[][] positions;

	public GuitarHero() {

		positions = new int[][] {

				{ 29, 24, 19, 14, 10, 5 }, { 28, 23, 18, 13, 9, 4 }, { 27, 22, 17, 12, 8, 3 }, { 26, 21, 16, 11, 7, 2 },
				{ 25, 20, 15, 10, 6, 1 },

		};

		noteNames = new String[] { "G#", "G", "F#", "F", "E", "D#", "D", "C#", "C", "B", "A#", "A", "G#", "G", "F#",
				"F", "E", "D#", "D", "C#", "C", "B", "A#", "A", "G#", "G", "F#", "F", "E" };

		File f = new File("Guitar Song.txt");

		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
			String temp;
			boolean first = true;
			int row = 0;

			while ((temp = reader.readLine()) != null) {
				String[] measures = temp.split(",");

				if (first) {
					musicsheet = new String[30][measures.length + 1];
					setup(measures);
					first = false;
				}

				for (int i = 0; i < measures.length; i++) {
					for (int j = 0; j < 6; j++) {
						int helperRowNum = positions[row][j];
						if (measures[i].charAt(j) == '*' || measures[i].charAt(j) == 'o') {
							musicsheet[helperRowNum][i + 1] = "o";
							if (row == 4 && j == 3 && measures[i].charAt(j) == '*') {
								bNote[i + 1] = true;
							}
						}
					}
				}
				row++;
			}
			clear();
			print();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	void print() {
		for (int i = 0; i < musicsheet.length; i++) {
			for (int j = 0; j < musicsheet[0].length; j++) {
				System.out.print(musicsheet[i][j] + "\t");
			}
			System.out.println();
		}

	}

	void clear() {
		for (int j = 1; j < musicsheet[0].length; j++) 
		{
			boolean highestnote = false;
			for (int i = 1; i < musicsheet.length; i++) 
			{
				if (!highestnote) 
				{
					if (musicsheet[i][j].equals("o")) 
					{
						highestnote = true;
					}
					if (i == 11 && musicsheet[i - 1][j].equals("o") && musicsheet[i][j].equals("o")) {
						musicsheet[i][j] = "";
					}
				} 
				else 
				{
					if (musicsheet[i][j].equals("o")) 
					{
						musicsheet[i][j] = "";
					}
				}
				if (i == 10) 
				{
					if (bNote[j]) 
					{
						musicsheet[i][j]="o";
					}
				}
				if((i<=10 && i%5==0) || (i>10 && i%5==4))
				{
					highestnote = false;
				}
			}
		}
	}

	void setup(String[] measures) {

		musicsheet = new String[30][measures.length + 1];
		for (int i = 0; i < musicsheet.length; i++) {
			for (int j = 0; j < musicsheet[0].length; j++) {
				musicsheet[i][j] = "";
			}
		}
		for (int i = 1; i < noteNames.length; i++) {
			musicsheet[i][0] = noteNames[i-1];
		}
		for (int i = 1; i <= measures.length; i++) {
			musicsheet[0][i] = "" + i;
		}
		musicsheet[0][0] = "Measure";

		bNote = new boolean[measures.length + 1];
	}

	public static void main(String[] args) {
		new GuitarHero();
	}

}