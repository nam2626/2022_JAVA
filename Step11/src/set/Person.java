package set;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	
	@Override
	public int hashCode() {
		System.out.println("hashcode");
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
