package date;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.AM_PM));
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		
		calendar.set(Calendar.YEAR, 2023);
		System.out.println(calendar.getTime());
		calendar.set(Calendar.DATE, 40);
		System.out.println(calendar.getTime());
		calendar.set(Calendar.MONTH, 40);
		System.out.println(calendar.getTime());
	}

}












