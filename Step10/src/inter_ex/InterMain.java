package inter_ex;

public class InterMain {

	public static void main(String[] args) {
		InterClass interClass = new InterClass();
		interClass.interA();
		
		System.out.println(interClass.circleArea(10));
		
		InterA interA = interClass; //인터페이스도 변수 타입으로 선언이 가능, 단 직접적인 생성 X
		interA.interA();
	}

}
