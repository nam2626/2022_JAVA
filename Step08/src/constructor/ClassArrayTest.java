package constructor;

public class ClassArrayTest {

	public static void main(String[] args) {
		//레퍼런스형 변수 타입은 배열 생성시 객체 생성이 아니라 저장할 수 있는 공간만 만든다. 
		Person[] arr = new Person[10];
		Student[] std = new Student[10];
		System.out.println(arr[0]);
		System.out.println(std[0]);
		
		System.out.println("프로그램 종료");
	}

}
