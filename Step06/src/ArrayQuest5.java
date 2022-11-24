import java.util.Scanner;

public class ArrayQuest5 {
	/*
	 * 정수형 배열 길이가 10인 배열을 생성한 뒤
	 * 숫자를 전부 입력을 받은 후 아래와 같이 출력, 숫자0은 짝수로 처리
	 * 
	 * [1,2,3,4,5,6,7,8,9,10] <-- 입력된 데이터
	 * 
	 * 홀수 : 1 3 5 7 9
	 * 짝수 : 2 4 6 8 10
	 * 
	 */
	public static void main(String[] args) {
		//정수형 배열 생성 - 길이 10
		int[] arr = new int[10];
		
		//배열에 숫자 입력 처리
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		//홀수 출력 처리
		System.out.print("홀수 : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 1)
				System.out.print(arr[i] + " ");
		}
		System.out.println();//줄바꿈
		//짝수 출력 처리
		System.out.print("짝수 : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 0)
				System.out.print(arr[i] + " ");
		}
		
	}

}







