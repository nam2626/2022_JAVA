
public class ArrayQuest3 {
	/*
	 * 정수형 배열 길이가 10인 배열을 선언할때 
	 * 원하는 값으로 초기화를 한 후에
	 * 배열에 있는 값들 중 짝수와 홀수의 개수를 출력 
	 */
	public static void main(String[] args) {
		int[] arr = {34,5,1,6,23,56,8,34,3,12};
		int even=0, odd=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 0)
				even++;
			else
				odd++;
		}//for
		System.out.println("홀수 개수 : "+odd);
		System.out.println("짝수 개수 : "+even);
	}//main

}




