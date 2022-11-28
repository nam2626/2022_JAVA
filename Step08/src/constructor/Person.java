package constructor;

public class Person {
	//접근제어자 private 해당 클래스 내에서만 접근이 가능
	private String name;
	private int age;

	/*
	 * 	생성자(constructor)
	 * 		생성자는 객체가 하나 생성이 될때 제일 먼저 실행되는 메서드 
	 * 		1. 메서드명이 클래스명과 같다.
	 * 		2. 리턴타입이 없다.
	 */
	//기본 생성자
	public Person(){
		System.out.println("Person 기본 생성자");
	}
	//생성자 - 이름, 나이 --> 객체의 필드를 초기화 하는 용도
	public Person(String n, int a) {
		System.out.println("Person(String, int)");
		name = n;
		age = a;
	}	
	
	public void init(String n, int a) {
		name = n;
		if(a > 0)
			age = a;
	}

	//setter
	public void setAge(int a) {
		if(a > 0)
			age = a;
	}
	public void setName(String n) {
		name = n;
	}
	//getter
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}	
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}





