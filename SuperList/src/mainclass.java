public class mainclass
{
	public mainclass()
	{
		SuperList<Integer> list=new SuperList<Integer>();

		//This runner will test push(value), add(value), pop(), and poll()

		list.push(10);
		list.push(5);
		System.out.println(list.toString());
		
		//list should have stored values as: {10, 2, 5, 12}

//		System.out.println(list.pop());		//should display 12
//		System.out.println(list.poll());	//should display 10
//		System.out.println(list.pop());		//should display 5
//		System.out.println(list.poll());	//should display 2
//		System.out.println(list.poll());	//should display null
//		System.out.println(list.pop());		//should throw an EmptyStackException

//		list.add(0);
//		list.add(0,10);
//		list.add(list.size(),12);
//		list.add(1,7);

//		//list should have stored values as: {10, 7, 0, 12}
//		for(int x=0;x<list.size();x++)
//			System.out.println(list.get(x));
//
//		System.out.println();
//		System.out.println(list.remove(0));				//should display 10
//		System.out.println(list.remove(list.size()-1));	//should display 12
//		System.out.println(list.remove(1));				//should display 0
//		System.out.println(list.remove(0));				//should display 7
//		System.out.println(list.remove(10));				//should throw IndexOutOfBoundsException or ArrayIndexOutOfBoundsException
	}

	public static void main(String[] args)
	{
		mainclass app=new mainclass();
	}



}