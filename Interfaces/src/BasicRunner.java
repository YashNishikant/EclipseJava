import java.util.ArrayList;

public class BasicRunner {

	public BasicRunner() {
		BasicClass b1 = new BasicClass();
		b1.setName("Basic");
		System.out.println(b1.getName());
		System.out.println(b1.getNum());
		BasicInterface b2 = new BasicClass();
		System.out.println(b2.getName());
		System.out.println(b2.getNum());
		
		OtherClass b3 = new OtherClass("Other");
		BasicInterface b4 = new OtherClass("Class");
		ArrayList<BasicInterface> basics = new ArrayList<BasicInterface>(); 
		
		basics.add(b1);
		basics.add(b2);
		basics.add(b3);
		basics.add(b4);
		
		for(BasicInterface b: basics) {
			System.out.println(b.getName() + ": " + b.getNum() + "\t" + b.getNum());
		}
		
	}

}
