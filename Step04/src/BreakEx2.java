import java.util.Scanner;

public class BreakEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			
			if(num == 0) 
				break;
			
			sum = num;	
		}
		System.out.println(sum);
		
	}

}





