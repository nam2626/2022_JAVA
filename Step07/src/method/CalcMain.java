package method;

public class CalcMain {

	public static void main(String[] args) {
		Calcurator cal = new Calcurator();
		
		cal.init(10, 7);
		
		int r = cal.plus();
		System.out.println(r);
		System.out.println(cal.minus());
		System.out.println(cal.multiple());
		System.out.println(cal.divisor());
	}

}
