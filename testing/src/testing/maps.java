package testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.*;

public class maps {

   ArrayList<Show> showlist;

   public maps(){

       showlist = new ArrayList<Show>();

       File file = new File("C:\\github\\JavaApps\\testing\\src\\testing\\Broadway2022.csv");
       try{
           BufferedReader reader = new BufferedReader(new FileReader(file));
           String temp;
           reader.readLine();

           while((temp = reader.readLine()) != null){
               String[] pieces = temp.split(",");
               try{
                   showlist.add(new Show(pieces[0],pieces[1],pieces[2],pieces[3],Long.parseLong(pieces[4]),Long.parseLong(pieces[5]),Float.parseFloat(pieces[6])));
               }
               catch (Exception e){
            	   System.out.println(e);
               }
           }

           grossByMonth(showlist);
           System.out.println("____________________________________________________________________________________________________________________________");
           grossByType(showlist);
           System.out.println("____________________________________________________________________________________________________________________________");
           attendanceByType(showlist);
           System.out.println("____________________________________________________________________________________________________________________________");
           grossByShowPerWeek(showlist);
           System.out.println("____________________________________________________________________________________________________________________________");
           attendanceByShowPerWeek(showlist);
           System.out.println("____________________________________________________________________________________________________________________________");
           attendanceByTheatere(showlist);
           System.out.println("____________________________________________________________________________________________________________________________");
           grossByTheatere(showlist);
           System.out.println("____________________________________________________________________________________________________________________________");
           percentCapByTypePerWeek(showlist);

       } catch (IOException e) {
           throw new RuntimeException(e);
       }

   }

   void grossByMonth(ArrayList<Show> l){
       System.out.println("Gross Earnings by Month");
       TreeMap<Integer, Long> treeMap = new TreeMap<>();
       
       int c = 0;
       for(Show s : l) {
    	   
           if(!treeMap.containsKey(s.getMonth())){
        	   treeMap.put(s.getMonth(), s.getGross());
           }
           else{
               treeMap.put(s.getMonth(),treeMap.get(s.getMonth())+s.getGross());
           }
       }
       
       for (Long s : treeMap.values()) {
           c++;
           System.out.println(c + ": " + NumberFormat.getCurrencyInstance().format(s));
       }

   }

   void grossByShowPerWeek(ArrayList<Show> l) {

       System.out.println("Gross Earnings by Week Per Show");
       TreeMap<String, ArrayList<Long>> treeMap = new TreeMap<>();
       Set<Map.Entry<String, ArrayList<Long>>> entries = treeMap.entrySet();
	   
       for(Show s : l) {
           if(!treeMap.containsKey(s.getShow())){
        	   
        	   ArrayList<Long> values = new ArrayList<Long>();
        	   for(int i = 0; i < l.size(); i++) {
        		   if(l.get(i).getShow().equals(s.getShow()))
        			   values.add(l.get(i).getGross());
        	   }
        	   
        	   treeMap.put(s.getShow(), values);
           }
       }
       
       Iterator<Map.Entry<String, ArrayList<Long>>> iterator = entries.iterator();
       Map.Entry<String, ArrayList<Long>> entry = null;
       while (iterator.hasNext()) {
           entry = iterator.next();
           System.out.println(entry.getKey());
           
           for(int i = 0; i < entry.getValue().size(); i++) {
        	   System.out.println("\t"+NumberFormat.getCurrencyInstance().format(entry.getValue().get(i)));
           }
           
       }
	   
       TreeMap<String, Long> treeMapTotals = new TreeMap<>();
       Set<Map.Entry<String, Long>> entries2 = treeMapTotals.entrySet();

       for(Show s : l) {
           if(!treeMapTotals.containsKey(s.getShow())){
        	   treeMapTotals.put(s.getShow(), s.getGross());
           }
           else {
        	   treeMapTotals.put(s.getShow(), treeMapTotals.get(s.getShow()) + s.getGross());
           }
       }
       Iterator<Map.Entry<String, Long>> iterator2 = entries2.iterator();
       Map.Entry<String, Long> entry2 = null;
       while (iterator2.hasNext()) {
           entry2 = iterator2.next();
    	   System.out.println(entry2.getKey() + ": "+NumberFormat.getCurrencyInstance().format(entry2.getValue()));
           
       }
       
   }
   
