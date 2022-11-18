
public class StringType {

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println(str);
		
		String str1 = "Exit";
		String str2 = new String("Exit");
		String str3 = str1;
		
		//문자열이 저장되어 있는 메모리 주소로 비교, 내용으로 비교하지 X
		System.out.println(str1 == str2); //false
		System.out.println(str1 == str3); //true
		System.out.println(str2 == str3); //false
		
		//문자열 내부 내용으로 비교를 할려면 equals를 사용
		System.out.println(str1.equals(str2));
	}

}






