package ramda;

public class RamdaEx2 {
	public static void calc(int n1, int n2, Calcurator cal) {
		System.out.println(cal.calc(n1, n2));
	}
	public static void main(String[] args) {
		calc(10, 20, new Calcurator() {
			
			@Override
			public int calc(int x, int y) {
				return x - y;
			}
		});
		//곱해서 출력하는 기능을 람다식으로 표현
		calc(4,2,(a,b)->a*b);
	}

}







