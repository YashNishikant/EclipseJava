
public class OtherClass implements BasicInterface {

	private String name;

	public OtherClass(String n) {

	}

	public int getNum() {
		return (int)(Math.random()*25)+1;
	}

	public String getName() {
		return name;
	}

}
