
public class Final {
	/*
	 * 변수명 지을 때 이름 규칙
	 * 		1. 첫글자는 소문자로 시작
	 * 		2. 변수명을 알보기 쉽게 짓기
	 * 		3. 합성어 라면 두번째 단어부터는 첫글자를 대문자로 작성 
	 * 			- 학생번호   ----> studentNumber
	 * 
	 *  상수명 지을 때 이름 규칙
	 *  	1. 모두 대문자로 작성
	 *  	2. 합성어일 경우 각 단어들 사이에 _로 연결
	 *  		STUDENT_MAX_COUNT
	 */
	public static void main(String[] args) {
		final double PI = 3.1415;
		System.out.println(3 * 3 * PI);
		//PI += 100; 상수로 선언되면 값을 바꿀수 없다.
		
		final int a;
		a = 100;
		//a = 200; 최초에 한번만 저장할 수 있다.
		System.out.println(a);
	}

}










