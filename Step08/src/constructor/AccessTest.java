package constructor;

public class AccessTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.init("홍길동", 20);
		//p.age = -100;
		p.setAge(100);//외부로부터 데이터를 셋팅할때는 setter를 이용한다.
		p.printInfo();
		
		Person s = new Person("김철수",33);
		s.printInfo();
	}

}
