package date;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date start = new Date(1);
		System.out.println(start);
		Date date = new Date(22, 5, 14);
		System.out.println(date);
		date = new Date(122, 4, 14);
		System.out.println(date);
		
	}

}
