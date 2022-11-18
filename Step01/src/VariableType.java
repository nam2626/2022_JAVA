
public class VariableType {
	/*
	 * 		변수 타입
	 * 			정수형 : byte(1) short(2) int(4) long(8) 
	 * 			실수형 : float(4) double(8)
	 * 			문자형 : char(2)
	 * 			논리형 : boolean(1)
	 */
	public static void main(String[] args) {
		long l = 100L;
		System.out.println(l);
		
		byte b = 127;
		System.out.println(b);
		
		double d = 3.1415;
		System.out.println(d);
		
		float f = 3.1415F;
		System.out.println(f);

		char ch1 = 'A';
		int n = ch1;
		System.out.println(n);
		System.out.println(ch1);
		
		ch1 = 'a';
		n = ch1;
		System.out.println(n);
		System.out.println(ch1);
		
		ch1 = '가';
		n = ch1;
		System.out.println(n);
		System.out.println(ch1);
		
		boolean bl = true;
		System.out.println(bl);
		bl = false;
		System.out.println(bl);
	}

}





