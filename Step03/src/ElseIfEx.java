
public class ElseIfEx {
	/*
	 * 	else if(조건식){
	 * 		실행할 코드 1
	 * 		실행할 코드 2
	 * 		실행할 코드 3
	 * 	}
	 * 
	 * 	if문으로 구성된 조건문에서
	 *  두번째 조건문부터는 else if를 이용하여 조건문을 구성
	 *  else if와 else는 반드시 if문이 있어야 사용이 가능
	 *  단 else if와 else는 조건문 구성에서 생략이 가능함
	 * 
	 */
	public static void main(String[] args) {
		int age = 15;
		
		//성인 - 20, 고등학생 - 17, 중학생 - 14, 초등학생 - 8, 미취학 아동
		if(age >= 20) {
			System.out.println("성인");
		}
		else if(age >= 17) {
			System.out.println("고등학생");
		}
		else if(age >= 14) {
			System.out.println("중학생");
		}
		else if(age >= 8) {
			System.out.println("초등학생");
		}
		else {
			System.out.println("미취학 아동");
		}
	}

}










