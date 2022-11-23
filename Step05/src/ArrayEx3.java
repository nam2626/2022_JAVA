import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		for(int n : arr) {
			System.out.println(n);
			n++;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
