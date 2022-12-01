package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello World");
		System.out.println(str);
		str.append(100);
		System.out.println(str);
		str.append("JAVA");
		System.out.println(str);
		//start 포함, end 포함하지 않음
		str.replace(0, 8, "TEST");
		System.out.println(str);
		str.delete(5, 10);
		System.out.println(str);
		
	}

}






