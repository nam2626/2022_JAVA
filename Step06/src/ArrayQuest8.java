
public class ArrayQuest8 {

	public static void main(String[] args) {
		char[][] arr = new char[5][5];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				arr[i][j] = i % 2 == 0 ? '*' : '-';
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
