import java.util.Scanner;

public class Quest05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 하나 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 하나 입력 : ");
		int n2 = sc.nextInt();
		
		//case1
		System.out.println(n1 > n2 ? n1 - n2 : n2 - n1);
		//case2
		int result = n1 - n2;
		System.out.println(result < 0 ? -result : result);
		
	}

}
