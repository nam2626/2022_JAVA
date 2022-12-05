package map;

import java.util.Objects;

public class Person {
	//이름, 나이
	private String name;
	private int age;
	//생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//equals
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
