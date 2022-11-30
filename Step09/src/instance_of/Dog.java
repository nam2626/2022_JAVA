package instance_of;

public class Dog extends Animal{
	
	@Override
	public void eat() {
		System.out.println("개가 사료를 먹습니다.");
	}
	
	public void run() {
		System.out.println("개가 달립니다.");
	}

}
