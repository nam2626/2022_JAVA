package wrapper;

public class WrapperClass {
	/*
	 * Wrapper 클래스는 primitive 변수 타입을 reference 형으로 바꿀때 사용되는 클래스
	 * 
	 * Wrapper          primitive
	 * Integer <------- int
	 * Double  <------- double
	 * Float   <------- float
	 * Boolean <------- boolean
	 * Character <----- char
	*/
	public static void main(String[] args) {
		Integer n1 = new Integer(100);
		Integer n2 = 200;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n1 + n2);
		
		//Wrapper 클래스 사용법
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		//문자열을 숫자로 변환
		System.out.println(Integer.parseInt("100") * 2);
		System.out.println(Double.parseDouble("3.1415")+1);
	}

}








