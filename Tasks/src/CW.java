import java.util.ArrayList;

public class CW {

	public static void main(String[] args) {

		String str = " gap ";
		ArrayList<String> ans = new ArrayList<String>();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				ans.add(str.substring(0, i) + str.substring(i, i + 1).toUpperCase() + str.substring(i + 1, str.length()));
		}

		String[] finalresult = new String[ans.size()];
		
		for (int i = 0; i < finalresult.length; i++)
			finalresult[i] = ans.get(i);
		

	}
}
