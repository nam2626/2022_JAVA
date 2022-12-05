package exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			//작업이 시작되는 영역
			System.out.println(1);
			System.out.println(5/0);
			System.out.println(2);
		}catch (ArithmeticException e) {
			//Exception이 발생했을때 처리하는 영역
			System.out.println(3);
		}
		System.out.println(4);
	}

}
