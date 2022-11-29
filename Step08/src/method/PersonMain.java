package method;

public class PersonMain {
	//p는 메모리 주소를 받기 떄문에
	//레퍼런스 형은 원본에 접근해서 값을 변경할 수 있다.
	public static void addAge(Person p) {
		//Person p의 나이값을 하나 증가 저장
		p.setAge(p.getAge() + 1);
	}
	
	public static void main(String[] args) {
		Person s = new Person("홍길동", 20);
		System.out.println(s);
		addAge(s);
		System.out.println(s);
		
	}

}
