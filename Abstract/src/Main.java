
import java.util.ArrayList;

public class Main {

	public Main() {
		System.out.println(recur("Community"));
	}

	public static void main(String[] args) {
//		ArrayList<absobj> abs = new ArrayList<absobj>();
//
//		Obj1 a1 = new Obj1(10);
//		// System.out.println(a1.getX() + "\t" + a1.getNum());
//		absobj a2 = new Obj1(7);
//		// System.out.println(a2.getX() + "\t" + a2.getNum());
//		Obj2 a3 = new Obj2(7);
//		// System.out.println(a3.getX() + "\t" + a3.getNum());
//		absobj a4 = new Obj2(5);
//		// System.out.println(a4.getX() + "\t" + a4.getNum());
//		Obj3 a5 = new Obj3();
//		absobj a6 = new Obj3();
//		
//		Obj4 a7 = new Obj4(32, 33, "PEEPEEPPOOPOO");
//		absobj a8 = new Obj4(4,6, "turtle");
//		
//		abs.add(a1);
//		abs.add(a2);
//		abs.add(a3);
//		abs.add(a4);
//		abs.add(a5);
//		abs.add(a6);
//		abs.add(a7);
//		abs.add(a8);
//		
//		for (absobj a : abs) {
//			System.out.println(a.getClass().getName() + ":\t" + a.getX() + "\t" + a.getNum());
//		
//			if(a instanceof Obj4) {
//				System.out.println(((Obj4) a).getStr());
//			}
//			
//		}
//
	}
	public String recur(String s)
	{
	  if (s.length() <= 1)
	  {
	    return "";
	  }
	  System.out.println(s);
	  return recur(s.substring(2)) + s.substring(1,2);
	}
}
