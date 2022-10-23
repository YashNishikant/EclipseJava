public class SettersAndThis {

public static void main(String[] args) {

	class Robot {
		String name;
		
		public void setName(String newName) {
				name = newName;
		
		}
		
		public String getName() {
			return name;
		}
	}

		Robot robot1 = new Robot();

		robot1.setName("XDr0neZ");


		
		System.out.println(robot1.getName());

}
}