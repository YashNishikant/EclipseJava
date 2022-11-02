import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GuitarHero {
   String[] noteNames;
   String[][] musicsheet;
   boolean[] duplicateBs;
   int[][] positions;

   public GuitarHero() {

       positions = new int[][] {

               { 29, 24, 19, 14, 10, 5 },
               { 28, 23, 18, 13, 9, 4 },
               { 27, 22, 17, 12, 8, 3 },
               { 26, 21, 16, 11, 7, 2 },
               { 25, 20, 15, 10, 6, 1 },

       };

       noteNames = new String[] { "G#", "G", "F#", "F", "E", "D#", "D", "C#", "C", "B", "A#", "A", "G#", "G", "F#",
               "F", "E", "D#", "D", "C#", "C", "B", "A#", "A", "G#", "G", "F#", "F", "E" };

       File f = new File("C:\\github\\JavaApps\\Tasks\\src\\Guitar Song.txt");

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
                       if (measures[i].charAt(j) == '*' || measures[i].charAt(j) == 'o') {
                           int helperRowNum = positions[row][j];
                           musicsheet[helperRowNum][i + 1] = "\to";
                       }

                   }

               }
               row++;

           }
           for (int i = 0; i < musicsheet.length; i++) {
               for (int j = 0; j < musicsheet[0].length; j++) {
                   System.out.print(musicsheet[i][j]);
               }
               System.out.println();
           }
       } catch (IOException e) {
           System.out.println(e);
       }

   }

   void clear(){
       int last = 0;
       for (int i = 0; i < musicsheet.length; i++) {
           for (int j = 0; j < musicsheet[0].length; j++) {
               if(musicsheet[i][j] == "o"){
                   last = j;
               }
           }

          

       }
   }

   void setup(String[] measures) {

       musicsheet = new String[30][measures.length + 1];
       for (int i = 0; i < musicsheet.length; i++) {
           for (int j = 0; j < musicsheet[0].length; j++) {
               musicsheet[i][j] = "\t";
           }
       }
       for (int i = 0; i < noteNames.length; i++) {
           musicsheet[i+1][0] = noteNames[i]+"\t";
       }
       for (int i = 0; i <= measures.length; i++) {
           musicsheet[0][i] = "\t"+i;
       }
       musicsheet[0][0] = "Measure";



   }

   public static void main(String[] args) {
       new GuitarHero();
   }

}


