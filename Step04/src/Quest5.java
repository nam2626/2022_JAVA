
public class Quest5 {
	/*
	 * 구구단을 2단~9단까지 출력
	 * 단 짝수단만 출력.
	 * 출력할 구구단은 단까지만 곱한 결과를 출력
	 * 
	 *  2 * 1 = 2
	 *  2 * 2 = 4
	 *  4 * 1 = 4
	 *  4 * 2 = 8
	 *  4 * 3 = 12
	 *  4 * 4 = 16
	 *  ...
	 *  8 * 8 = 64
	 *  
	 *  break, continue 사용해서 구현
	 * 
	 */
	public static void main(String[] args) {
		for(int dan = 2;dan < 10;dan++) {
			if(dan % 2 == 1) 
				continue;
			System.out.println("-----------"+dan+"단-----------");
			for(int i=1;i < 10;i++) {
				System.out.println(dan +" * " + i + " = " + dan * i);
				if(dan == i)
					break;
			}
		}
	}

}













