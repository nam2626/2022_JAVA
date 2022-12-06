package test;

public class TestMain {

	public static void main(String[] args) {
		System.out.println((int)'\r' + " " + (int)'\n');
		IOTest io = new IOTest();
		System.out.println(io.readline());
//		io.println("안녕하세요");
	}

}
