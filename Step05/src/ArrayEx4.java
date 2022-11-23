import java.util.Arrays;

public class ArrayEx4 {

	public static void main(String[] args) {
		String str = "Hello World";
		char[] arr = str.toCharArray();
		
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
		//arr에 저장된 내용을 거꾸로 뒤집어서 저장
		// 0 1 2 3 4 5 6 7 8 9 10
		// H e l l o   W o r l d 
		//
		// d l r o W   o l l e H <--- 배열에 저장
		for(int i=0;i<arr.length/2;i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}







