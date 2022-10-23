
public class Obj2 extends absobj {

	private int num;
	
	public Obj2(int num) {
		super(num % 2);
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}

}
