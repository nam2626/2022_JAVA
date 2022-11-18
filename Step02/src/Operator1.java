
public class Operator1 {
	/*
	 * 	사칙연산자
	 * 		덧셈			+
	 * 		뺄셈			-
	 * 		곱셈			*
	 * 		나눗셈 몫		/
	 * 		나눗셈 나머지	%
	 * 
	 */
	public static void main(String[] args) {
		//정수형 변수 2개 선언 후 임의 값으로 초기화
		int n1=10, n2=7;
		int result = 0;
		//n1과 n2의 덧셈 결과를 result에 저장, n1,n2의 값은 안바뀜
		result = n1 + n2;
		System.out.println(result);
		result = n1 - n2;
		System.out.println(result);
		result = n1 * n2;
		System.out.println(result);
		result = n1 / n2;
		System.out.println(result);
		result = n1 % n2;
		System.out.println(result);
		
		double d1=3.2114, d2=1.1244;
		double dresult = 0.0;
		
		dresult = d1 / d2;
		System.out.println(dresult);
		dresult = d1 % d2;
		System.out.println(dresult);
		
		
	}

}







