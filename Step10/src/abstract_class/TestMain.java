package abstract_class;

public class TestMain {

	public static void main(String[] args) {
		//추상 클래스는 직접적으로 생성 X
		//Animal animal = new Animal();
		
		Person p = new Person();
		p.eat();
		
		//추상 클래스도 데이터 타입
		Animal a = p;
		a.eat();
	}

}
