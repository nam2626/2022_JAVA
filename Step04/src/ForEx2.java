import java.util.Scanner;

public class ForEx2 {
	/*
	 * 숫자 하나를 입력 받은 후
	 * 입력한 숫자에 해당하는 구구단을 출력
	 * 
	 * 숫자 입력 : 2
	 * 2 * 1 = 2
	 * 2 * 2 = 4
	 * ...
	 * 2 * 9 = 18
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan=0;
		System.out.print("단 입력 : ");
		dan = sc.nextInt();		
		
		for(int i=1;i<10;i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}

}







