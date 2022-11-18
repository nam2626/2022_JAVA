import java.util.Scanner;

public class Quest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삼각형의 밑변 입력 : ");
		double w = sc.nextDouble();
		System.out.print("삼각형의 높이 입력 : ");
		double h = sc.nextDouble();
		
		double area = w * h / 2.0;
		
		System.out.println(area);
		
		
	}

}
