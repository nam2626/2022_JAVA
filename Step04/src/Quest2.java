import java.util.Scanner;

public class Quest2 {
	/*
	 * 숫자 0을 입력 할때까지
	 * 정수를 입력 받아서
	 * 0을 입력을 하면 입력한 숫자들의 총합과 평균을 출력
	 * 
	 * 숫자 입력 : 1
	 * 숫자 입력 : 5
	 * 숫자 입력 : -1
	 * 숫자 입력 : 2
	 * 숫자 입력 : 0
	 * 
	 * 총합 : 7
	 * 평균 : 1.75
	 * 
	 */
	public static void main(String[] args) {
		int total = 0, count=0;
		Scanner sc = new Scanner(System.in);
		for(int n = -1 ;n != 0;count++) {
			System.out.print("숫자 입력 : ");
			n = sc.nextInt();
			total += n;
		}
		System.out.println(total);
		System.out.println(total/(count-1));
	}

}














