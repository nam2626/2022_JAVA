package inheritance_01;

public class Animal {
	private int age;

	public Animal() {
		System.out.println("Animal 생성자");
		age = 20;
	}
	
	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
	
}
