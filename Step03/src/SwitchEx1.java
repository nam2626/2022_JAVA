
public class SwitchEx1 {
	/*
	 * 		switch는 case 옆에 나와있는 값과 일치하면
	 *  	일치하는 순간부터 switch 내부의 코드들을 전부 실행한다(break를 만날때까지)
	 *  
	 *  	switch(값){
	 *  	case 비교값:
	 *  		실행할 코드
	 *  		...
	 *  		[break;]
	 *  	case 비교값:
	 *  		실행할 코드
	 *  		...
	 *  		[break;]
	 *  	default:
	 *  		실행할 코드
	 *  	}
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int no = 5;
		
		switch(no) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("????");
		}
		
	}

}











