
public class Operator5 {
	/*
	 *	논리 연산자 : 조건식을 두개이상 사용하거나, 조건식의 결과를 반대로 뒤집을때
	 *
	 * 	AND --> && 
	 *  OR  --> ||
	 *  NOT --> !
	 * 
	 */
	public static void main(String[] args) {
		int n1 = 10, n2 = 5;
//		System.out.println(5 < n1 < 10 );
		//AND 연산 : 조건식1 && 조건식2 --> 양쪽의 조건식의 결과가 둘다 true일때만 true가 되는 연산자
//						    true       true
		System.out.println(n1 > 5 && n2 < 10);
//				            false      true
		System.out.println(n1 < 5 && n2 < 10);
//					        false      true       true
		System.out.println(n1 < 5 && n2 < 10 && n1 != n2);
		//OR 연산 : 조건식1 || 조건식2 --> 양쪽의 조건식의 결과가 하나라도 true면 true가 되는 연산자 
		//					true      false
		System.out.println(n1 > 5 || n2 < 1);
		//					true      true
		System.out.println(n1 > 5 || n2 > 1);
		//NOT 연산 : !(조건식) --> true -> false, false -> true
		System.out.println(!(n1 < n2));
		boolean result = true;
		System.out.println(!result);
		
		
	}

}







