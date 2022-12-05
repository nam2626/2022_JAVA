package exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(5/1);
			System.out.println(2);
			int[] arr = {1,2,3};
			arr[3]++;
			System.out.println(3);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(4);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(5);
		} catch (Exception e) {
			//모든 종류의 Exception을 처리하는 영역
		}
		System.out.println(6);
	}

}





