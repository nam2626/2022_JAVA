
public class BitOperator {

	public static void main(String[] args) {
		int n1 = 13, n2 = 7;
		//n1 = 0000 0000 0000 0000 0000 0000 0000 1101 
		//n2 = 0000 0000 0000 0000 0000 0000 0000 0111
		
		//bit and operator - 둘다 1일때만 1
		System.out.println(n1 & n2);//0101
		//bit or operator - 둘 중에 하나라도 1이면 1
		System.out.println(n1 | n2);//1111
		//bit xor operator - 서로 다를때만 1
		System.out.println(n1 ^ n2);//1010
		//bit not operator - 1과 0을 뒤집음
		System.out.println(~n1);// -14
		
		//l-shift operator
		System.out.println(n1 << 1);
		System.out.println(n1 << 2);
		System.out.println(n1 << 3);
		
		//r-shift operator
		System.out.println(n1 >> 1);
		System.out.println(n1 >> 2);
		System.out.println(n1 >> 3);
		
		
	}

}









