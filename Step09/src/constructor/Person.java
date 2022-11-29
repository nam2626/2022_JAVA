package constructor;

public class Person extends Animal{

	private String name;
	
	//자식 생성자가 부모 생성자에 필요한 값을 받아서
	//부모 생성자에게 전달함 --> super(값....) : 부모 생성자를 호출하는 부분
	//자식생성자에서 제일 먼저 실행해야되는 것이 부모 생성자 호출하는 부분
	public Person(int age, String name) {
		super(age);//Animal 생성자 호출하는 부분
		System.out.println("Person(int, String)");
		this.name = name;
	}
	
	public void printPersonInfo() {
		System.out.println(name + " " + age);
	}
	
	
}
