
public class Operator2 {
	/*
	 * 	복합대입연산자 : 연산 결과를 왼쪽에 있는 변수에 연산 후 저장(누적)
	 * 		+=	-=	*=	/=	%= 
	 * 
	 */
	public static void main(String[] args) {
		int n1=10, n2=7;
		int result = n1 + n2;
		
		System.out.println(result);
		
		result += 5; // result = result + 5
		System.out.println(result);
		
		result -= 7;
		System.out.println(result);

		result *= 2;
		System.out.println(result);
		
		result /= 3;
		System.out.println(result);
		
		result %= 3;
		System.out.println(result);
		
	}

}












