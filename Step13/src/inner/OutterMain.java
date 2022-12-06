package inner;

import inner.Outter.Inner;

public class OutterMain {

	public static void main(String[] args) {
		Outter outClass = new Outter(200);
		//Outter 클래스가 생성이 되야 Inner 클래스를 생성을 할수 있음
		Inner inClass = outClass.new Inner(100);
		System.out.println(inClass.sum());
		inClass = outClass.new Inner(40);
		System.out.println(inClass.sum());
		
	}

}
