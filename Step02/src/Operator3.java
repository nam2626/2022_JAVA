
public class Operator3 {
	/*
	 * 	증감 연산자 : 변수의 값을 1씩 증가, 1씩 감소하는 연산자
	 * 			   = 이 없어도 값을 변경시켜서 저장하는 연산자
	 * 
	 * 		num++	++num	num--	--num
	 * 
	 * 		전위형	++num, --num  num이 속한 연산을 하기전에 증가
	 * 		후위형	num++, num--  num이 속한 연산을 한 후에 증가
	 */
	public static void main(String[] args) {
		int n1, n2;
		n1 = n2 = 10;
		
		System.out.println(n1); //10
		System.out.println(++n1);//11
		System.out.println(n1);//11
		
		System.out.println("----");
		System.out.println(n2);//10
		System.out.println(n2++);//10
		System.out.println(n2);//11
		
		//단독으로 실행할때는 전위든 후위든 상관이없다.
		n1++;
		++n2;
		System.out.println(n1);
		System.out.println(n2);
	}

}







