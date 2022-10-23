
public class Villain extends Soop {

	private String evilLaugh;

	public Villain(String name, String job, String superPower, int powerLevel, int pl, int hp, int md, boolean cape, String evilLaugh, String sn) {
		super(name, job, superPower, cape, powerLevel, pl, hp, md, sn);
		this.evilLaugh = evilLaugh;
	}

	public String getEvilLaugh() {
		return evilLaugh;
	}

}
