package instance_of;

public class Person extends Animal{
	
	@Override
	public void eat() {
		System.out.println("사람이 밥을 먹습니다.");
	}
	
	public void work() {
		System.out.println("사람이 일을 합니다.");
	}
}
