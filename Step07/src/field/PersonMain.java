package field;

public class PersonMain {

	public static void main(String[] args) {
		//new 메모리 할당하여 Person 객체를 만듬
		Person p1 = new Person();//이때 p1에 name과 age에 메모리가 할당
		System.out.println(p1);
		p1.name = "홍길동";
		p1.age = 20;
		System.out.println(p1.name + ","+p1.age);
		
		Person p2 = new Person();
		System.out.println(p2);
		p2.name = "김철수";
		p2.age = 33;
		System.out.println(p2.name + ","+p2.age);
		
	}

}
