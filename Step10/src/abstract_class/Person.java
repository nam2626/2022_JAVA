package abstract_class;

public class Person extends Animal{

	public Person() {
		System.out.println("Person Constructor");
	}
	
	//추상 메서드는 반드시 오버라이딩 해야한다.
	//하지않을려면 자식 클래스도 추상 클래스로 작성
	@Override
	public void run() {
		System.out.println("사람이 달립니다.");
	}
}
