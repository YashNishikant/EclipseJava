
public class doNow2 {

	public static void main (String[] Args) {
//1. 	
//
//  2
//  -1		
//  2
//_________________________
//2. 	
//
//  1	
//	-20    
//	22    
//	2      
//_________________________
//3.  	
//
//  20		     
//_________________________
//4.  	
//
//  8		     
//	14
//	20
//	26
//	2
//_________________________
//5.  	
//
//  8		     
//	14
//	20
//	26
//	2
//_________________________	

		int array[] = new int[20];
		int random = (int)(Math.random()*50)+1;
		System.out.print("Original: ");
		for(int i = 0; i < array.length-1; i++) {
			array[i] = random;
			random = (int)(Math.random()*50)+1;
			System.out.print(array[i] + " ");
		}
		
		System.out.print("\nReversed: ");
		for(int i = 0; i < array.length-1; i++) {
			array[i] = random;
			random = (int)(Math.random()*50)+1;
			System.out.print(array[i] + " ");
		}
		
	}
}
