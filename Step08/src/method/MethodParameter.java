package method;

import java.util.Arrays;

public class MethodParameter {
	public static int[] addArray(int[] arr) {
		System.out.println(arr);
		for(int i=0;i<arr.length;i++) {
			arr[i] += 1;
		}
		return arr;
	}
	
	
	public static int totalNumber(int...arr) {
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
			sum += arr[i];
		
		return sum;
	}
	
	public static void addNumber(int n) {
		n += 1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		int[] temp = addArray(arr);
		System.out.println(temp);
		System.out.println(Arrays.toString(arr));
		
		int n = 10;
		System.out.println(n);
		addNumber(n);
		System.out.println(n);
		
		int r = totalNumber(1,2,4,5,6);
		System.out.println(r);
		//r = totalNumber(arr,1,3,5); 배열을 보내면 배열만 보내야함
		//System.out.println(r);
	}

}






