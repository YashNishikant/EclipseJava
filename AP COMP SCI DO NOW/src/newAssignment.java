
public class newAssignment {
	public static void main(String[] args) {
		
		String fruits = "apple banana cherry and date";
		
		while(fruits.indexOf("a") >= 0) {
			int i = fruits.indexOf("a");
			fruits = fruits.substring(0,i) + "AY" + fruits.substring(i+1);
		}
		
		while(fruits.indexOf("e") >= 0) {
			int i = fruits.indexOf("e");
			fruits = fruits.substring(0,i) + fruits.substring(i+1);
		}
		
		System.out.println(fruits);
	
		if(fruits.equals("AYppl bAYnAYnAY chrry AYnd dAYt")) {
			System.out.println("MATCH");
		}
		
	}
}
