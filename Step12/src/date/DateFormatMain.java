package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatMain {

	public static void main(String[] args) throws ParseException {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 4);
		//날짜 서식 문자를 이용해서 원하는 형태로 날짜를 문자열로 만들어주는 클래스
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy");//연도 4자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("yy");//연도 2자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MM");//월 2자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("M");//월 1자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MMM");//로컬형식 월
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MMMM");//로컬형식 월
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("dd");//일 2자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("d");//일 1자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("E");//요일 1자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("EEE");//요일 약자(영문으로 3자리) ---> 로컬 형식 한글 X 
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("EEEE");//요일 풀네임(영문이면 영문 풀네임) ---> 로컬 형식 한글 X 
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("H");//시간 1자리 : 24시 기준
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("HH");//시간 2자리 : 24시 기준
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("m");//분 1자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("mm");//분 2자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("s");//초 1자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("ss");//초 2자리
		System.out.println(sdf.format(cal.getTime()));
		
		//2022-12-05 12:35:55
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		//2022년 12월 05일 12시 35분 55초
		sdf.applyPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(cal.getTime()));
		
		sdf.applyPattern("yyyy_MM_dd_HH_mm_ss");
		System.out.println(sdf.format(cal.getTime()));
		Date c =  sdf.parse("2022_05_05_12_48_16");
		System.out.println(c);
	}

}








