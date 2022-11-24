
public class ArrayQuest8 {

	public static void main(String[] args) {
		char[][] arr = new char[5][5];
		
		int col = 2, star = 1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0,c=col;j<star;j++,c++) {
				arr[i][c] = '*';
			}
			if(i < arr.length/2) {
				col -= 1;
				star += 2;
			}else {
				col += 1;
				star -= 2;
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
