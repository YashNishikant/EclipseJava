
/*
For this assignment you will code a simple game callled Hi Lo according to the gaeme, rules, coding rules, and 
specified output.

Game rules:
1) The computer will randomly pick a number 1 - 6, simulating a die roll.
2) The player will then be prompted to guess if the next roll will be higher or lower.
3) The computer will then 'roll' another 6 sided die
4) If the second roll matchees the user prediction (e.g. it is higher than the last roll)
   the player gets one point.  If the prediction is wrong or the second number is the same
   as the first, the computer 'wins' the round and the player scores 0 points for the round.
5) Five rounds will be played as described in step 1-4.
6) If the player wins 3 or more of the five, rounds they are the overall winner.

Coding Rules:
1) Must use both switch statements and if statements
2) Must use a Scanner to read user input
3) Should use Math.random() to generate die roll

Output rules:
1) Before each round, the round number should be clearly printed out (e.g. ROUND 1).
2) The next line should state what the computer rolls first and prompt for Hi or Lo.
3) The third line should print the second roll outcome and whether the player wins or loses.
4) The final line of the program should print how many rounds of 5 the player won and
   whether the player wins or loses the game overall.


Example:

ROUND 1
The computer rolls a 4.   Do you think the next roll will be (Hi)gher or (Lo)wer?  Lo
The computer rolled 5.  You lose this round.

ROUND 2
The computer rolls a 2.   Do you think the next roll will be (Hi)gher or (Lo)wer?  Hi
The computer rolled 6.  You win this round.

ROUND 3
The computer rolls a 3.   Do you think the next roll will be (Hi)gher or (Lo)wer?  Hi
The computer rolled 3.  You lose this round.

ROUND 4
The computer rolls a 1.   Do you think the next roll will be (Hi)gher or (Lo)wer?  Hi
The computer rolled 5.  You win this round.

ROUND 5
The computer rolls a 4.   Do you think the next roll will be (Hi)gher or (Lo)wer?  Lo
The computer rolled 2.  You win this round.

You won 3 of 5 rounds, so you win the game!
*/
package higherOrLower;

import java.util.Scanner;

public class HiLo {
	public static void main(String[] args) throws InterruptedException {

		int total = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to HiLo. The game will begin in 3 seconds.");
		Thread.sleep(3000);
		separate();

		// Round 1
		System.out.println("ROUND 1");

		int diceNum = (int) (Math.random() * 6 + 1);
		System.out.println("The first dice rolled a " + diceNum + ": For this next roll, will the number be (Hi)gher or (Lo)wer than the previous roll?");
		String higherOrLower = scan.nextLine();

		int diceNum2 = (int) (Math.random() * 6 + 1);
		System.out.print("The second dice rolled a " + diceNum2 + " ");
		total = switchstatement(diceNum, diceNum2, higherOrLower, total);


		// Round 2
		System.out.println("ROUND 2");

		diceNum = (int) (Math.random() * 6 + 1);
		System.out.println("The first dice rolled a " + diceNum + ": For this next roll, will the number be (Hi)gher or (Lo)wer than the previous roll?");
		higherOrLower = scan.nextLine();

		diceNum2 = (int) (Math.random() * 6 + 1);
		System.out.print("The second dice rolled a " + diceNum2 + " ");
		total = switchstatement(diceNum, diceNum2, higherOrLower, total);

		
		// Round 3
		System.out.println("ROUND 3");

		diceNum = (int) (Math.random() * 6 + 1);
		System.out.println("The first dice rolled a " + diceNum + ": For this next roll, will the number be (Hi)gher or (Lo)wer than the previous roll?");
		higherOrLower = scan.nextLine();

		diceNum2 = (int) (Math.random() * 6 + 1);
		System.out.print("The second dice rolled a " + diceNum2 + " ");
		total = switchstatement(diceNum, diceNum2, higherOrLower, total);

		
		// Round 4
		System.out.println("ROUND 4");

		diceNum = (int) (Math.random() * 6 + 1);
		System.out.println("The first dice rolled a " + diceNum + ": For this next roll, will the number be (Hi)gher or (Lo)wer than the previous roll?");
		higherOrLower = scan.nextLine();

		diceNum2 = (int) (Math.random() * 6 + 1);
		System.out.print("The second dice rolled a " + diceNum2 + " ");
		total = switchstatement(diceNum, diceNum2, higherOrLower, total);

		
		// Round 5
		System.out.println("ROUND 5");

		diceNum = (int) (Math.random() * 6 + 1);
		System.out.println("The first dice rolled a " + diceNum + ": For this next roll, will the number be (Hi)gher or (Lo)wer than the previous roll?");
		higherOrLower = scan.nextLine();

		diceNum2 = (int) (Math.random() * 6 + 1);
		System.out.print("The second dice rolled a " + diceNum2 + " ");
		total = switchstatement(diceNum, diceNum2, higherOrLower, total);
		checkForWin(total);

	
	}

	public static void checkForWin(int total) {
		
		if(total >= 3) {
		System.out.println("Congratulations, you win!");		
		}
		else {
		System.out.println("You lost this game...");	
			
		}
		
	}
	
	public static void separate() {
		System.out.println("____________________________________________________________________________________________");
	}
	

	public static int switchstatement(int diceNum, int diceNum2, String higherOrLower, int total) {

		switch (higherOrLower) {

		case "Hi":
			if (diceNum > diceNum2) {
				System.out.println("so you lost.\n");
				System.out.println("You have won " + total + " out of 5 rounds");
				separate();
			}
			if (diceNum == diceNum2) {
				System.out.println("so you lost.\n");
				System.out.println("You have won " + total + " out of 5 rounds");
				separate();
			} 
			if (diceNum < diceNum2) {
				System.out.println("so you won!\n");
				total += 1;
				System.out.println("You have won " + total + " out of 5 rounds");
				separate();
			}
			break;
		
		case "hi":
			if (diceNum > diceNum2) {
				System.out.println("so you lost.\n");
				System.out.println("You have won " + total + " out of 5 rounds");
				separate();
			}
			if (diceNum == diceNum2) {
				System.out.println("so you lost.\n");
				System.out.println("You have won " + total + " out of 5 rounds");
				separate();
			} 
			if (diceNum < diceNum2) {
				System.out.println("so you won!\n");
				total += 1;
				System.out.println("You have won " + total + " out of 5 rounds");
				separate();
			}
			break;	
			
		case "Lo":
			if (diceNum < diceNum2) {
				System.out.println("so you lost.\n");
				System.out.println("You have won " + total + " out of 5 rounds");
				separate();
			}

			if (diceNum == diceNum2) {
				System.out.println("so you lost.\n");
				System.out.println("You have won " + total + " out of 5 rounds");
				separate();
			} 
			if (diceNum > diceNum2) {
				System.out.println("so you won!\n");
				total += 1;
				System.out.println("You have won " + total + " out of 5 rounds");
				separate();
			}
			break;
		
		case "lo":
			if (diceNum < diceNum2) {
				System.out.println("so you lost.\n");
				System.out.println("You have won " + total + " out of 5 rounds");
				separate();
			}

			if (diceNum == diceNum2) {
				System.out.println("so you lost.\n");
				System.out.println("You have won " + total + " out of 5 rounds");
				separate();
			} 
			if (diceNum > diceNum2) {
				System.out.println("so you won!\n");
				total += 1;
				System.out.println("You have won " + total + " out of 5 rounds");
				separate();
			}
			break;
			
		}

		return total;

	}

}
