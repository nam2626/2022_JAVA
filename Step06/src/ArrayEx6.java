import java.util.Arrays;

public class ArrayEx6 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		System.out.println(arr);
		//arr을 기존 길이가 5인 배열을 10개로 늘리기
		//1. 임시배열을 생성
		int[] temp = new int[10];
		//2. 배열의 내용을 복사	
		for(int i=0;i<temp.length && i<arr.length;i++) {
			temp[i] = arr[i];
		}
		//3. 연결을 바꿔줌
		arr = temp;
		System.out.println(arr);
		System.out.println("이 배열의 길이 : "+arr.length);
		System.out.println(Arrays.toString(arr));
		
		
	}

}



