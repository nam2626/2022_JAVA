import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuest6 {
	/*
	 * 	정수형 배열 길이가 10인 배열을 생성한 뒤
	 * 	입력한 숫자가 짝수면 맨뒤에서부터 채우기
	 *  입력한 숫자가 홀수면 맨앞에서부터 채우기
	 *  입력이 끝나면 전체 내용을 출력
	 *  
	 *  숫자 입력 : 1
	 *  [1,0,0,0,0,0,0,0,0,0]
	 *  
	 *  숫자 입력 : 4
	 *  [1,0,0,0,0,0,0,0,0,4]
	 *  
	 *  숫자 입력 : 3
	 *  [1,3,0,0,0,0,0,0,0,4]
	 * 	
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수형 배열 선언
		int[] arr = new int[10];
		//왼쪽, 오른쪽부터 시작할 인덱스 선언
		int s=0,e=arr.length-1;
		
		while(s <= e) {
			System.out.print("숫자 입력 : ");
			int n = sc.nextInt();
			
			if(n % 2 == 0) {
				arr[e--] = n;
			}else {
				arr[s++] = n;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}















