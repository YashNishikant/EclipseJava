
public class lantern {

	public lantern() {
		triangle();
		newLine();
		triangle();
		bars();
		triangle();
		newLine();
		triangle();
		line();
		bars();
		bars();
		line();
		line();
	}

	public static void main(String[] args) {
		lantern Lantern = new lantern();
	}

	public void newLine() {
		System.out.println();
	}
	
	public void triangle() {
		System.out.println("    *****\n  *********\n*************");
	}

	public void line() {
		System.out.println("    *****");
	}

	public void bars() {
		System.out.println("* | | | | | *\n*************");
	}
}
