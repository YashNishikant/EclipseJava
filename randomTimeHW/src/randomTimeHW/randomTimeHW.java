package randomTimeHW;

public class randomTimeHW {

		public static void main(String[] Args) {

			int range = (1000000 - 500) + 1;
			
			int totalsecond = ((int)(Math.random() * range)+500);
			
			System.out.println("Total Seconds: " + totalsecond);
			
			int days = (totalsecond / (60 * 60 * 24));
			
			int remainingSeconds = (totalsecond % (60 * 60 * 24));
			
			int hours = remainingSeconds/3600;
			remainingSeconds = remainingSeconds % 3600;
			
			int min = remainingSeconds/60;
			remainingSeconds = remainingSeconds % 60;
			
			int seconds = remainingSeconds;
			
			System.out.println("Days: " + days + "\nHours: " + hours + "\nMinutes: " + min + "\nSeconds: " + seconds);
		}
	}
