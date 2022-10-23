
public class assignment2 {

	public static void main(String[] args) {

		String s = "I can't get no satisfaction";
		int space = 0;
		
		while(s.indexOf(" ") >= 0) {
			space = s.indexOf(" ");
			
			s = s.substring(0,space) + s.substring(space+1);
		}
		System.out.println(s);
	
		int character;		
		while(s.indexOf('s') >= 0) {
			character = s.indexOf('s');
			s = s.substring(0,character) + "z" + s.substring(character + 1);
		}
		System.out.println(s);

		for(int i = 0; i < s.length(); i+=2) {
			s = s.substring(0,i) + s.substring(i, i+1).toUpperCase() + s.substring(i+1);
		}
		System.out.println(s);
	
		String reverse = "abc";
		for(int i = reverse.length()-1; i > -1; i--) {
			System.out.print(reverse.substring(i, i+1));
		}

	}
}
