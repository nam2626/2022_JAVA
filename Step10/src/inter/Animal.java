package inter;

public class Animal implements Eat{

	@Override
	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}

}
