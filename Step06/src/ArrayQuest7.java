import java.util.Arrays;

public class ArrayQuest7 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int j = 0, sw = 1, n = 1;
		for(int i=0;i<arr.length;i++) {
			while(j < arr.length && j >= 0) {
				arr[i][j] = n++;
				j += sw;
			}
			sw = -sw;
			j += sw;
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(Arrays.toString(arr[i]));
	}

}
