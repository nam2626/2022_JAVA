package final_class;
//final 클래스 상속받을 수 없음
//public class Person extends Animal{
public class Person{
	//final method는 재정의가 금지
	public final void eat() {
		System.out.println("사람이 밥을 먹습니다.");
	}
	
}
