package object;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		//1. 메모리 주소가 같은지 확인
		if(this == obj) return true;
		//2. 비교할 객체가 null 인지 체크
		if(obj == null) return false;
		//3. obj 내 타입으로 형변환이 되는지 체크(동일한 클래스인지 체크)
		if(obj instanceof Person) {
			//4. 내용 비교해서 결과를 리턴
			Person temp = (Person) obj;
			return name.equals(temp.name) && age == temp.age; 
		}
		return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
