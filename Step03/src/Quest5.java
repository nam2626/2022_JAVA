
public class Quest5 {
	/*
	 * 	1~100까지의 숫자들 중
	 * 	7과 9의 배수를 출력하시오.
	 *  단 7과 9의 공배수는 한번만 출력되게끔 처리
	 */
	public static void main(String[] args) {
		int i = 1;
		
		while(i < 101) {
			if(i % 7 == 0 || i % 9 == 0)
				System.out.println(i);
			i++;
		}
	}

}
