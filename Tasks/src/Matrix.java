import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Matrix {

   public Matrix(){
       File file=new File("C:\\Users\\yash0\\eclipse-workspace\\Tasks\\src\\MatrixFile.txt");

       int[][] m1 = new int[0][0];
       int[][] m2 = new int[0][0];

       try
       {
           BufferedReader reader=new BufferedReader(new FileReader(file));
           String temp;
           while((temp=reader.readLine())!=null)
           {
               String[] pieces = temp.split(" ");
               
               int[] d1 = dimensions(pieces[0]);
               int[] d2 = dimensions(pieces[1]);

               
               m1 = new int[d1[0]][d1[1]];
               m2 = new int[d2[0]][d2[1]];
               
               try
               {
                   String trimM1 = trimMatrixString(pieces, 0);
                   String trimM2 = trimMatrixString(pieces, 1);
                   m1 = generateMatrix(trimM1, m1);
                   m2 = generateMatrix(trimM2, m2);
                   printmatrix(m1);
                   System.out.println();
                   printmatrix(m2);

               }catch(NumberFormatException ee)
               {
                   System.out.println("Can't convert a letter to a number.");
               }
           }
       }
       catch(IOException e)
       {
           System.out.println("Error");
       }

       System.out.println("---------------------------------------------");


       //printmatrix(sum(m1, m2));
       //System.out.println();
       //printmatrix(difference(m1, m2));
       //System.out.println();
       product(m1, m2);
   }

   public int[][] sum(int[][] a, int[][] b){

       int[][] result = new int[a.length][a[0].length];

       for(int i = 0; i < a.length; i++){
           for(int j = 0; j < a.length; j++){
               result[i][j] = a[i][j] + b[i][j];
           }
       }

       return result;
   }

   public int[][] difference(int[][] a, int[][] b){

       int[][] result = new int[a.length][a[0].length];

       for(int i = 0; i < a.length; i++){
           for(int j = 0; j < a.length; j++){
               result[i][j] = a[i][j] - b[i][j];
           }
       }

       return result;
   }

   public void product(int[][] a, int [][] b){

       int result = 0;
       
       int lim = a[0].length;
       int lim2 = b[0].length;
       if(a[0].length > b[0].length) {
    	   lim = b[0].length;
    	   lim2 = a[0].length;
       }
       
       for(int i = 0; i < a.length; i++){
           for(int j = 0; j < lim; j++){
               for(int k = 0; k < lim2; k++) { 
            	   result += a[i][k] * b[k][j];
               }
               System.out.print(result + " ");
               result = 0;
           }
           System.out.println();
       }
   }

   public String trimMatrixString(String[] pieces, int p){
       String cut1 = pieces[p].substring(1);
       String cut2 = cut1.substring(0, cut1.length()-1);
       cut2 = cut2.replace("{", "");

       return cut2;
   }

   public int[][] generateMatrix(String s, int[][] m){
       int r = 0;
       int c = 0;

       for(int i = 0; i < s.length(); i++){
           if((s.charAt(i) == ',' && s.charAt(i-1) != '}') || (s.charAt(i) == '}')){
               int num = Integer.parseInt(s.charAt(i-1)+"");
               m[r][c] = num;
               c++;
           }
           if(s.charAt(i) == '}'){
               r++;
               c = 0;
           }
       }
       return m;
   }

	public int[] dimensions(String s) {
		int r = 0;
		int c = 0;

		String[] pieces = s.split("},");
		String[] pieces2 = pieces[0].split(",");

		r = pieces.length;
		c = pieces2.length;


		int[] arr = { r, c };

		return arr;
	}
   
   public void printmatrix(int[][] m){
       for(int i = 0; i < m.length; i++){
           for(int j = 0; j < m[0].length; j++){
               System.out.print(m[i][j] + " ");
           }
           System.out.println();
       }
   }

   public static void main(String[] args) {
       new Matrix();
   }

}


