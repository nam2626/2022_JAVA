package anonyumous;

public class AnimalMain {
	public static void eat(Animal animal) {
		animal.eat();
	}
	public static void main(String[] args) {
		Animal animal = new Animal() {
			
			@Override
			public void eat() {
				System.out.println("동물이 먹이를 먹습니다.");
			}
		};
		animal.eat();
		Animal human = new Animal() {
			
			@Override
			public void eat() {
				System.out.println("사람이 밥을 먹습니다.");
			}
		};
		human.eat();
		eat(animal);
		eat(human);
		eat(new Animal() {
			
			@Override
			public void eat() {
				System.out.println("누가 밥을 먹습니다.");
			}
		});
	}

}





