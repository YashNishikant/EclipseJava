package Queues;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues{

	String[] pieces;
	
	Queue<Word> queue = new LinkedList<Word>();
	PriorityQueue<Word> pqueue = new PriorityQueue<Word>();
	
	public Queues() {
	
		File f = new File("C:\\github\\JavaApps\\Tasks\\src\\mcpg.txt");

		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
			String temp;
			while ((temp = reader.readLine()) != null) {
				pieces = temp.split(" ");
			}
			
			for(int i = 0; i < pieces.length; i++) {
				queue.add(new Word(pieces[i]));				
				pqueue.add(new Word(pieces[i]));
			}
			
			while(!pqueue.isEmpty()) {
				System.out.println(String.format("%-20s %-20s", queue.poll().getWord(), pqueue.poll().getWord()));
			}
			//modification for reversing: multiply the int result of the overriden compareTo() method by -1
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	void toString(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		new Queues();
	}
	
}

class Word implements Comparable<Word>{
	
	private String w;
	
	public Word(String w) {
		this.w = w;
	}

	public String getWord() {
		return w;
	}
	
	@Override
	public int compareTo(Word o) {
		return getWord().compareTo(o.getWord());
	}
	
}