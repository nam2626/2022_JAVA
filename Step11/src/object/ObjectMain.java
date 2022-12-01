package object;

public class ObjectMain {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		Dog d1 = new Dog("비숑", 21);
		Dog d2 = new Dog("잡종", 32);
		Dog d3 = new Dog("비숑", 32);
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
	}

}





