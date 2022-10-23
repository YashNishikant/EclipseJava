package quizz;

public class quizzz {

	public static void main(String[]args) {

	
		for(int i = 0; i < 300; i++) {
	
		int num = (int)(Math.random() * 284) + 15;
		
		if(num % 5 == 0) {
		
			if(num % 7 == 0) {
			
		System.out.print(num);	
			}
		}
		
		else {

		System.out.print("0");	
			
		}
		
	}

		double a = 3.5;
		double b = 2.5;
		double temp = a;
		
		a = b;
		b = temp;
		
		System.out.println("a: " + a + "\nb: " + b);	
		
	}
/*
	public static int[] arrMethod(int[] arr) {
	
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	
	for(int i = 0; i < arr.length; i++) {
		
		if(arr[i] > max) {
		
		max = arr[i];
		
		}	
		
		if(arr[i] < min) {
			
		min = arr[i];
			
		}
		
	}
	
	for(int i = 0; i < arr.length; i++) {
	
		if(arr[i] == min) {
			
		min = min/2;	
		
		arr[i] = min;
		
		}
		
		if(arr[i] == max) {
			
		max = max*2;
			
		arr[i] = max;	
		
		}
			
		
		System.out.print(arr[i] + " ");
	}
	
	return arr;

	}
*/		

	
	
}
	
