package math;

import java.util.Arrays;

public class Lotto2 {

	public static boolean checkNumber(int[] arr, int n) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == n) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		//로또번호 1셋트를 생성해서 출력
		//로또번호 범위 1~45, 총 6개 숫자를 뽑음, 숫자는 중복 X
		int[] arr = new int[6];
		
		for(int i=0;i<arr.length;i++) {
			int n = (int) (Math.floor(Math.random() * 45) + 1);
			if(checkNumber(arr, n)) 
				i--;
			else
				arr[i] = n;
		}
		System.out.println(Arrays.toString(arr));
	}

}



