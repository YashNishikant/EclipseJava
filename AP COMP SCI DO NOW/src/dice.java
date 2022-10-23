
public class dice {

	boolean win;

	public dice() {
			game();
	}

	public static void main(String[] args) {

		dice app = new dice();
	}

	public void game() {
		int FirstRoll = roll2(6);
		if ((FirstRoll == 7 || FirstRoll == 11) || (FirstRoll == 2 || FirstRoll == 12 || FirstRoll == 3)) {

			if (FirstRoll == 7 || FirstRoll == 11) {
				System.out.println("YOU WIN");
				win = true;
			} else if((FirstRoll == 2 || FirstRoll == 12 || FirstRoll == 3)){
				System.out.println("YOU LOSE");
				win = false;
			}
		} else {
			System.out.println("POINT");
			int rollToSum = roll2(6);
			
			while ((rollToSum != FirstRoll) && !win) {
				if(rollToSum == 7) {
					System.out.println("YOU LOSE");
					win = false;
					break;
				}	
				if(rollToSum == FirstRoll){
					System.out.println("YOU WIN");
					win = true;
					break;
				}
				else {
					System.out.println(rollToSum + " is not " + FirstRoll);
				}
				rollToSum = roll2(6);
				if(rollToSum == FirstRoll){
					System.out.println("YOU WIN");
					win = true;
				}
			}
		}
	}
	
	public int roll() {
		int number = (int) (Math.random() * 6) + 1;
		System.out.println("You rolled a " + number);
		return number;
	}

	public int roll2(int x) {
		int random = (int) (Math.random() * x) + 1;
		int random2 = (int) (Math.random() * x) + 1;
		System.out.println("You rolled a sum of " + (random + random2));
		int result = random + random2;

		return result;

	}

}