   void grossByType(ArrayList<Show> l){
       System.out.println("Gross Earnings by Type");
       TreeMap<String, Long> treeMap = new TreeMap<>();
       Set<Map.Entry<String, Long>> entries = treeMap.entrySet();

       for(Show s : l) {
           if(!treeMap.containsKey(s.getType())){
        	   treeMap.put(s.getType(), s.getGross());
           }
           else{
               treeMap.put(s.getType(),treeMap.get(s.getType())+s.getGross());
           }
       }

       
       Iterator<Map.Entry<String, Long>> iterator = entries.iterator();
       Map.Entry<String, Long> entry = null;
       while (iterator.hasNext()) {
           entry = iterator.next();
           System.out.println(entry.getKey() + ": " + NumberFormat.getCurrencyInstance().format(entry.getValue()));
       }

   }

    void attendanceByType(ArrayList<Show> l){
        System.out.println("Attendance by Type");
        TreeMap<String, Long> treeMap = new TreeMap<>();
        Set<Map.Entry<String, Long>> entries = treeMap.entrySet();

        for(Show s : l) {
            if(!treeMap.containsKey(s.getType())){
         	   treeMap.put(s.getType(), s.getAttend());
            }
            else{
                treeMap.put(s.getType(),treeMap.get(s.getType())+s.getAttend());
            }
        }
        
        Iterator<Map.Entry<String, Long>> iterator = entries.iterator();
        Map.Entry<String, Long> entry = null;
        while (iterator.hasNext()) {
            entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue() + " people");
        }

    }

    void attendanceByShowPerWeek(ArrayList<Show> l) {

        System.out.println("Attendance by Show Per Week");
        TreeMap<String, ArrayList<Long>> treeMap = new TreeMap<>();
        Set<Map.Entry<String, ArrayList<Long>>> entries = treeMap.entrySet();
 	   
        for(Show s : l) {
            if(!treeMap.containsKey(s.getShow())){
         	   
         	   ArrayList<Long> values = new ArrayList<Long>();
         	   for(int i = 0; i < l.size(); i++) {
         		   if(l.get(i).getShow().equals(s.getShow()))
         			   values.add(l.get(i).getAttend());
         	   }
         	   
         	   treeMap.put(s.getShow(), values);
            }
        }
        
        Iterator<Map.Entry<String, ArrayList<Long>>> iterator = entries.iterator();
        Map.Entry<String, ArrayList<Long>> entry = null;
        while (iterator.hasNext()) {
            entry = iterator.next();
            System.out.println(entry.getKey());
            
            for(int i = 0; i < entry.getValue().size(); i++) {
         	   System.out.println("\t"+entry.getValue().get(i) + " people");
            }
            
        }
 	   
        TreeMap<String, Long> treeMapTotals = new TreeMap<>();
        Set<Map.Entry<String, Long>> entries2 = treeMapTotals.entrySet();

        for(Show s : l) {
            if(!treeMapTotals.containsKey(s.getShow())){
         	   treeMapTotals.put(s.getShow(), s.getGross());
            }
            else {
         	   treeMapTotals.put(s.getShow(), treeMapTotals.get(s.getShow()) + s.getGross());
            }
        }
        Iterator<Map.Entry<String, Long>> iterator2 = entries2.iterator();
        Map.Entry<String, Long> entry2 = null;
        while (iterator2.hasNext()) {
            entry2 = iterator2.next();
     	   System.out.println(entry2.getKey() + ": "+entry2.getValue() + " people");
            
        }
        
    }
    
    void percentCapByTypePerWeek(ArrayList<Show> l) {

        System.out.println("Percent Cap by Week per Type");
        TreeMap<String, ArrayList<Float>> treeMap = new TreeMap<>();
        Set<Map.Entry<String, ArrayList<Float>>> entries = treeMap.entrySet();
 	   
        for(Show s : l) {
            if(!treeMap.containsKey(s.getShow())){
         	   
         	   ArrayList<Float> values = new ArrayList<Float>();
         	   for(int i = 0; i < l.size(); i++) {
         		   if(l.get(i).getShow().equals(s.getShow()))
         			   values.add(l.get(i).getPercentCap());
         	   }
         	   
         	   treeMap.put(s.getShow(), values);
            }
        }
        
        Iterator<Map.Entry<String, ArrayList<Float>>> iterator = entries.iterator();
        Map.Entry<String, ArrayList<Float>> entry = null;
        while (iterator.hasNext()) {
            entry = iterator.next();
            System.out.println(entry.getKey());
            
            for(int i = 0; i < entry.getValue().size(); i++) {
         	   System.out.println("\t"+entry.getValue().get(i) + "%");
            }
            
        }
        
    }
    
    void attendanceByTheatere(ArrayList<Show> l) {
        System.out.println("Attendance by Theatere");
        TreeMap<String, Long> treeMap = new TreeMap<>();
        Set<Map.Entry<String, Long>> entries = treeMap.entrySet();

        for(Show s : l) {
            if(!treeMap.containsKey(s.getType())){
         	   treeMap.put(s.getTheatere(), s.getAttend());
            }
            else{
                treeMap.put(s.getTheatere(),treeMap.get(s.getTheatere())+s.getAttend());
            }
        }
        
        Iterator<Map.Entry<String, Long>> iterator = entries.iterator();
        Map.Entry<String, Long> entry = null;
        while (iterator.hasNext()) {
            entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue() + " people");
        }

    }
    
    void grossByTheatere(ArrayList<Show> l){
        System.out.println("Gross Earnings by Theatere");
        TreeMap<String, Long> treeMap = new TreeMap<>();
        Set<Map.Entry<String, Long>> entries = treeMap.entrySet();
        
        for(Show s : l) {
     	   
            if(!treeMap.containsKey(s.getTheatere())){
         	   treeMap.put(s.getTheatere(), s.getGross());
            }
            else{
                treeMap.put(s.getTheatere(),treeMap.get(s.getTheatere())+s.getGross());
            }
        }
        
        Iterator<Map.Entry<String, Long>> iterator = entries.iterator();
        Map.Entry<String, Long> entry = null;
        while (iterator.hasNext()) {
            entry = iterator.next();
            System.out.println(entry.getKey() + ": " + NumberFormat.getCurrencyInstance().format(entry.getValue()));
        }

    }
    
   public static void main(String[] args) {
       new maps();
   }

}

