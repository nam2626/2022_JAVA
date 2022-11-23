import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int n2 = sc.nextInt();
		
		int gcd = 1;
		
		if(n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		for(int i=2;i<=n1;i++) {
			if(n1 % i == 0 && n2 % i == 0)
				gcd = i;
		}
		System.out.println("두수의 최대 공약수 : "+gcd);
		
	}

}
