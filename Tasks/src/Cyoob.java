
import java.io.*;
import java.util.ArrayList;

public class Cyoob {
   public Cyoob(){
       File f = new File("C:\\Users\\yash0\\eclipse-workspace\\Tasks\\src\\CubeInput.txt");
       
       ArrayList<String> pieces = new ArrayList<>();
       int[][] numbers = {{0, 2, 0},
    		   			  {3, 1, 4},
    		   			  {0, 5, 0},
    		   			  {0, 6, 0}};
       
       int i = 0;
       
       try{
           BufferedReader reader = new BufferedReader(new FileReader(f));
           String temp;
           while((temp=reader.readLine()) != null){
               pieces.add(temp.toString());

               for(int j = 0; j < pieces.get(i).length(); j++) {
                   if (pieces.get(i).charAt(j) == 'N') {
                	   	
                   }
                   if (pieces.get(i).charAt(j) == 'E') {

                   }
                   if (pieces.get(i).charAt(j) == 'S') {

                   }
                   if (pieces.get(i).charAt(j) == 'W') {

                   }
               }
               System.out.println();
               i++;
           }
       }
       catch(IOException e){
           System.out.println(e);
       }
   }

   public static void main(String[] args){
       new Cyoob();
   }
}

