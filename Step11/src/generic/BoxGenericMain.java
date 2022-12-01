package generic;

public class BoxGenericMain {

	public static void main(String[] args) {
		//제네릭을 사용하면 저장할 수 있는 타입을 객체 생성시 정해줌
		BoxGeneric<Apple> box1 = new BoxGeneric<Apple>();
		
		box1.setObj(new Apple());
		box1.getObj().printApple();
		//box1.setObj(new Orange());
		BoxGeneric<Orange> box2 = new BoxGeneric<Orange>();
		box2.setObj(new Orange());
		Orange o = box2.getObj();
		o.printOrange();
	}

}
