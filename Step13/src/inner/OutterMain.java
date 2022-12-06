package inner;

import inner.Outter.Inner;
import inner.OutterStaticClass.InnerStaticClass;

public class OutterMain {

	public static void main(String[] args) {
		Outter outClass = new Outter(200);
		//Outter 클래스가 생성이 되야 Inner 클래스를 생성을 할수 있음
		Inner inClass = outClass.new Inner(100);
		System.out.println(inClass.sum());
		inClass = outClass.new Inner(40);
		System.out.println(inClass.sum());
		
//		OutterStaticClass out = new OutterStaticClass(100);
		OutterStaticClass.InnerStaticClass in = new OutterStaticClass.InnerStaticClass(200);
		System.out.println(in.sum());
		
		
		
	}

}