class Show{

   String Date;
   String Show;
   String Type;
   String Theatere;
   long Gross;
   long Attend;
   float PercentCap;

   public Show(String Date, String Show, String Type, String Theatere, long Gross, long Attend, float PercentCap){
       this.Date = Date;
       this.Show = Show;
       this.Type = Type;
       this.Theatere = Theatere;
       this.Gross = Gross;
       this.Attend = Attend;
       this.PercentCap = PercentCap;
   }

   public int getMonth() {
       String[] pieces = Date.split("/");
       return Integer.parseInt(pieces[0]);
   }

   public String getDate() {
       return Date;
   }

   public void setDate(String date) {
       Date = date;
   }

   public String getShow() {
       return Show;
   }

   public void setShow(String show) {
       Show = show;
   }

   public String getType() {
       return Type;
   }

   public void setType(String type) {
       Type = type;
   }

   public String getTheatere() {
       return Theatere;
   }

   public void setTheatere(String theatere) {
       Theatere = theatere;
   }

   public long getGross() {
       return Gross;
   }

   public void setGross(long gross) {
       Gross = gross;
   }

   public long getAttend() {
       return Attend;
   }

   public void setAttend(long attend) {
       Attend = attend;
   }

   public float getPercentCap() {
       return PercentCap;
   }

   public void setPercentCap(float percentCap) {
       PercentCap = percentCap;
   }

}






