import java.util.Calendar;
import java.util.GregorianCalendar;

public class DisplayDateAndTime {

	public static void main(String[] args) {
		
		int second, minute, hour;
		
		GregorianCalendar date = new GregorianCalendar();
		
		date.get(Calendar.DAY_OF_MONTH);
		
		int day, month, year;
		
		month = date.get(Calendar.MONTH);
		
		year = date.get(Calendar.YEAR);
		
		second = date.get(Calendar.SECOND);
		
		minute = date.get(Calendar.MINUTE);
		
		hour = date.get(Calendar.HOUR);

		
	}

}
