
public class Casting {
	/*
	 * 	데이터 형변환 : 데이터 타입을 바꾸는 행위
	 * 	
	 * 		자동으로 데이터 형변환
	 * 			- 수의 체계상 작은 개념이 큰 개념과 계산하는 부분은 자동으로 형변환
	 * 				-> 정수와 실수를 계산했을때 정수가 실수로 형변환됨
	 * 			- 메모리 바이트수가 적은 타입과 큰 타입이 계산 할때 바이트 수가 작은 타입이 큰타입으로 형변환
	 * 		
	 * 		강제로 데이터 형변환 : 데이터 손실이 일어날수 있음
	 * 			- 수의 체계상 큰 개념이 작은 개념으로 바꿔야 할때
	 * 				-> 실수를 정수로 변환할때
	 * 			- 메모리 바이트수가 큰 타입을 적은 타입으로 바꿔야 될때
	 * 				-> double을 float에 저장할때
	 * 
	 */
	public static void main(String[] args) {
		//자동으로 형변환 되는 경우
		int n = 120;
		double d = n; // int형인 n을 double로 형변환해서 d에 저장
		System.out.println(d);
		long l = n; // int형인 n을 long으로 형변환해서 l에 저장
		System.out.println(l);
		
		System.out.println(3.1415 / 2); // 2는 double로 형변환 됨
		System.out.println('A' + 1);
		
		//강제로 형변환 하는 방법  -->   (형변환할 변수타입) 값 or 변수
		double pi = -3.1415;
		int i = (int)pi; //소수점 부분이 사라짐, double 타입인 pi를 int형으로 변경 후 저장
		System.out.println(i);
		
		int t = 65;
		char ch = (char)t;
		System.out.println(ch);
		System.out.println((char)t);
		System.out.println((int)ch);
		
//		double result = 3 + 3.1415f;
		double result = 3 + 3.1415;
		System.out.println(result);
		
	}

}











