package ramda;

public class RamdaEx1 {

	public static void main(String[] args) {
		//Calcurator 익명클래스로 만들어서 덧셈을 하는 기능을 작성
		Calcurator plus = new Calcurator() {
			
			@Override
			public int calc(int x, int y) {
				return x + y;
			}
		};
		//실행 결과 출력
		System.out.println(plus.calc(10, 20));
		//(매개변수) -> 계산식; 계산식 앞에는 return이 생략됨
		Calcurator minus = (a,b) -> a-b;
		System.out.println(minus.calc(5, 6));
		
		Calcurator total = (a,b) -> {
			int sum = 0;
			for(int i=a;i<=b;i++)
				sum += i;
			return sum;
		};
		System.out.println(total.calc(1, 100));
		
	}

}


















