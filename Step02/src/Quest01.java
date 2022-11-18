import java.util.Scanner;

public class Quest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=0, n2=0;
		
		System.out.print("정수 입력 : ");
		n1 = sc.nextInt();
		System.out.print("정수 입력 : ");
		n2 = sc.nextInt();
		
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);
		
		
	}

}
