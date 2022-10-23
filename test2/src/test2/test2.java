package test2;

public class test2 {
	public static void main(String[]args){

		// Text that you want to decry
		String text = "Xchdphzf gxwzbxs qgong hvubvo hs vjk hj zbxftdo hsngvizg. Jpqwjunzt ucr, mju qvb fzoy dh. Xcuimoougoowjbn, mju rzqmmkhzr hcwn nsuhzbxs.";

				   // Put the letter you think the encryted text has been mapped to in the blank underneath
		      	   //{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] key = {'_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_'};

		freqAnalysis(text);  // Prints a table of how many times each letter occurs in the encypted message.   This should give you a hint
							 // as to which letter represenents which.   For example if 'k' is the most common letter in the encrypted
							 // message it may represent a very common letter like 'e' or 't'


		System.out.println("orig  :"+text);   // Prints original encrypted text
		String guess = decrypt(text,key);     // Uses the key to try  a decryption
		System.out.println("guess :"+guess);  // Tries to decypt based on how you have filled in the blanks of the key
	}


	public static int[] freqAnalysis(String text){
		int[] freq = new int[26];
		for (int i = 0; i < text.length(); i++) {
			int cInt = (int)text.charAt(i);
			if (cInt >= 65 && cInt <=90){
				cInt -= 65;
				freq[cInt]++;
			}
			if (cInt >= 97 && cInt <=122) {
			 	cInt -= 97;
				freq[cInt]++;
			}
		}
		System.out.println("Letter Frequency:");
	 	for (int i = 65; i <= 90; i++){
			System.out.print((char)i + "-"+ freq[i-65]+"  ");
			if ( (i - 65) %  8 == 7)
					System.out.println();
		}
		System.out.println("\n");
		return freq;
	}


	public static String decrypt(String text, char[] key){
		String str = "";
		for (int i = 0; i < text.length(); i++){
			int index = (int)text.charAt(i) - 97;
			if (index >= -32 && index <= -7)  // Shift capital letter to lowercase
				index += 32;
			if (index >= 0 && index < 26)
				str += key[index];
			else
				str += text.charAt(i);
		}
		return str;
	}

}

/*
Letter	Count	 	Letter	Frequency
E		21912	 	E		12.02
T		16587	 	T		9.10
A		14810	 	A		8.12
O		14003	 	O		7.68
I		13318	 	I		7.31
N		12666	 	N		6.95
S		11450	 	S		6.28
R		10977	 	R		6.02
H		10795	 	H		5.92
D		7874	 	D		4.32
L		7253	 	L		3.98
U		5246	 	U		2.88
C		4943	 	C		2.71
M		4761	 	M		2.61
F		4200	 	F		2.30
Y		3853	 	Y		2.11
W		3819	 	W		2.09
G		3693	 	G		2.03
P		3316	 	P		1.82
B		2715	 	B		1.49
V		2019	 	V		1.11
K		1257	 	K		0.69
X		315	 		X		0.17
Q		205	 		Q		0.11
J		188	 		J		0.10
Z		128	 		Z		0.07

SOURCE:  http://pi.math.cornell.edu/~mec/2003-2004/cryptography/subs/frequencies.html
*/

