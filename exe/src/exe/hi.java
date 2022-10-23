package exe;

	public class hi {

	public static void main (String[]Args) {
	
	System.out.println("PROGRAM 1:");	
		
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
		
	int[] arr = new int[10]; 
	
	for(int i = 0; i < arr.length; i++) {
	
		int rand = (int)(Math.random()*8) + 3;
	
		arr[i] = rand;
		
		if(arr[i] > max) {
		
		max = arr[i];	
			
		}
		
		if(arr[i] < min) {
		
		min = arr[i];	
			
		}
		
		System.out.print(arr[i] + " ");
		
	}
	
	System.out.println();
	System.out.println("Max Value: " + max);
	System.out.println("Min Value: " + min);
	
	System.out.println("______________________\n\n" + "PROGRAM 2:");
	
	for(int i = 300; i < 501; i++) {
		
	
	if(i % 11 == 0) {
		
		if(i % 2 == 0) {
			
		System.out.print(i + " ");	
			
		}
		
	}	
				
}
	
	System.out.println("\n______________________\n\n" + "PROGRAM 3:");
	
	int a = 3;
	int b = 5;
	int temp = 0;
	
	System.out.println("Integer a: " + a + "\nInteger b: " + b);
	
	temp = a;
	a = b;
	b = temp;
	
	System.out.println("AFTER SWAP:\nInteger a: " + a + "\nInteger b: " + b);
	
	}
		
}
