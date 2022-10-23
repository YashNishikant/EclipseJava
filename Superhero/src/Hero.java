
public class Hero extends Soop {

	private String catchPhrase;

	public Hero(String name, String job, String superPower, int powerLevel, int pl, int hp, int md, boolean cape, String catchPhrase, String sn) {
		super(name, job, superPower, cape, powerLevel, pl, hp, md, sn);
		this.catchPhrase = catchPhrase;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public int getPowerLevel() {
		int a = super.getPowerLevel() + (int) (Math.random() * 10) + 1;
		powerLevelMod(a);
		return a;
	}

}
