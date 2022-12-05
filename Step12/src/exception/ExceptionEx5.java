package exception;

import java.util.Scanner;

public class ExceptionEx5 {
	public static int div(int n1, int n2) {
		return n1 / n2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("숫자 입력 : ");
			int n1 = sc.nextInt();
			System.out.print("숫자 입력 : ");
			int n2 = sc.nextInt();
			if(n2 == 0)
				//Exception 객체 생성 후 Exception 발생시킴
				throw new Exception("0으로 나눌수는 없습니다.");
			System.out.println(div(n1, n2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");

	}

}


