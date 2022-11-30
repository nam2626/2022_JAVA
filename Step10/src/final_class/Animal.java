package final_class;
//final 클래스는 부모 클래스가 될 수 없음
public final class Animal {
	private int age;

	public Animal(int age) {
		super();
		this.age = age;
	}

	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Animal [age=" + age + "]";
	}
	
	
}
