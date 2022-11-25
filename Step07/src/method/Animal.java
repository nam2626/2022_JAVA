package method;

public class Animal {
	
	
	private int age;
	private boolean gender;

	void init(int a, boolean g) {
		age = a;
		gender = g;
	}
	
	void printAnimalInfo() {
		System.out.println("이 동물의 나이는 "+age + "이고 성별은 " + (gender ? "남성" : "여성"));
	}
}
