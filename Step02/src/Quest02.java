import java.util.Scanner;

public class Quest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력 : ");
		double r = sc.nextDouble();
		double area = r*r*3.1415;
		
		System.out.println("원넓이 : "+area);
		
	}

}
