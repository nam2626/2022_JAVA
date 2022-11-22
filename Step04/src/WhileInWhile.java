
public class WhileInWhile {

	public static void main(String[] args) {
		//구구단 2단부터 9단까지 출력
		int dan = 2;
		
		while(dan < 10) {
			System.out.println("-----------"+dan+"단-----------");
			int i = 1;// 지역변수 해당 영역이 끝나면 사라짐
			while(i < 10) {
				System.out.println(dan +" * " + i + " = " + dan * i);
				i++;
			}
			dan++;
		}
//		System.out.println(i); 
		
	}

}
