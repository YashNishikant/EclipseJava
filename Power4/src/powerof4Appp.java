import java.util.Scanner;
public class powerof4Appp {
	private static Scanner input; 
    static int isPowerOfFour(int n)
    {
        if(n == 0)
        return 0;
        while(n != 1)
        { 
            if(n % 4 != 0)
            return 0;
            n = n / 4;     
        }
        return 1;
    } 
 
    public static void main(String[] args)
    {
        
    	System.out.println("Enter a power of 4...");
    	
    	input = new Scanner(System.in);
    	
    	int value = input.nextInt();
    	

        if(isPowerOfFour(value) == 1)
         System.out.println(value + " is a power of 4");
        else
         System.out.println(value + " is not a power of 4");
    }
}