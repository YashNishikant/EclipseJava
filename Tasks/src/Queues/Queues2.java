package Queues;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Queues2 {

	String[] pieces;
	
	Queue<Car> queue = new LinkedList<Car>();
	PriorityQueue<Car> pqueue = new PriorityQueue<Car>();
	Stack<Car> stack = new Stack<Car>();
	
	public Queues2() {
		File f = new File("C:\\github\\JavaApps\\Tasks\\src\\CarData.txt");

		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
			String temp;
			int i = 0;
			while ((temp = reader.readLine()) != null) {
				i++;
			
				if(i == 1)
					continue;
			
				pieces = temp.split("	");

				stack.push(new Car(pieces[0], pieces[1], pieces[2], pieces[3], pieces[4], pieces[5], pieces[6], pieces[7]));
				queue.add(new Car(pieces[0], pieces[1], pieces[2], pieces[3], pieces[4], pieces[5], pieces[6], pieces[7]));				
				pqueue.add(new Car(pieces[0], pieces[1], pieces[2], pieces[3], pieces[4], pieces[5], pieces[6], pieces[7]));
				
			}
			
			while(!queue.isEmpty()) {
				System.out.println(String.format("%-20s %-20s %-20s", queue.poll().getID(), pqueue.poll().getID(), stack.pop().getID()));
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		new Queues2();
	}
	
}

class Car implements Comparable<Car>{

	private int ID;
	private int MPG;
	private int EngineSize;
	private int HP;
	private int Weight;
	private int Acc;
	private int Country;
	private int NumberCyl;
	
	public Car(String ID, String MPG, String EngineSize, String HP, String Weight, String Acc, String Country, String NumberCyl) {
		this.ID = Integer.parseInt(ID);
		this.MPG = Integer.parseInt(MPG);
		this.EngineSize = Integer.parseInt(EngineSize);
		this.HP = Integer.parseInt(HP);
		this.Weight = Integer.parseInt(Weight);
		this.Acc = Integer.parseInt(Acc);
		this.Country = Integer.parseInt(Country);
		this.NumberCyl = Integer.parseInt(NumberCyl);
		
	}
	
	public int getID() {
		return ID;
	}
	public int getMPG() {
		return MPG;
	}
	public int getEngineSize() {
		return EngineSize;
	}
	public int getHP() {
		return HP;
	}
	public int getWeight() {
		return Weight;
	}
	public int getAcc() {
		return Acc;
	}
	public int getCountry() {
		return Country;
	}
	public int getNumberCyl() {
		return NumberCyl;
	}

	@Override
	public int compareTo(Car o) {

		Integer a = new Integer(getAcc());
		Integer b = new Integer(o.getAcc());
		
		int val = 0;
		
		if(a.compareTo(b) == 0) {
			a = new Integer(getMPG());
			b = new Integer(o.getMPG());
			
			if(a.compareTo(b) == 0) {
				a = new Integer(getHP());
				b = new Integer(o.getHP());
				
				if(a.compareTo(b) == 0) {
					a = new Integer(getEngineSize());
					b = new Integer(o.getEngineSize());
					
					if(a.compareTo(b) == 0) {
						a = new Integer(getWeight());
						b = new Integer(o.getWeight());
						
						if(a.compareTo(b) == 0) {
							a = new Integer(getNumberCyl());
							b = new Integer(o.getNumberCyl());

							if(a.compareTo(b) == 0) {
								a = new Integer(getID());
								b = new Integer(o.getID());

								val = a.compareTo(b);
							}
						}
						else {
							val = a.compareTo(b);
						}
					}
					else {
						val = a.compareTo(b);
					}
				}
				else {
					val = a.compareTo(b);
				}
			}
			else {
				val = a.compareTo(b);
			}
		}
		else {
			val = a.compareTo(b);
		}
	
		return val;
		
	}	
}
