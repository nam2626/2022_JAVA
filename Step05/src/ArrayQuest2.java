import java.util.Scanner;

public class ArrayQuest2 {
	/*
	 * 정수형 배열 길이가 10개인 배열을 생성한 후 
	 * 정수를 입력받아서 배열에 각 요소에 전부 입력을 한 후
	 * 배열에 있는 값들 중 제일 큰값, 제일 작은값을 출력 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		//데이터 입력
		for(int i=0;i<arr.length;i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		//데이터 처리
		int max, min;
		max = min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(max < arr[i])
				max = arr[i];
			if(min > arr[i])
				min = arr[i];
		}
		//결과 출력
		System.out.println(max);
		System.out.println(min);
	}

}






