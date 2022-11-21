
public class IfEx {
	/*
	 * if문은 조건식이 true면
	 * if문 아래있는 {실행 영역}에 있는 코드를 실행
	 * 조건식 false면 해당 if문을 건너뜀
	 * 
	 * 조건식 : 관계연산자와 논리연산자를 이용한 수식, 결과는 true와 false로 나오는 수식
	 * 
	 * if(조건식){
	 * 		실행할 코드 - 1
	 * 		실행할 코드 - 2
	 * 		실행할 코드 - 3
	 * }
	*/
	public static void main(String[] args) {
		int n = -10;
		
		if(n > 0) {
			System.out.println("n은 양수 입니다.");
		}
		if(n == 0) {
			System.out.println("n은 0 입니다.");
		}
		if(n < 0) {
			System.out.println("n은 음수 입니다.");
		}
		System.out.println("프로그램 종료");
	}

}






