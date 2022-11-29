package inheritance_01;

public class Person extends Animal{

	public Person() {
		System.out.println("Person 생성자");
	}
	
	public void printAge() {
		System.out.println("이 사람의 나이 : " +age);
	}
	
	public void run() {
		System.out.println("사람이 달립니다.");
	}

	//오버라이딩(재정의) : 재구현(메서드명이 동일, 매개변수 동일, 접근제어자도 동일)
	/*
	 * public void eat() { System.out.println("사람이 밥을 먹습니다."); }
	 */
	@Override
	public void eat() {
		System.out.println("사람이 밥을 먹습니다.");		
	}
	
	
	
}










