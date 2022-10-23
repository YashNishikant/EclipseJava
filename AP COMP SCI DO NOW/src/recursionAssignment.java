
public class recursionAssignment {
	int[] a = {1, 2, 3, 4, 1, 2, 3};
	int n = 7;
	public recursionAssignment() {
		System.out.println(count12(a, 0));
		System.out.println(series(n));
		
	}
	
	public static void main(String[]args) {
		recursionAssignment app = new recursionAssignment();
	}
	
	public int series(int n) {
		
		if(n == 0) {
			return 2;
		}
		return series(n-1) + n;
	}
	
	public int count12(int[] arr, int index) {
		
		if(index >= arr.length) {
			return 0;
		}
		if(arr[index] == 1 || arr[index] == 2) {
			return count12(arr, (index+1)) + 1;
		}
		else {
			return count12(arr, (index+1));
		}
	}
}
