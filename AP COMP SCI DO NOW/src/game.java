
public class game {
	
	int villainHealth = 100;
	int round = 1;
	
	public game() {
		while (gameOn(round)) {
			if (attack(roll(20))) {
				villainHealth = difference(villainHealth, product(roll(6), roll(6)));
			}
			else {
				healthReminder();
			}
			
			if(checkWin()) {
				break;
			}
			round++;
		}
	}

	public static void main(String[] args) {
		game Game = new game();
	}
	
	public boolean checkWin() {
		
		boolean win = false;
		
		if(villainHealth <= 0) {
			win = true;
			System.out.println("YOU WIN!");
		}
		
		if(round >= 10 && villainHealth > 0) {
			win = false;
			System.out.println("YOU LOSE!");
		}
		
		return win;
	}
	
	public void healthReminder() {
		System.out.println("Villain has " + villainHealth + " hit points remaining\n______________________________________");
	}

	public boolean gameOn(int round) {
		
		boolean game = true;
		
		if(round != 11) {
			System.out.println("Round " + round + ":");
		}
		
		else {
			game = false;
		}
		return game;
		
	}

	public int difference(int a, int b) {
		
		int difference = a-b;
		
		if(a-b <= 0) {
			difference = 0;
		}
		
		System.out.println("Villain has " + difference + " hit points remaining\n______________________________________");
		
		return difference;
	}

	public boolean attack(int x) {

		boolean attackValid = false;

		if (x >= 7) {
			attackValid = true;
			System.out.println("Attack is successful");
		}
		else {
			System.out.println("Attack is unsuccessful");
		}
		return attackValid;
	}

	public int product(int a, int b) {
		return (a * b);
	}

	public int roll(int x) {
		int result = (int) (Math.random() * x) + 1;
		System.out.println("Player rolls a " + result);
		return result;
	}

}