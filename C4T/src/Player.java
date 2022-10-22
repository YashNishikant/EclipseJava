
public class Player {

	private int health;
	private int damageDealt;
	
	public Player(int h) {
		health = h;
	}
	
	public void attack(Player p) {
		damageDealt = (int)(Math.random()*20)+10;
		if(health > 0)
			p.reduceHealth(damageDealt);
	}
	
	public int getDamageDealt() {
		return damageDealt;
	}
	
	public void reduceHealth(int x) {
		health -= x;
	}
	
	public int getHealth() {
		if(health > 0)
			return health;
		else
			return 0;
	}
	
}
