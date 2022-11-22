
public class Quest9 {
	/*
		대문자 A ~ Z 까지 출력
		출력하는 형식
		A - 65
		...
		Z - 90
 
	 */
	public static void main(String[] args) {
		char ch = 'A';
		
		while(ch <= 'Z') {
			System.out.println(ch + " - " + (int)ch);
			ch++;
		}
	}

}













