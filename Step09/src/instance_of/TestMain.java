package instance_of;

public class TestMain {

	public static void main(String[] args) {
		Person p = new Person();
		Animal a = p;
		//instanceof
		System.out.println(p instanceof Person);
		System.out.println(a instanceof Dog);
		System.out.println(p instanceof Animal);
		
		//클래스 이름 뽑아서 처리
		System.out.println(p.getClass().getName());
		System.out.println(p.getClass().getTypeName());
		System.out.println(p.getClass().getSimpleName());
		System.out.println(Person.class.getName());
	}

}







