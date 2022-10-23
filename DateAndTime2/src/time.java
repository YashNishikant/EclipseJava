import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class time {

	public static void main(String[] args) {

		String dateString = "01/13/2012";
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.US);
		LocalDate date = LocalDate.parse(dateString, dateFormat);
		LocalDate newDate = date.withDayOfMonth(date.getMonth().maxLength());
		System.out.println(newDate);
	}

}
