package generic_extends;

public class MouseMain {

	public static void main(String[] args) {
		//Mouse 인터페이스를 받는 클래스들만 선언 할수 있다.
		MouseHUB<GamingMouse> hub = new MouseHUB<GamingMouse>(new GamingMouse(), 3200, 5);
		hub.click(2);
	}

}
