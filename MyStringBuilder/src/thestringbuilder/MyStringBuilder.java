package thestringbuilder;
	
	public class MyStringBuilder {

	public static void main(String [] args) throws InterruptedException {	


		//Efficient Way!


		StringBuilder sb = new StringBuilder("");
		
		sb.append("Hi. ");
		
		Thread.sleep(2000);
		
		System.out.println(sb.toString());
		
		Thread.sleep(2000);
		
		sb.append("I am an adventurer!");

		System.out.println(sb.toString());

	}

}