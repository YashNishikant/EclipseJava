
public class BasicClass implements BasicInterface{

	private int num;
	private String name;

	public BasicClass() {
		num = (int)(Math.random()*10)+1;
		name = "Name";
	}
	
	public void setName(String x) {
		name = x;
	}
	
	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}
	
}
