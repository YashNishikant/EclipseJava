import java.util.Calendar;
import java.util.Date;

public class time {
	public static void main(String[] args) {

	Calendar cal1 = Calendar.getInstance();
	cal1.setTime(new Date()); 
	cal1.add(Calendar.HOUR_OF_DAY, 5); 
	cal1.getTime();
	System.out.println("5 hrs from now: " + cal1.getTime());
		    
	Calendar cal2 = Calendar.getInstance();
	cal2.setTime(new Date()); 
	cal2.add(Calendar.HOUR_OF_DAY, 11); 
	cal2.getTime();
	System.out.println("India time: " + cal2.getTime());
	
	Calendar cal3 = Calendar.getInstance();
	cal3.setTime(new Date()); 
	cal3.add(Calendar.HOUR_OF_DAY, 336); 
	cal3.getTime();
	System.out.println("Two weeks from now: " + cal3.getTime());
	}
}
