import java.util.Scanner;

public class Quest2 {
	/*
	 *  점수 하나를 입력 받아서
	 *  100~95 A+
	 *   94~90 A 
	 *   89~85 B+
	 *   84~80 B
	 *   79~75 C+
	 *   74~70 C
	 *   69~65 D+
	 *   64~60 D
	 *   59~ 0 F
	 *   성적등급을 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 >>> ");
		int score = sc.nextInt();
		
		String result = "F";
		
		if(score >= 90)
			result = "A";
		else if(score >= 80)
			result = "B";
		else if(score >= 70)
			result = "C";
		else if(score >= 60)
			result = "D";
		
		if(score >= 60 && score % 10 >= 5)
			result += "+";
		
		System.out.println(result);
		
	}

}













