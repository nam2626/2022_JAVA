import java.util.Scanner;

public class Quest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 하나 입력 : ");
		int n = sc.nextInt();
		
		String msg = n % 2 == 0 ? "짝수" : "홀수";
		System.out.println(msg);
		
//		System.out.println(n % 2 == 0 ? "짝수" : "홀수");
		
		
	}

}
