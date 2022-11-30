package inter;

public class TestMain {
	public static void eat(Eat e) {
		e.eat();
	}
	public static void main(String[] args) {
		eat(new Animal());
		eat(new Dog());
		eat(new Student());
		eat(new HighSchoolStudent());
	}

}
