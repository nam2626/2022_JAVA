import java.util.Arrays;

public class ArrayQuest4 {

	public static void main(String[] args) {
		String str = "Hello World";
		char[] arr = str.toCharArray();
		//arr에 저장된 문자열이 알파벳인 경우에는 전부 대문자로 변경후 출력
		for(int i=0;i<arr.length;i++) {
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] -= 32;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
