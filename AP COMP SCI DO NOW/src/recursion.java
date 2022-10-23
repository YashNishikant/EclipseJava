
public class recursion {

	public recursion() {
		System.out.println(countHi("xxhixxhi"));
	}

	public static void main(String[] args) {
		recursion app = new recursion();
	}

//	public int array11(int[] nums, int index) {
//		  if(index == 0){
//		    return 0;
//		  }
//		  if(nums[index] == 11){
//		  return array11(nums, (index-1));
//		  }
//		}

	public int countHi(String str) {
		if (str.length() <= 1) {
			return 0;
		}
		if (str.substring(str.length() - 2).equals("hi")) {
			return countHi(str.substring(0, str.length() - 1)) + 1;
		}
		else {
			return countHi(str.substring(0, str.length() - 1));
		}
	}

}