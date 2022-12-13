package test3;
import java.awt.desktop.ScreenSleepEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

   ArrayList<Set<Integer>> setlist = new ArrayList<>();

   Set<Integer> set = new HashSet<>();

   public Main(){

       for(int i = 0; i < 10; i++){
           Set<Integer> s = new HashSet<>();

           while(s.size() < 10)
               s.add((int)(Math.random()*20)+1);

           setlist.add(s);
           System.out.println(s);
       }

       for(int i = 0; i < setlist.size(); i++){
           set.addAll(setlist.get(i));
       }

       System.out.println("Final Union: " + set);
       set.clear();

       set = setlist.get(0);
       Set<Integer> s2 = new HashSet<>();
       for(int i = 1; i < setlist.size(); i++){
           set.retainAll(setlist.get(i));
           s2.addAll(set);
       }
       System.out.println("Final Intersection: " + s2);
       set.clear();
       s2.clear();

       ArrayList<Integer> arr = new ArrayList<Integer>();
       for(int i = 0; i < setlist.size(); i++){
    	   for (Integer val : setlist.get(i)) {
    		   if(val%2==0) {
    			   arr.add(val);
    		   }
    	   }
           Set<Integer> s = new HashSet<>();
    	   for (int k = 0; k < arr.size(); k++) {
    		   s.add(arr.get(k));
    	   }
           set.addAll(s);
       }

       System.out.println("Final Union Even " + set);
       set.clear();


       set = setlist.get(0);
       ArrayList<Integer> arr2 = new ArrayList<Integer>();
       for(int i = 1; i < setlist.size(); i++){
    	   for (Integer val : setlist.get(i)) {
    		   if(val%2==0) {
    			   arr2.add(val);
    		   }
    	   }
           Set<Integer> s = new HashSet<>();
    	   for (int k = 0; k < arr2.size(); k++) {
    		   s.add(arr2.get(k));
    	   }
           set.retainAll(s);
           s2.addAll(set);
       }

       System.out.println("Final Intersection Even " + s2);
       set.clear();
       s2.clear();

   }


   public static void main(String[] args) {
       new Main();
   }

}

