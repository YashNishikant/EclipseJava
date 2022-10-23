
public class assignment {

	public static void main(String[] args) {
		
		System.out.println(mystery(8));
		
		int[] arr = new int[8];

		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		
		arr[4] = 1;
		arr[5] = 1;
		arr[6] = 1;
		arr[7] = 3;
		
		System.out.println(canBalance(arr));
	}

	public static boolean canBalance(int[] nums) {
		int sum = 0;
		int sum2 = 0;
		boolean even = false;

		for (int i = 0; i < nums.length; i++) {	
			sum = 0;

			for (int j = 0; j < i; j++) {
				sum += nums[j];
			}
		
			sum2 = 0;
			for (int k = i; k < nums.length; k++) {
				sum2 += nums[k];
			}
			
			if(sum == sum2) {
				even = true;
			}
			
		}
		
		return even;
	}
	public static int mystery(int n) 
	{
	  n--;

	  if (n > 0)
	  {
	    mystery(n);
	  }
	  return n * 2;
	}
}
