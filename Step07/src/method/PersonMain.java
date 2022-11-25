package method;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		p1.gender = true;
		
		p1.printPersonInfo();
		
		//Person 하나더 생성해서 정보 출력
		Person p2 = new Person();
		p2.name = "김철수";
		p2.age = 33;
		p2.gender = false;
		p2.printPersonInfo();
		
		Person p3 = new Person();
		p3.init("이영희", 50, false);
		p3.printPersonInfo();
	}

}










