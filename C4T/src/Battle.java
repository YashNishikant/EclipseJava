
public class Battle {

	public Battle() {
		
		Player p1 = new Player(100);
		Player p2 = new Player(100);
		
		int round = 0;
		
		while(p1.getHealth() > 0 && p2.getHealth() > 0) {
			
			round++;
			
			System.out.println("ROUND " + round);
			
			p1.attack(p2);
			System.out.println("Player 1 deals " + p1.getDamageDealt() + " damage to Player 2!\tPlayer 2 Health: " + p2.getHealth());
			p2.attack(p1);
			System.out.println("Player 2 deals " + p2.getDamageDealt() + " damage to Player 1!\tPlayer 1 Health: " + p1.getHealth());
			System.out.println("\n");
			
			if(p1.getHealth() > 0 && p2.getHealth() == 0)
				System.out.println("PLAYER 1 WINS");
			
			if(p2.getHealth() > 0 && p1.getHealth() == 0)
				System.out.println("PLAYER 2 WINS");
			
		}
		
	}
	
	public static void main(String[] args) {
		new Battle();
	}
}
