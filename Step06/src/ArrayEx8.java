import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx8 {
	/*
	 * 
	 * 		배열 데이터 삭제 작업
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = new int[5];
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력(-1 입력시 종료) :");
			arr[index] = sc.nextInt();
			
			if(arr[index] == -1) break;
			index++;
			
			if(arr.length == index) {
				//배열 늘리기
				int[] temp = new int[arr.length + 3];
				//복사
				for(int i=0;i<arr.length;i++) {
					temp[i] = arr[i];
				}
				arr = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		//삭제할 숫자를 입력을 받음
		System.out.print("삭제할 숫자 입력 : ");
		int val = sc.nextInt();
		//삭제할 숫자가 있는 배열 인덱스를 찾음
		for(int i=0;i<index;i++) {
			if(arr[i] == val) {
				//배열의 내용 하나씩 땡겨오는 작업
				for(int j=i;j<index-1;j++) {
					arr[j] = arr[j+1];
				}
				//입력이 가능한 인덱스 번호를 하나 감소
				index--;
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}












