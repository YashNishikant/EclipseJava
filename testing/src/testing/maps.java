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
                   showlist.add(new Show(pieces[0],pieces[1],pieces[2],pieces[3],Long.parseLong(pieces[4]),Long.parseLong(pieces[5]),Long.parseLong(pieces[6])));
               }
               catch (Exception e){
               }
           }

           grossByMonth(showlist);
           grossByType(showlist);
           //attendanceByType(showlist);

       } catch (IOException e) {
           throw new RuntimeException(e);
       }

   }

   void grossByMonth(ArrayList<Show> l){
       System.out.println("Gross Earnings by Month");
       TreeMap<Integer, Long> treeMap = new TreeMap<>();

       int c = 0;
       for(Show s : l) {

    	   System.out.println(s.getMonth());
    	   
           if(!treeMap.containsKey(s.getMonth())){
        	   treeMap.put(s.getMonth(), s.getGross());
           }
           else{
               treeMap.put(s.getMonth(),treeMap.get(s.getMonth())+s.getGross());
           }
       }

       System.out.println(treeMap.values());
       
       for (Long s : treeMap.values()) {
           c++;
           System.out.println(c + ": " + NumberFormat.getCurrencyInstance().format(s));
       }

   }

   void grossByType(ArrayList<Show> l){
       System.out.println("Gross Earnings by Type");
       TreeMap<String, Long> treeMap = new TreeMap<>();

       int c = 0;
       for(Show s : l) {
           treeMap.put(s.getShow(), s.getGross());
       }

       for (Long s : treeMap.values()) {
           c++;
           System.out.println(c + ": " + NumberFormat.getCurrencyInstance().format(s));
       }

   }

//    void attendanceByType(ArrayList<Show> l){
//        System.out.println("Attendance by Type");
//        TreeMap<String, Long> treeMap = new TreeMap<>();
//        String[] keyarr = new String[treeMap.size()];
//
//        for (int i = 0; i < treeMap.size(); i++){
//            keyarr[i] =
//        }
//
//            int c = 0;
//        for(Show s : l) {
//            treeMap.put(s.getType(), s.getAttend());
//            System.out.println(c + ": " + moneyString);
//        }
//
//    }

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






