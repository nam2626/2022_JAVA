package date;

import java.util.Date;

public class DDay {

	public static void main(String[] args) {
		/*
		 * 오늘 날짜기준으로 연말까지 몇일 남았는지 출력 getTime, 밀리초(1000이면 1초),
		 */
		Date today = new Date(122,11,5);
		System.out.println(today.getTime());
		Date end = new Date(122, 11, 31);
		System.out.println(end.getTime());

		System.out.println((end.getTime() - today.getTime()) / (1000 * 60 * 60 * 24));

	}

}
