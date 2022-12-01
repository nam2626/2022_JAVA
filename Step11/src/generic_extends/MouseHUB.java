package generic_extends;

public class MouseHUB<T extends Mouse> {
	private T mouse;
	private int dp;
	private int wheel;
	
	public MouseHUB(T mouse, int dp, int wheel) {
		super();
		this.mouse = mouse;
		this.dp = dp;
		this.wheel = wheel;
	}
	
	public void click(int n) {
		mouse.click(n);
	}
	
	public void wheel() {
		mouse.wheel();
	}
}





