
public class Soop extends Person {

	private String superPower;
	private int powerLevel;
	private boolean cape;	
	private int powerlevel, hitPoint, maxDamage;
	private String SoopName;
	
	public Soop(String name, String job, String superPower, boolean cape, int powerLevel, int pl, int hp, int md, String sn) {
		super(name, job);
		this.superPower = superPower;
		this.powerLevel = powerLevel;
		this.cape = cape;
		powerlevel = pl;
		hitPoint = hp;
		maxDamage = md;
		SoopName = sn;
	}

	public int hpReduction(int damage) {
		hitPoint -= damage;
		return hitPoint;
	}
	
	public int getHitPoint() {
		return hitPoint;
	}
	
	public int getMaxDamage() {
		return maxDamage;
	}
	
	public void powerLevelMod(int x) {
		powerLevel = x;
	}
	
	public String getPower() {
		return superPower;
	}

	public int getPowerLevel() {
		return powerLevel;
	}

	public boolean wearingCape() {
		return cape;
	}

}
