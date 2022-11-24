import java.util.Arrays;

public class RaggedArrayEx {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		
		arr[0] = new int[4];
		arr[1] = new int[3];
		arr[2] = new int[] {1,2,4,56,76,2,1};
		
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}







